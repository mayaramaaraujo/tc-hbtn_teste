import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    @Test
    void testar_email_com_arroba() throws Exception {
        boolean emailValid = Pessoa.emailValid("email_teste@dominio.com.br");
        assertTrue(emailValid);
    }

    @Test
    void testar_email_sem_arroba() throws Exception{
        boolean emailValid = Pessoa.emailValid("testar_email_sem_arroba");
        assertFalse(emailValid);
    }

    @Test
    void testar_email_mais_50_caracteres() throws Exception {
        boolean emailValid = Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br");
        assertEquals(emailValid, false);
    }
}
