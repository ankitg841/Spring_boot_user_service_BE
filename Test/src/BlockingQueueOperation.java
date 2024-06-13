import java.util.LinkedList;
import java.util.List;

public class BlockingQueueOperation {
    List<Integer> queue = new LinkedList<>();

    public synchronized void addElement(Integer item) throws InterruptedException {
        while (queue.size() == 5) {
            wait();
        }
        if (queue.isEmpty()) {
            notifyAll();
        }
        queue.add(item);

    }

    public synchronized void removeElement
}
