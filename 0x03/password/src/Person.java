import java.util.regex.Pattern;

public class Person {
    private String user;
    private String password;

    public Person(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkUser() {
        if(user.length() < 8) {
            return false;
        }

        char[] letras = user.toCharArray();

        for (char letra : letras) {
            String l = Character.toString(letra);
            if (l.matches("\\W")) {
                return false;
            }
        }

        return true;
    }

    public boolean checkPassword() {
        boolean temLetraMaiuscula = false;
        boolean temCaracterEspecial = false;
        boolean temNumero = false;
        boolean ehMaiorQue8 = false;

        if(password.length() >= 8) {
            ehMaiorQue8 = true;
        }

        char[] letras = password.toCharArray();

        for (char letra : letras) {
            String l = Character.toString(letra);
            if (l.matches("\\d")) {
                temNumero = true;
            }

            if(l.matches("[A-Z]")) {
                temLetraMaiuscula = true;
            }

            if (l.matches("\\W")) {
                temCaracterEspecial = true;
            }
        }
        
        return temCaracterEspecial && temNumero && temLetraMaiuscula && ehMaiorQue8;
    }
}
