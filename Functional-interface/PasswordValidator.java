interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && 
               password.matches(".*[A-Z].*") &&
               password.matches(".*\\d.*");
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        String pass = "Hello123";
        System.out.println("Strong Password: " + SecurityUtils.isStrongPassword(pass));
    }
}