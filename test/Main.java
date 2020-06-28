
public class Main {

    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool(12);

        for (int i = 0; i < 10; i++) {
            Task task = new Task(i);
            pool.execute(task);
        }
    }
}