package ba.bitcamp.benjamin.pools;

import ba.bitcamp.loger.Logger;

public class Greetings implements Runnable {

	private int id;

	public Greetings(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		int repetitions = 5;
		for (int i = 0; i < repetitions; i++) {
			String message = String.format("Hi I am thread %2d, my count is %2d\n", this.id,
					i);
			if( i > 0 && i % 2 == 0)
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			Logger.log("threadLog", message);
		}
	}

}
