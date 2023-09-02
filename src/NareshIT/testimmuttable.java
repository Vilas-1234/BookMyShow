package NareshIT;

public  final class testimmuttable {
    private final String name;
    private final long contact;

    public testimmuttable(String name,int contact){
        this.name=name;
        this.contact=contact;
    }
    public String getName(){
       return name;
    }
    public long getContact(){
        return contact;
    }
    public static void main(String[] args) {
        testimmuttable t= new testimmuttable ("vilas",848401017);
        System.out.println (t.name+" "+t.contact );
    }
}
