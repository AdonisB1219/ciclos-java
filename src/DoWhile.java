import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int i = console.nextInt();
        int num1 = 0;
        int num2 = 1;
        int res;
        int cont = 0;
        System.out.println(num1);
        System.out.println(num2);
        
        do {
        	res = num1 + num2;
        	System.out.println(res);
        	num1 = num2;
        	num2 = res;
        	cont ++;
        } while(cont < i);
        
        console.close();
        
	}

}
