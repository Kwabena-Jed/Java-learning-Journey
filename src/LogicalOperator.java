public class LogicalOperator    {
    public static void main(String[] args){


        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " +(isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn ));


        /*
        * You are to write a program for a university.

A student is allowed to write the final exam ONLY IF:

Attendance is 75% or more

Assignment score is 15 or more

Fees are fully paid (fee = 100)

If all conditions are satisfied → print:

Eligible to write exam

Otherwise:

Not eligible to write exam*/

        int Attendance= 8;
        int Assignment = 2;
        int fee = 10;

        if(Attendance >=75 && Assignment >=15 && fee ==100){
            System.out.println("Eligible to write exam");
        }
        else{
            System.out.println("Not eligible to write exam");
        }
    }

}
