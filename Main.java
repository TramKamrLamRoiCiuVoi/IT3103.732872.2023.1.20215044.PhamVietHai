
public class Main {

	public static void main(String[] args) {
		
		String myString = printName("Hai");
		System.out.println(myString);
		if(myString.equals("Hello, my name is Hai")) {
			System.out.print("Nice");
		}
		else {
			System.out.print("No");
		}
		
		
	}
	
	private static String printName(String name) {
		return "Hello, my name is " + name;
	}

}
