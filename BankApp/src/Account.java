public class Account {
    protected int accNum;
    protected double balance;
    protected int pin;

    public Account(int accNum, double initDeposit, int pin){
        this.accNum = accNum;
        this.balance = initDeposit ;
        this.pin = pin;
    }
    public void deposit(double depositAmount, int pin) {
        if(this.pin == pin){
            this.balance += depositAmount;
        }

    }

    public void withdraw(double withAmount, int pin){
        if(this.pin == pin) {
            this.balance -= withAmount;
        }
    }
}

