package dp.command;

import java.util.ArrayList;
import java.util.List;

//https://sourcemaking.com/design_patterns
public class CommandDemo {
	
	public static List produceRequests() {
        List<Command> queue = new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    public static void workOffRequests(List queue) {
        for (Object command : queue) {
            ((Command)command).execute();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List queue = produceRequests();
        workOffRequests(queue);
	}

}
