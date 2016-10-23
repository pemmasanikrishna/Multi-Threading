
 class Threading implements Runnable {

	Increment inc ;
	
public Threading(Increment t) {
	inc = t;
}

	@Override
	public void run() {
		inc.increment();
		
	}

}

public class Increment
{
	int val=0;
	Object o = new Object();
	
	
	public  void  increment()
	{
		
			val++;
			System.out.println(val);
		
			
			
	}
	
	public static void main(String[] args) {
		Increment increment = new Increment();
		for(int i=0;i<1000;i++)
			new Thread(new Threading(increment)).start();
		System.out.println("value "+increment.val);
	}

}
