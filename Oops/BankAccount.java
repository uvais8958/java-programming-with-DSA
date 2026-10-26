package Oops;

public class BankAccount {
    private double balance;
    //setter
    public void setBalance(double amount){
        if(amount>0){
            balance=amount;
        }else{
            System.out.print("Invalid Amount...");
        }
    }
    //getter
    public double getBalance(){
        return  balance;
    }
    public static void main(String args[]){
        BankAccount acc=new BankAccount();
        acc.setBalance(500);
        System.out.print(acc.getBalance());//500.0
    }

}
