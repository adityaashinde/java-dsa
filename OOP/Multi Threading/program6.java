class Demo6 extends Thread{

	public void run(){
		System.out.println("In Demo : " + Thread.currentThread().getName());
	}
}
class MyThread6 extends Thread{

	public void run(){
		System.out.println("In MyThread : " + Thread.currentThread().getName());

		Demo6 obj = new Demo6();
		obj.start();
	}
}
class ThreadDemo6{
	public static void main(String[]args){

		System.out.println("In Main : " + Thread.currentThread().getName());

		MyThread6 obj = new MyThread6();
		obj.start();	}
}
