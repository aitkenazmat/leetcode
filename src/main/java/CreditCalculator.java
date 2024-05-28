public class CreditCalculator {

    private double interestRate;

    private int loanTerm;



    public CreditCalculator(double interestRate, int loanTerm) {

        this.interestRate = interestRate;

        this.loanTerm = loanTerm;

    }



    public double calculateMonthlyPayment(double loanAmount) {

        double monthlyInterestRate = interestRate / 12 / 100;

        int numPayments = loanTerm * 12;

        double monthlyPayment;
        if (monthlyInterestRate == 0) {

            monthlyPayment = loanAmount / numPayments;

        } else {

            monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numPayments));

        }

        return monthlyPayment;

    }

}
