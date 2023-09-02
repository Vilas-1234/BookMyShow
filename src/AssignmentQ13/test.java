package AssignmentQ13;

public class test {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.println (" ");
            }
            for (int j = i; j <= i; j++) {
                System.out.println (" *" );
                for (int k =1; k <=i ; k++) {
                    System.out.println (" *" );
                }
                System.out.println ( );
            }
        }
    }
}
