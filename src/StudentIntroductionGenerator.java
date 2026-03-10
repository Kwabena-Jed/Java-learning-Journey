import java.util.Locale;

public class   StudentIntroductionGenerator {
    public static void main(String[] args) {

        String firstName = "Jedidiah";
        String lastName = "Manu";
        String university = "KNUST";

        System.out.println("My name is " + firstName + " " + lastName + "and I study at " + university);

        // Challenge 2

        String FName = firstName.toLowerCase(); // Don't tell me I'm wrong buddy
        String LName = lastName.toLowerCase();

        System.out.println("Username: ".concat(FName).concat("_").concat(LName));


        // Challenge 3

        String name = "Jedidiah";
        String goal = "become a great programmer";

        System.out.println(name.concat(" is working hard to ").concat(goal).concat("."));
    }
}
