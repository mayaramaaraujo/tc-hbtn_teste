import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    Person person;

    @BeforeEach
    void setup() {
       person = new Person("Paul", "McCartney", 2000, true, true, true);
    }

    @Test
    void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary() {
        person.setSalary(1200f);
        assertEquals(14400f, person.calculateYearSalary());
    }

    @Test
    void person_is_MEI() {
        person.setPensioner(false);
        person.setAnotherCompanyOwner(false);
        person.setPublicServer(false);

        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        person.setPensioner(true);
        person.setAnotherCompanyOwner(true);
        person.setPublicServer(true);

        assertFalse(person.isMEI());
    }
}
