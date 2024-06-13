import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Passenger extends Thread{

    int duration;
    CyclicBarrier barrier;
    String name;

    public Passenger(int duration,CyclicBarrier barrier,String name)
    {
        super(name);
        this.barrier = barrier;
        this.duration = duration;
    }

    public void run()
    {

        try {
            Thread.sleep(duration);
            System.out.println("Passenger "+Thread.currentThread().getName()+" is waiting");
            int await = barrier.await();
            if(await==0)
            {
                System.out.println("All Passenger reached now cab is start to move");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
