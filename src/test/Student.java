package test;

public class Student {
    int id;
    String name;
    Branch br;
    public Student(int id,String name,Branch br){
        this.id=id;
        this.name=name;
        this.br=br;
    }
    public void Show(){
        System.out.println (this.id );
        System.out.println (this.name);
        System.out.println (this.br.branchcode);
        System.out.println (this.br.branchname );
    }
}
