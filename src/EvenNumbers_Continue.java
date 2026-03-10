public class EvenNumbers_Continue {

    public static void main(String[] args) {
        int[] k = new int[100];
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 100; i++) {

            if (i % 2 != 0) {
                if (i == 1) continue;
                if (i == 3) continue;
                if (i == 81) break;

                else
                    k[i] = i;
                System.out.println(k[i] + ",");
                sum += i;
                count++;


            }
        }

        double average = (double) sum /count;
        System.out.println("\n The sum of the odd numbers are: " + sum);
        System.out.println("\n There are: " + count + " odd numbers in the array");
        System.out.println("\n The average of the odd numbers are: " + average);

        double variance = 0;
        for (int g = 5; g <= k.length; g++) {
         variance += Math.pow((k[g] - average), 2);

        }

        variance /= count;

        double standardDeviation = Math.sqrt(variance);
        System.out.println("The standard deviation of the odd numbers is: " + standardDeviation);
    }


}
