class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo11{
	public static void main(String[]args)throws InterruptedException{    // sleep() method always throws InterruptedException

		System.out.println(Thread.currentThread());

		MyThread obj = new MyThread();
		obj.start();

		Thread.sleep(5000);		// thread to sleep for 5000 miliseconds

		Thread.currentThread().setName("core2web");
		System.out.println(Thread.currentThread());
	}
}
