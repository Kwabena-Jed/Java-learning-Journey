public class JavaStrings{
    public static void main(String[] args){

        // Java Strings
        /*
        * A string variable contains a collection of characters surrounded by double quotes(" ")*/

        String greeting = "Hello World!";

        // String length
        // A string in java is actually an object, which means it contains methods
        // that can perform certain operations on strings.
        // You can find the length of a string with the length() method

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println("The uppercase of the txt string: " + txt.toUpperCase());
        System.out.println("The lowercase of the txt string: " + txt.toLowerCase());

        /*
        The toUpperCase() method converts a string to upper case letters.
        The toLowerCase() method converts a string to lower case letters.
         */


        //Finding a  character in a string
        String pxp = "Please locate where 'locate' occurs!";
        System.out.println(pxp.indexOf("locate"));


        //the charAt() method to access a character at a specific position in a string:

        String idd = "Hello";
        System.out.println(idd.charAt(2));


        // Comparing Strings
        //To compare two strings, you can use the equals() method:

        String txt1 = "Kwame";
        String txt2 = "Kwame";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2));
        System.out.println(txt1.equals(txt3));

        //Removing Whitespace
        // the trim() method removes whitespace from the beginning and the end of a sring:

        String oop = "     Hello World   ";
        System.out.println("Before:[" + oop + "]");
        System.out.println("After:[" + oop.trim() + "]");
    }
}
