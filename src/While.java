	import java.util.Scanner;

	public class While {
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        int cont = 1;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	                
	        System.out.println("Multiplication Table of " + num);
	        
	        while (cont <= 20) {
	        	int res = cont*num;
	        	System.out.println(cont + "*" + num + "=" + res);
	        	cont ++;
	        }
	        
	        console.close();
	       //TODO implement While loop to get print result
	    }
	}