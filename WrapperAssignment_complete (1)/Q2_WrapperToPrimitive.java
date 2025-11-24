public class Q2_WrapperToPrimitive {
    public static void main(String[] args) {
        Double doubleObject = 45.67;
        double primitiveDouble = doubleObject.doubleValue();
        int primitiveInt = (int) primitiveDouble;
        System.out.println("Double object: " + doubleObject);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive int: " + primitiveInt);
    }
}
