package refactoredMortgageCalculator;

public class Main {

    public static void main(String[] args) {
            int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000_000);
            float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 40);
            byte years = (byte) Console.readNumber("Period (Years): ", 1, 40);

            var calculator = new MortgageCalculator(principal,annualInterest, years);
            var report = new MortgageReport(calculator);
            report.printMortgage();
            report.printPaymentSchedule();
        }

}


