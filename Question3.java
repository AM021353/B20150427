public class Question3{

	public static void main (String[] args){
		Thread a = Thread.currentThread();
		new Thread1A();
		int i;
		for(i=0;i<10;i++){
			System.out.println("ThreadB");
			try{
				a.sleep(1000);
			}catch(Exception e){}
		}
	}
}