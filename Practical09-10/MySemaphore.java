import java.util.concurrent.Semaphore;
public class MySemaphore {
    public static void main(String[] args) {

        Semaphore sem1 = new Semaphore(1); // 1 разрешение
        CommonResource1 res1 = new CommonResource1();
        new Thread(new CountThread1(res1, sem1, "CountThread1 1")).start();
        new Thread(new CountThread1(res1, sem1, "CountThread1 2")).start();
        new Thread(new CountThread1(res1, sem1, "CountThread1 3")).start();
    }
}
class CommonResource1{

    int x=0;
}

class CountThread1 implements Runnable{

    CommonResource1 res1;
    Semaphore sem1;
    String name1;
    CountThread1(CommonResource1 res1, Semaphore sem1, String name1){
        this.res1=res1;
        this.sem1=sem1;
        this.name1=name1;
    }

    public void run(){

        try{
            System.out.println(name1 + " ожидает разрешение");
            sem1.acquire();
            res1.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name1 + ": " + res1.x);
                res1.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        System.out.println(name1 + " освобождает разрешение");
        sem1.release();
    }
}