public class Casting {
    public static void main(String[] args) {

        // Java Type Casting
        // Tyoe casting means converting one data tyoe into another.
        // For example turning an int into a double.

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);


        //Set the maximum possible score in the game to 500
        int maxScore = 500;

        // the actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to double to make sure that the division is accurate */
        double percentage = (double)userScore / maxScore * 100.0d;


        System.out.println("User's percentage is " + percentage);


    }
}
