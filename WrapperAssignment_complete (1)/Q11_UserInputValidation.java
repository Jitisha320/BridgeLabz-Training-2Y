public class Q11_UserInputValidation {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] inputs = {"17", "18", "twenty", "25"};
        for (String value : inputs) {
            System.out.println(value + " -> " + isValidAge(value));
        }
    }
}
