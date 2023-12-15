public class Checking extends Account{
    int overdraft;

    public Checking(int accNum, double initDeposit, int pin, int overdraft){
            super(accNum, initDeposit, pin);
            this.overdraft = overdraft;
    }
}
