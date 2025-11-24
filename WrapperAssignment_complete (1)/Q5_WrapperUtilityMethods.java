public class Q5_WrapperUtilityMethods {
    public static void main(String[] args) {
        int intValue = Integer.parseInt("123");
        double doubleValue = Double.parseDouble("3.14");
        boolean boolValue = Boolean.parseBoolean("true");
        String binaryString = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upperCase = Character.toUpperCase('a');

        System.out.println("Integer.parseInt: " + intValue);
        System.out.println("Double.parseDouble: " + doubleValue);
        System.out.println("Boolean.parseBoolean: " + boolValue);
        System.out.println("Integer.toBinaryString: " + binaryString);
        System.out.println("Character.isDigit: " + isDigit);
        System.out.println("Character.toUpperCase: " + upperCase);
    }
}
