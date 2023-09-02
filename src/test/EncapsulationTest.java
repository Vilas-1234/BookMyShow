package test;

public class EncapsulationTest {

    public static void main(String[] args) {
        Account ac=new Account ();
        ac.setAccno (123456789);
        ac.setBalance (25000);
        System.out.println (" Account No =   "+ac.getAccno ()+" \n account Ballance  = " +ac.getBalance ());
        bankCreditandDebit bbb=new bankCreditandDebit ();
        bbb.Credit (ac,5000);
        System.out.println (" Account No =   "+ac.getAccno ()+" \n account Ballance  = " +ac.getBalance ());
        bbb.Debit (ac,10000);
        System.out.println (" Account No =   "+ac.getAccno ()+" \n account Ballance  = " +ac.getBalance ());

    }


}
class Account{
    private int accno;

    public int getAccno() {
        return accno;
    }
    public void setAccno(int accno) {
        this.accno = accno;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    private int balance;
}
class bankCreditandDebit{

    public void Credit( Account ac,int creditamount){
        int credit=ac.getBalance ()+creditamount;
        ac.setBalance (credit);
        System.out.println ("account ballance is credited successfully..." );
    }
    public void Debit(Account ac,int debitamount){
        int withdrow=ac.getBalance ()-debitamount;
        ac.setBalance (withdrow);
        System.out.println ("account ballance is debited successfully..." );
    }
}