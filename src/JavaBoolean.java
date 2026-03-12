public class JavaBoolean {
    public static void main(String[] args) {
        //JAVA BOOLEANS

        // BOOLEAN VALUES the keyword can only take the values true or false

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Boolean expression. It compares to values using >,< or ==

        int x = 10;
        int y = 9;

        System.out.println(x > y);
        System.out.println(x ==1);

        // Store the result in a boolean variable
        int a = 89;
        int b = 8;

        boolean isGreater = a > b;
        System.out.println(isGreater);

        int myAge = 17;
        int votingAge =18;
        System. out.println(myAge>=votingAge);

        if(myAge >= votingAge) {
            System.out.println("Old enough to vote");
        } else{
            System.out.println("Not old enough to vote");
        }

        int age = 30;
        int minAge = 10;

        System.out.println(age >= minAge);
    }
}
