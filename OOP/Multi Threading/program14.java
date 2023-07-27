// A Yield method is a static method of Thread class and it can stop the currently executing thread 
// and will give a chance to other waiting threads of the same priority.

class MyThread extends Thread
{
	public void run(){
		System.out.println(Thread.currentThread().getName());

		for(int i=0; i<10; i++){
			System.out.println("In thread-0");
		}
	}
}

class ThreadYieldDemo{
	public static void main(String[]args){

		MyThread obj = new MyThread();
		obj.start();

		obj.yield();

		System.out.println(Thread.currentThread().getName());

		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	}
}
