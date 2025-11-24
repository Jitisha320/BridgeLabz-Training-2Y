public class Q13_SensorDataLogger {
    public static void logTemperature(Double temp) {
        System.out.println("Logged temperature: " + temp);
    }

    public static void main(String[] args) {
        double primitiveTemp = 36.5;
        Double wrapperTemp = 38.2;
        logTemperature(primitiveTemp);
        logTemperature(wrapperTemp);
    }
}
