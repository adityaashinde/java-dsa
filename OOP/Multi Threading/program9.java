// Creating Thread using Runnable Interface

class MyThread implements Runnable{
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThread9 implements Runnable{
	public void run(){
		System.out.println("In run 2");
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo9{
	public static void main(String[]args){

		System.out.println(Thread.currentThread().getName());

		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
		
		MyThread9 obj1 = new MyThread9();
		Thread t1 = new Thread(obj1);
		t1.start();
	}
}
