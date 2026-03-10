public class Arithmetic {
    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(x - y);

        int z = 5;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);

        int a = 10;
        int b = 3;
        System.out.println(a / b);

        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d);

        //Increement and decreement

        int peopleInRoom = 0;

// 3 people enter
        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;

        System.out.println(peopleInRoom); // 3

// 1 person leaves
        peopleInRoom--;

        System.out.println(peopleInRoom); // 2
    }
}
