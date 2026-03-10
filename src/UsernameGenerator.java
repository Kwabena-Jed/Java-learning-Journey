public class UsernameGenerator {
    public static void main(String[] args) {

        String fullName = " Jedidiah Manu";
        fullName = fullName.trim();
        fullName = fullName.toLowerCase();

        int spacePos = fullName.indexOf(" ");
        char firstChar = fullName.charAt(0);
        String lastName = fullName.substring(spacePos + 1);
        String UserName = firstChar + lastName;

        System.out.println(UserName);
    }
}
