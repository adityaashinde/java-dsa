import java.util.concurrent.*;

class MyThread implements Runnable{

	int num;
	MyThread(int num){
		this.num = num;
	}

	public void run(){
		System.out.println(Thread.currentThread() + "Start Thread " + num);
		dailyTask();
		System.out.println(Thread.currentThread() + "End Thread " + num);
	}

	void dailyTask(){
		try{
			Thread.sleep(4000);
		}catch(InterruptedException ie){
		}
	}
}
class ThreadPool1{
	public static void main(String[]args){

		ExecutorService ser = Executors.newCachedThreadPool();

		for(int i=1; i<=6; i++){
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
