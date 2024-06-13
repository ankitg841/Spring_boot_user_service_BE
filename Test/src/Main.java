import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*  CyclicBarrier barrier = new CyclicBarrier(4);

        Passenger p1 = new Passenger(1000,barrier,"A");
        Passenger p2 = new Passenger(2000,barrier,"B");
        Passenger p3 = new Passenger(3000,barrier,"C");
        Passenger p4 = new Passenger(4000,barrier,"D");

        Passenger p5 = new Passenger(1000,barrier,"E");
        Passenger p6 = new Passenger(2000,barrier,"F");
        Passenger p7 = new Passenger(3000,barrier,"G");
        Passenger p8 = new Passenger(4000,barrier,"H");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();*/

        List<String> queue = new LinkedList<>();


        Thread t1 = new Thread(()->{

            synchronized (queue)
            {
                while(queue.size()==5)
                {
                    wait();
                }
            }

        },"Producer");

        }
    }
