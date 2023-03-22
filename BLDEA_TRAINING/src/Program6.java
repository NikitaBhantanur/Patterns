import java.util.Scanner;
/**
 * @author Nikita B
 *
 */
public class Program6 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value of n:");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"  ");
			}
			System.out.println();
			sc.close();
	}
	}
}
