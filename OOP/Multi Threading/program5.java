class Demo extends Thread{

	public void run(){
		System.out.println("In Demo run");
		System.out.println(Thread.currentThread().getName());
	}
}
class MyThread extends Thread{

	public void run(){
		
		System.out.println("In MyThread run");	
		System.out.println(Thread.currentThread().getName());
		Demo obj = new Demo();
		obj.start();
	}

}
class ThreadDemo5{
	public static void main(String[]args){
	
		System.out.println("In Main");
		System.out.println(Thread.currentThread().getName());
		MyThread obj = new MyThread();
		obj.start();
	}
}
