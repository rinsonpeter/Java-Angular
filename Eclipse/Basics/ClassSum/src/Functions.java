
public class Functions {
	
	public static void main(String ar[]) {
	
		int x=100;
		int y=200;
		int z=300;
		
		Sum s=new Sum();                           
		
		s.calculate(x,y);
		s.display();
		
		s.calculate(z, y);
		s.display(); 
		
		
	}
	

}
