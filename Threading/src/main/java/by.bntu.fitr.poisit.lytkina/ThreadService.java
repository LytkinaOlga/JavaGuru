package by.bntu.fitr.poisit.lytkina;

public class ThreadService {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRannable("1"));
        Thread thread2 = new Thread(new MyRannable("2"));
        Thread thread3 = new Thread(new MyRannable("3"));
        Thread thread4 = new Thread(new MyRannable("4"));
        Thread thread5 = new Thread(new MyRannable("5"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        //thread.run(); не создается поток
    }
}
