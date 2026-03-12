public class JavaMath {
    public static void main(String[] args){
        // Math.max(x,y)
        // The Math.max(x,y) method can be used to find the highest value of x and y

        Math.max(4,0);
        System.out.println(Math.max(4,0));


        // Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.min(4,0));

        // Math.sqrt(x): used to find the square root of x
        System.out.println(Math.sqrt(7));

        //Math.abs(x,y): returns the absolute positive value of x:
        System.out.println(Math.abs(-6.8));

        //Math.pow(x,y): returns the value of x raised to the power of y
        System.out.println(Math.pow(2,8));

        // Rounding methods. There are three methods; Math.round, Math.ceil, Math.floor:
        // Math.round(x): rounds to the nearest integer
        System.out.println(Math.round(-6.8));

        // Math.ceil(x): rounds up(returns the smallest integer greater than or equal to x)
        System.out.println(Math.ceil(-6.8));

        // Math.floor(x): rounds down (returns the largest integer less than or equal to x):
        System.out.println(Math.floor(-6.8));

        //Math.random(): returns a random number 0.0(inclusive) and 1.0 exclusive
        int randomNum = (int)(Math.random()*101);
        System.out.println(randomNum);

    }
}
