
class ByThread extends Thread{
	@Override
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" "+(5*i));
		}
	}
}

public class Multithreding01{
	public static void main(String[] args) {
		ByThread bt=new ByThread();
		bt.setName("ByThreadName1");
		bt.start();
		try{
			bt.join();
		}catch(InterruptedException e){
			//System.out.print(e);
		}
	}
}