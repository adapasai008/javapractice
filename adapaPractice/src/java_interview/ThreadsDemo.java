package java_interview;

class ThreadA extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class ThreadB extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadsDemo {

	public static void main(String[] args){
		ThreadA show = new ThreadA();
		ThreadB show1 = new ThreadB();
		
		show.start();
		
		show1.start();

	}

}
