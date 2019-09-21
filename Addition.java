
public class Addition {
	//int i=10;//instance variable
	
	void add()
	{
	int a=10;
	int b=20;
	int c=a+b;//a,b,c are local variables
	System.out.println("Sum of a and b is ="+ c);
	}
	public static void main(String[] args){
		Addition a=new Addition ();
		a.add();
		
	}

}
