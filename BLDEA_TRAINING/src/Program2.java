/**
 * 
 */

/**
 * @author Nikita B
 *
 */
import java.util.Scanner;
public class Program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value of n:");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
	}
}
