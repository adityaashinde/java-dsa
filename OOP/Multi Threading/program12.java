// The join() method waits at most this many milliseconds for this thread to die. A timeout of 0 means to wait forever .

class MyThread extends Thread{
	public void run(){

		for(int i=0;i<10;i++){
			System.out.println("In Thread-0");
		}
	}
}
class ThreadDemo12{
	public static void main(String[]args)throws InterruptedException{

		MyThread obj = new MyThread();
		obj.start();

		obj.join();     // If a thread wants to wait until completing of some other thread then we should go for join().

		for(int i=0; i<10; i++){
			System.out.println("In Main");
		}
	}
}
