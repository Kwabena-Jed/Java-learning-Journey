public class WarehouseSensors {

    public static void main(String[] args) {

        double[] temperatures = {2.5, 3.0, 15.0, 4.2, -1.0, 22.0, 3.8, 5.0};

        double sum = 0.0;
        int validSensorCount = 0;

        for (int i = 0; i < temperatures.length; i++) {

            if (temperatures[i] <= 10.0) {
                sum += temperatures[i];
                validSensorCount++;
            } else {
                System.out.println("Sensor " + (i + 1) + ": "
                        + temperatures[i] + "°C - ERROR: Reading Ignored");
            }
        }

        double average = sum / validSensorCount;

        System.out.println("\nTotal Valid Sensors Found: " + validSensorCount);
        System.out.println("Final Average Temperature: " + average + "°C");
    }
}
