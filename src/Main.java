public class Main {
    public static void main(String[] args) {
         System.out.println("Hello World!");
        System.out.println("Java is fun!");
        System.out.println("By the help of God I will do my best to master Java this sem!");
        System.out.print("I will surrender my will to Him so He uses me for His great works!");
        System.out.println(" Amen");
        //How to print numbers in java
        /* When printing a number in Java, there is
        * no need to put the number in double quotes.*/
       System.out.println(2 * 3 % 5 - 6);

        // variables
        String name ="John";
        System.out.println(name);

        int myNum =15;
        System.out.println(myNum);

        String firstName = "Jed";
        String lastName = "Manu";
        String fullName = firstName + " " + lastName;
        System.out.println( "Hello Mr. " + fullName);

        int x = 5;
        int y = 6;

        System.out.println("The sum is " + (x + y));

        //Declaring Multiple Variables
        int a = 5, b = 6, c = 50;
        System.out.println(a + b + c);

        //One value to multiple variables
        int d, f, g;
        d = f = g = 50;
        System.out.println(d + g + f);

        //Identifiers
        /*Identifiers are unique names that identifies a variable*/

        int minutesPerHour = 60; // Good

        //CONSTANTS (final keyword)
        /* A variable declared with final becomes constant whicn means unchangeable and read-only */

         /*
        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;


        System.out.println(MINUTES_PER_HOUR);
        */
        //REAL-LIFE EXAMPLES


        //Studemt data
        String studentName = "Godiva Manu";
        int studentID = 21133690;
        int studentAge= 20;
        double studentFee =7009.50;
        char studentGrade = 'A';

        System.out.println("======================================KNUST STUDENT DETAILS==================================");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Fee: " + studentFee);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("=========================THANK YOU. STUDY HARD AND THOU WILT BE GREAT==========================");

        // Creating integer variables
        int length = 4;
        int width = 6;
        int area;

        //Calculating the area of a rectangle
        area= length * width;
        System.out.println("The length of the rectangle is: " + length + "cm" );
        System.out.println("The width of the rectangle is: " + width + "cm");
        System.out.println("The area of the rectangle is: " + area + "cm^2");

        //Java Data Types
     /*
     * Data types are divides into 2 groups
     * 1. Primitive data types: A primitive data type specifies the type of a variable
     * and the kind of values it can hold*/


        //Integer types
        byte mNum = 100;
        System.out.println( mNum);

        float jist = 123456.9090900f;
        double pist = 73245678.123456708765d;
        System.out.println(pist * jist);
    }

}