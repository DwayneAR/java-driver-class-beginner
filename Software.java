package Software;

public class Software {
	private int myCount;
	private int yourCount;
	public int i;
	
	
	public void addCount(){
		myCount=0;
		yourCount=0;
		for(i=0; i<5; i++){
			myCount=myCount+1;
			yourCount = myCount-2;
			
			System.out.println("My Count = \t" +myCount);
			System.out.println("Your count = \t" +yourCount);
		}
			
	}
	public void ClearCount(){
		
		myCount=0;
		yourCount=0;
	}
	
	public void viewCount(){
			System.out.println("My Count = \t" +myCount);
			System.out.println("Your count = \t" +yourCount);
		
	}
}