public class Main {
    public static void main(String[] args) {
        HealthProfile h1 = new HealthProfile("Sobhan", "kheder", "1382/07/14", "Boy",20,
                91,187);
        h1.calculateAge();
        h1.maximumHeartRate();
        h1.targetHeartRate();
        h1.BMI();


    }
}