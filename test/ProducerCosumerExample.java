import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class ProducerCosumerExample {
	public static void main(String[] args) throws InterruptedException {
        Q q = new Q();
        Thread producerThread = new Thread(() -> {
            try {
                int value = 0;
                while (true) {
                    q.add(value);
                    System.out.println("Produced " + value);
                    value ++;
                    //Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int value = q.poll();
                    System.out.println("Consume " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();
        consumerThread.start();
        
    }
    static class Q {
        private Queue<Integer> list = new LinkedList<>();
        public void add(int value) throws InterruptedException {
            synchronized (this) {
                while (list.size() >= 5) {
                    wait();
                }
                list.add(value);
                notify();
            }
        }
        public int poll() throws InterruptedException {
            synchronized (this) {
                while (list.size() == 0) {
                    wait();
                }
                int value = list.poll();
                notify();
                return value;
            }
        }
    }
}	

