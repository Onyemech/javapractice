public class Print5 {

	public static void main(String[] args) {
	
		for(int count = 1; count <= 5; count++) {

			for(int counter = 5; counter >= count; counter--)
				System.out.print(counter);
				System.out.println(" ");
		}
	}
}