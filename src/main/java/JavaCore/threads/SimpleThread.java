package JavaCore.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleThread extends Thread {

	private String message;
	private static final Logger log = LoggerFactory.getLogger(SimpleThread.class);


	public SimpleThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		log.info(message);
	}
}
