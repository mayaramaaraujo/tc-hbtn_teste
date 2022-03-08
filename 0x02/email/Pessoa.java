public class Pessoa {
    public static boolean emailValid(String email) {
        return email.contains("@") && email.length() <= 50;
    }
}
