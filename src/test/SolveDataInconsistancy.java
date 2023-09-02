package test;

public class SolveDataInconsistancy {
    public static void main(String[] args) {
        BookSeat bs= new BookSeat ();
        Thread1 t=new Thread1 (bs, 4);
        t.start ();

    }
}
class BookSeat

{
    int totalSeats=10;
    synchronized void BookSeat( int bookseat ,String name){
        if(totalSeats>=bookseat)
        {
            System.out.println (name+" booked "+ bookseat +" successfully...");
            totalSeats=totalSeats-bookseat;
            System.out.println (bookseat +" seats are left... " );
        }else {
            System.out.println (name +" sorry "+" seats are booked" );
        }
    }
}
class Thread1 extends Thread{
    BookSeat bookseats;
    int seats;
    public Thread1(BookSeat bookseats,int seats){
        this.bookseats=bookseats;
        this.seats=seats;
    }
    public void run(){
        currentThread ().setName ("Vilas");
        bookseats.BookSeat (seats,Thread1.currentThread ().getName ());
    }

}
