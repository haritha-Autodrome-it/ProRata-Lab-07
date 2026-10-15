public class IT22261250Lab7Q2A {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++){
			
			for(int j = 1; j <= 5; j++){
				
				System.out.print("$ ");
				
			}
			
			System.out.println();
		}
	}
}

public class IT22261250Lab7Q2B {
	public static void main(String[] args){
		
		for (int i = 1; i <= 5; i++){
			System.out.print(i + " - ");
			
			for (int j = 1; j <= i; j++){
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
}
public class IT22261250Lab7Q2C {
	public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
				
			}
			System.out.println();
			
		}
	}
}