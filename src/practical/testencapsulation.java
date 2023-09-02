package practical;

public class testencapsulation {

    public static void main(String[] args) {
bank te= new bank ();
te.setAmount (2500);
te.setAccno (52987);
        System.out.println (te.getAccno ()+" : "+te.getAmount () );
    }
}
class bank{
    private int amount;
    private  int accno;
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return amount;
    }
    public void setAccno(int accno){
        this.accno=accno;
    }
    public int getAccno(){
        return accno;
    }
}
