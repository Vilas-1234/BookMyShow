package practical;

public enum Days {
    Sunday,Monday,Tuseday,Wednesday,thursday,friday ,saturday;

}
class raman{
    void show()

    {
        Days d = Days.Monday;
        System.out.println (d);
    }

    public static void main(String[] args) {
        new raman ().show();
    }


}
