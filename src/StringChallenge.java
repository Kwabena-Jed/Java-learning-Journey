public class StringChallenge   {
    public static void main(String[] args){
        String email = " JEDIDIAH@GMAILCOM ";

        // this line will convert email to lowercase
        email = email.toLowerCase();

        //this line will trim spaces infront of the email
        email = email.trim();

        if(email.indexOf("@") != -1 && email.indexOf(".com") != -1){
            System.out.println("Valid email: " + email);
        }
        else {
            System.out.println("Invalid email address"  );
        }
    }
}
