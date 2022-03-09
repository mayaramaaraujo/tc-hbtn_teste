import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    Person person;

    @BeforeAll
    void setup() {
       person = new Person("PaulMcCartney", "12345678");
    }

    @ParameterizedTest(name = "O usuário {0} é válido?")
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    void check_user_valid(String user) {
        Person person1 = new Person(user, "12345678");
        assertTrue(person1.checkUser());
    }

    @ParameterizedTest(name = "O usuário {0} não é válido?")
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    void check_user_not_valid(String user) {
        Person person1 = new Person(user, "12345678");
        assertFalse(person1.checkUser());
    }

    @ParameterizedTest(name = "A senha {0} não é válida?")
    @ValueSource(strings = {"123456789", "#$%1234"})
    void does_not_have_letters(String password) {
        Person person1 = new Person("PaulMcCartney2", password);
        assertFalse(person1.checkPassword());
    }

    @ParameterizedTest(name = "A senha {0} não é válida?")
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    void does_not_have_numbers(String password) {
        Person person1 = new Person("PaulMcCartney2", password);
        assertFalse(person1.checkPassword());
    }

    @ParameterizedTest(name = "A senha {0} não é válida?")
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    void does_not_have_eight_chars(String password) {
        Person person1 = new Person("PaulMcCartney2", password);
        assertFalse(person1.checkPassword());
    }

    @ParameterizedTest(name = "A senha {0} é válida?")
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    void check_password_valid(String password) {
        Person person1 = new Person("PaulMcCartney2", password);
        assertTrue(person1.checkPassword());
    }

}
