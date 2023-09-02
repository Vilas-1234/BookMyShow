package test;

public class OneToMany {
    public static void main(String[] args) {
        Branch br= new Branch (101, "M.sc");


        Student st= new Student (101,"vilas",br);
        Student st1= new Student (102, "Vipul",br);
        st.Show ();
        System.out.println ("******************" );
        st1.Show ();
    }
}
