package threads;

class HelloJavaThread extends Thread {
	public void run() {
		System.out.println("Hello, Java!");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		HelloJavaThread thread = new HelloJavaThread();
		thread.start();
	}
}
