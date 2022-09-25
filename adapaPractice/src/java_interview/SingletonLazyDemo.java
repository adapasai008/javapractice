package java_interview;

class Lazy {

	static Lazy obj;

	Lazy() {

		System.out.println("Lazy instace is created");

	}

	//Singleton Lazy Instantiation
	public static Lazy getInstace() {

		if (obj == null) {// Double checked locking

			synchronized (Lazy.class) {

				if (obj == null) {

					obj = new Lazy();
				}

			}

		}
		return obj;

	}

}

public class SingletonLazyDemo {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				Lazy.getInstace();
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				Lazy.getInstace();
			}
		});

		t1.start();
		t2.start();

	}

}
