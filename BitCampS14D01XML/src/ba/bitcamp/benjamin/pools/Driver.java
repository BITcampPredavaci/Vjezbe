package ba.bitcamp.benjamin.pools;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ba.bitcamp.loger.Logger;

public class Driver {

	public static void main(String[] args) {
		
		HashMap<String, String> logs = new HashMap<String, String>();
		logs.put("threadLog", "threadLog");
		try {
			new Logger(logs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		int numThreads = 5;
		for (int i = 0; i < numThreads; i++) {
			es.submit(new Greetings(i));
			//new Thread(new Greetings(i)).start();
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		es.submit(new Greetings(6));
		es.shutdown();
		while(!es.isTerminated()){};
		Logger.log("threadLog", "Sve gotovo"); 
		System.out.println("test");
	}

}
