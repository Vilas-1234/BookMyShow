package test;
public class testencapsulation {
    public static void main(String[] args) {
        Bank b= new Bank ();
        b.setAccno (59928);
        b.setAmount (50000);
        System.out.println ("-----------------" );
        creditdebit cd= new creditdebit ();
            cd.withdraw (b,9800);
        cd.credit (b,6800);
        System.out.println (b.getAccno ()+"  "+ b.getAmount ( ) );
//        System.out.println (cd.withdraw (59928,5655); );
    }
}
class Bank {
    private int amount;
    private int accno;
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAccno(int accno) {
        this.accno = accno;
    }
    public int getAccno() {
        return accno;
    }
}
class creditdebit{
    void  credit(Bank acc, int credit){
        int total = acc.getAmount ( )+credit;
        acc.setAmount (total );
    }
    void withdraw(Bank  acc, int debit){
        int  total= acc.getAmount ( )-debit;
        acc.setAmount (total);
    }
}
