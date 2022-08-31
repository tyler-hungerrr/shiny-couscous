import java.util.Scanner;

public class Mainclass {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int j = 0;
		System.out.println("Enter value for k ");
		int k = input.nextInt();
		if ((k == 1) || (k == 2)) 
			j = 2 * k - 1;
		else if ((k == 3) || (k == 5)) 
			j = 3 * k + 1;
		else if (k == 4) 
			j = 4 * k - 1;
		else if ((k == 6) || (k == 7) || (k == 8)) 
			j = k - 2;
			
			System.out.println("Value of " + j);
	}
}
