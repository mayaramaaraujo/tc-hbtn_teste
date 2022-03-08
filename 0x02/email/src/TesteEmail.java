import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteEmail {

    @Test
    void testar_email_com_arroba() {
        boolean emailValid = Pessoa.emailValid("email_teste@dominio.com.br");
        Assertions.assertTrue(emailValid);
    }

    @Test
    void testar_email_sem_arroba() {
        boolean emailValid = Pessoa.emailValid("testar_email_sem_arroba");
        Assertions.assertFalse(emailValid);
    }

    @Test
    void testar_email_mais_50_caracteres() {
        boolean emailValid = Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br");
        Assertions.assertEquals(emailValid, false);
    }
}
