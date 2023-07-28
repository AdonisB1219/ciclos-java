import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String nombre = console.next();
		
		int longitud = nombre.length();

		for (int i = 0; i < longitud; i++) {
			char letra = nombre.charAt(i);
			System.out.println(letra);
		}
		
		console.close();
	}

}
