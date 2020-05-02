public class Account{
    private double balance;

    //Set balance to 0//
    public Account(){
        balance = 0.0;
    }

    //Depositing amount//
    public void deposit (double amount){
        balance = balance + amount;
    }
    //WithDrawing amount//
    public void withdraw (double amount){
        if(amount <= balance) {

            balance = balance - amount;
        }else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

}