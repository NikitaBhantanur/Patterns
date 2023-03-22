import java.util.Scanner;

/**
 * 
 */

/**
 * @author Nikita B
 *
 */
public class ConditionStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age:");
		int age= sc.nextInt();
		if (age<18) {
			System.out.print("Childhood");
		}
		else if(age>65) {
			System.out.print("Old age");
		}
		else {
			System.out.println("Adulthood");
			sc.close();
		}

	}

}
