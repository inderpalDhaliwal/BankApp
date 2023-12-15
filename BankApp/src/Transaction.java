public class Transaction{
    String status;
    String type;
    double amount;


    public Transaction(String status, String type, double amount){
        this.status = status;
        this.type = type;
        this.amount = amount;
    }
    public void printTransaction(){
        System.out.println(status + type + amount);
    }
}
