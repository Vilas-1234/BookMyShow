package test;

public class testdependancyinjection {
    public static void main(String[] args) {
        Bank1 ac= new Bank1 (12345,"vilas manik pokarne",25000);
        transaction tt= new transaction ();
        tt.deposit (ac,5000);
    }
}
class Bank1{
    int acc;
    String holdername;
    int ballance;
    Bank1(int acc1,String holdername1,int ballance1){
        this.acc=acc1;
        this.holdername=holdername1;
        this.ballance=ballance1;
    }
}
class transaction{
    void deposit(Bank1 account,int amount){
       account.ballance=account.ballance+amount;
        System.out.println ("account holder name : = "+account.holdername );
        System.out.println ( "account holder acount number : = "+account.acc);
        System.out.println ( " total account ballance : = "+account.ballance);
        if(amount< account.ballance){
            System.out.println ("Transaction succuss" );
        }else {
            System.out.println ("transaction failed " );
        }
    }
}