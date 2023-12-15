public class Saving extends Account{
    double interestRate;

    public Saving(int accNum, double initDeposit, int pin) {
        super(accNum, initDeposit, pin);
        interestRate = 1.05;
    }
    public void applyRate(){
        balance *= interestRate;
    }
}
