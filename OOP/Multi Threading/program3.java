class MyThread extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
		System.out.println("priority run");

		try{
			Thread.sleep(2000);
		}catch(InterruptedException ie){
			}
		}
	}
}
class ThreadDemo3{
	public static void main(String[]args)throws InterruptedException{

		MyThread obj = new MyThread();
		obj.start();

		for(int i=0; i<10; i++){
			System.out.println("priority main");
			Thread.sleep(2000);
		}

	}
}
