import java.util.Scanner;

public class LabExperiments {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of experiments: ");
        int numExperiments = input.nextInt();

        double totalAverages = 0;

        for (int i = 1; i <= numExperiments; i++) {

            System.out.println("\nExperiment " + i);

            System.out.print("Enter Morning Temperature: ");
            double morningTemp = input.nextDouble();

            System.out.print("Enter Evening Temperature: ");
            double eveningTemp = input.nextDouble();

            double average = (morningTemp + eveningTemp) / 2;

            totalAverages += average;

            if (average > 100) {
                System.out.println("Experiment " + i + ": " + average + "°C - STATUS: UNSTABLE");
            } else {
                System.out.println("Experiment " + i + ": " + average + "°C - STATUS: NORMAL");
            }
        }

        double grandAverage = totalAverages / numExperiments;

        System.out.println("\nFinal Grand Average Temperature: " + grandAverage + "°C");

        input.close();
    }
}
