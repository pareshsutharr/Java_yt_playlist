class bankaccount{
    double balance;
    double acno;
    String name;
    String accounttype;
    bankaccount(String nm,String actype,double amount,double ac){
        balance = amount;
        name = nm;
        accounttype = actype;
        acno = ac;
    }
    void deposite(double amount){
        if (amount>0) {
            balance = balance + amount;
            System.out.println(amount+" Deposited Amount Succesfully...");
        }
        else{
            System.out.println("Check Your Amount ... And Try Again");
        }
    }
    void withdraw(double amount){
        if (amount<=balance) {
            balance = balance - amount;
           System.out.println(amount + " Withdraw Amount Succesfully...");

        }
        else{
            System.out.println("Insufficient Balance Try lower Amount");
        }
    }
    void checkbalance(){
        System.out.println("Your Balance is : "+balance);
    }
    void accountdetails(){
        System.out.println("Account Number : "+acno);
        System.out.println("Account Holder Name : "+name);
        System.out.println("Account Type : "+accounttype);
        System.out.println("Current balance : "+balance);
    }
}
public class AtmComputing {
    public static void main(String[] args) {
        bankaccount sbi = new bankaccount("paresh", "Saving", 10000, 11111111111d);
        sbi.accountdetails();
        sbi.withdraw(500);
        sbi.checkbalance();
        sbi.deposite(100000);
        sbi.checkbalance();
    }
}
