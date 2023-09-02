package NareshITcollection;

 class test {
   private int id;
    private String name;
    private String clgname;
    test(int id,String name,String clgname){
        this.id=id;
        this.name=name;
        this.clgname=clgname;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getClgname(){
        return clgname;
    }
    @Override
    public String  toString(){
       return "test [id="+id+",name="+name+",clgname="+clgname+"]";
    }

    public static void main(String[] args) {
        test1 t1= new test1 ();
        t1.show ();
    }
}
