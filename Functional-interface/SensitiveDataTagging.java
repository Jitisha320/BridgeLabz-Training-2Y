interface SensitiveData {}

class UserInfo implements SensitiveData {
    String username;
    String password;

    UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        UserInfo user = new UserInfo("deepti", "abc123");
        if (user instanceof SensitiveData)
            System.out.println("Sensitive data detected — apply encryption.");
    }
}