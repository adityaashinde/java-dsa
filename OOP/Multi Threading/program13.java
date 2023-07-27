// Deadlock condition
// No Output

class MyThread extends Thread{

		static Thread nmMain = null;

		public void run(){
			try{
				nmMain.join();
			}
			catch(InterruptedException obj){
				System.out.println("In Thread-0");
			}
			for(int i=0; i<10; i++){
				System.out.println("In Thread-0");
			}
	}
}
class ThreadDemo13{
	public static void main(String[]args)throws InterruptedException{

		MyThread.nmMain = Thread.currentThread();

		MyThread obj = new MyThread();
		obj.start();

		obj.join();

		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	}
}

// blank output
