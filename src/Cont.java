import java.util.ArrayList;

public class Cont {
    public static void main(String[] args) {

        //Java Boolean Data Types
        boolean isJavaFun = true;
        boolean isFishyTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishyTasty);


        // JAVA CHARACTERS
        // The char data type is used to store a single character.
        char myGrade = 'B';
        System.out.println(myGrade);

    // REAL LIFE EXAMPLE

        //create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items *costPerItem;
        char currency = '$';

        //print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem);
        System.out.println("Total cost: " + totalCost + currency);


        // NON-PRIMITIVE DATA TYPES
        //They are called so because they refer to objects
        //Non Primitive starts with an upper case, just as primitive starts with small case

        // the var keyword

        var x = 5;
        System.out.println(x);



    }
}
