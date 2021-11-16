package dp.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://sourcemaking.com/design_patterns
public class MediatorDemo {

	public static void main(String[] args) {
        List<Thread> colleagues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER for exit");
        Mediator mb = new Mediator();
        colleagues.add(new Thread(new Producer(mb)));
        colleagues.add(new Thread(new Producer(mb)));
        colleagues.add(new Thread(new Consumer(mb)));
        colleagues.add(new Thread(new Consumer(mb)));
        colleagues.add(new Thread(new Consumer(mb)));
        colleagues.add(new Thread(new Consumer(mb)));
        for (Thread p : colleagues) {
            p.start();
        }
        boolean stop = false;
        String exit = scanner.nextLine();
        while (!stop) {
            if (exit.equals("")) {
                stop = true;
                for (Thread p : colleagues) {
                    //noinspection deprecation
                    p.stop();
                }
            }
        }
	}

}
