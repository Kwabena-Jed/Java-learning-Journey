public class BankLoanCalculator {
    public static void main(String[] args) {
        int packageA = 5000;
        int packageB = 12000;

        System.out.println("The maximum package is " + Math.max(packageA, packageB));
        System.out.println("The minimum package is " + Math.min(packageA, packageB));

        int custDebt = -320;

        System.out.println("You owe  " + Math.abs(custDebt));

        int principal = 60000;
        double interestRate = 0.18;
        int years = 3;

        double total;
        total = principal * Math.pow(1 + interestRate,years);

        System.out.println("Your total interest is  " + Math.round(total));
        System.out.println("Your total interest is  " + Math.ceil(total));
        System.out.println("Your total interest is  " + Math.floor(total));


        System.out.println("The square root of  144 is: " + Math.sqrt(144));

        int random = (int)(Math.random()*9000) + 1000;
        System.out.println("Your reference number is:  " + Math.abs(random));
    }
}
