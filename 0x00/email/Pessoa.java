public class Pessoa {
    public static boolean emailValid(String email) {
        if(email.contains("@") && email.length() <= 50) {
            return true;
        }

        return false;
    }
}
