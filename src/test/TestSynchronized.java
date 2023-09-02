package test;

public class TestSynchronized {
    public static void main(String[] args) {
        try {

            College clg = new College ( );
            Addmision ad1 = new Addmision (clg, 2);
            ad1.setName ("Vilas");
            ad1.start ( );
            Thread.sleep (2000);
            Addmision ad2 = new Addmision (clg, 5);
            ad2.setName ("Vishal");
            ad2.start ( );
            Thread.sleep (2000);
            Addmision ad3 = new Addmision (clg, 3);
            ad3.setName ("Pragati");
            ad3.start ( );
            Thread.sleep (2000);
            Addmision ad4 = new Addmision (clg, 4);
            ad4.setName ("Pranali");
            ad4.start ( );
            Thread.sleep (2000);
            Addmision ad5 = new Addmision (clg, 2);
            ad5.setName ("Sneha");
            ad5.start ( );


        }catch (Exception e){
            System.out.println (e);
        }
    }

}
class College {
    int totalAddmission=15;
    public void getAddmission(int addmisionseats,String name){
       synchronized (this){
            if(totalAddmission>addmisionseats) {
                System.out.println (name + "  "+addmisionseats+ "  addmision taken successfully ");
                totalAddmission=totalAddmission-addmisionseats;
                System.out.println (totalAddmission+ "  addmisionseats are available ");
            }
            else {
                System.out.println ("sorry  " +name+ "    addmision seats are left   "+ totalAddmission+" sothat " +
                        "addmissions " +
                        "are closed ");
            }
        }
    }
}
class  Addmision extends Thread{
    College clg;
     int addmisionseats;
     public Addmision (College clg,int addmisionseats)
    {
         this.addmisionseats=addmisionseats;
         this.clg=clg;
     }
     public void run(){
         clg.getAddmission (addmisionseats, currentThread ( ).getName ( ));
     }
}