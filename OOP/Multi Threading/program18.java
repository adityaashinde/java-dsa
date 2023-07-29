class MyThread extends Thread{
	
	MyThread(ThreadGroup tg, String str){
		super(tg, str);
	}

	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}

class ThreadGroup18{
	public static void main(String[]args){

		ThreadGroup pThreadGrp = new ThreadGroup("core2web");	// creation of ThreadGroup

		MyThread S1 = new MyThread(pThreadGrp, "C/CPP");
		MyThread S2 = new MyThread(pThreadGrp, "Java");

		S1.start();
		S2.start();

		ThreadGroup cThreadGrp1 = new ThreadGroup(pThreadGrp, "Incubator");	// creation of child ThreadGroup
		
		MyThread S3 = new MyThread(cThreadGrp1, "fluttor");
		MyThread S4 = new MyThread(cThreadGrp1, "ReactJS");

		S3.start();
		S4.start();

		ThreadGroup cThreadGrp2 = new ThreadGroup(pThreadGrp, "Biencaps");	// creation of 2nd child ThreadGroup
		
		MyThread S5 = new MyThread(cThreadGrp2, "freelancing");
		MyThread S6 = new MyThread(cThreadGrp2, "projects");

		S5.start();
		S6.start();

		cThreadGrp1.interrupt();
		cThreadGrp2.interrupt();

		System.out.println(pThreadGrp.activeCount());
		System.out.println(pThreadGrp.activeGroupCount());
	}
}
