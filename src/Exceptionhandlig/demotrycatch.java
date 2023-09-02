package Exceptionhandlig;

import javax.naming.InsufficientResourcesException;

public class demotrycatch {

}
class account{
    int accno;
    String holdername;
    String actype;
    int accbal;
    account(int accno,String  holdername,String actype,int accbal ){
        this.accno=accno;
        this.holdername=holdername;
        this.actype=actype;
        this.accbal=accbal;
    }
}
class transcaction{
    void transfer(account acc,int amount){
        try{
        System.out.println ("Transacttion details" );
        System.out.println ("_________________" );
        System.out.println ("account number = "+acc.accno );
        System.out.println ("account holdername  = "+acc.holdername );
        System.out.println ("account type = "+acc.actype );
        System.out.println ("account balance = "+acc.accbal );
        System.out.println ("whithdral ammount  = " + amount );
        if(acc.accbal>amount){
            acc.accbal=acc.accbal-amount;
            System.out.println ("total balance  = "+acc.accbal );
            System.out.println (" transaction success..." );
        }else {
            System.out.println ("total balance = "+acc.accbal );
            System.out.println ("transacttion failed...." );
       throw new InsufficientResourcesException ( "fund are not sufficient in your acc pls enter valid amount" );
        }
    }
    catch (InsufficientResourcesException e){
        System.out.println (e.getMessage ());
    }
        finally {
            System.out.println ("thanks visit again...." );
        }
        }
}
class raj{
    public static void main(String[] args) {
        account ac = new account (1234, "Vilas manik pokarne", "Savving", 25000);
        transcaction t=new transcaction ();
        t.transfer (ac,12000);

    }
    }

