public class StringConcatenation {
    public static void main(String[] args) {
        // String Concatenation

        // The + operation can be used between strings to combine them.

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
       int age = 25;

       System.out.println("My name is " + firstName + " and I am " + age + "years old.");

       // The concat() Method
        // You can use the concat() method to concatenate strings:

        String fName = firstName;
        String lName = lastName;
        System.out.println(fName.concat(lName));


        String a = "Java";
        String b = "is";
        String c = "fun";
        String result = a.concat(b).concat(c);
        System.out.println(result);

    }
}
