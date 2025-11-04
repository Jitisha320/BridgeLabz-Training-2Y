@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartLightDemo {
    public static void main(String[] args) {
        LightAction motionSensor = () -> System.out.println("Motion detected → Lights ON");
        LightAction nightMode = () -> System.out.println("Night mode → Dim warm lights ON");
        LightAction voiceCommand = () -> System.out.println("Voice command → Colorful lights ON");

        motionSensor.activate();
        nightMode.activate();
        voiceCommand.activate();
    }
}