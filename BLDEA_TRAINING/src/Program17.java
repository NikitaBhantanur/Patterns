import java.util.Scanner;

/**
 * 
 */

/**
 * @author Nikita B
 *
 */
public class Program17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
 		System.out.print("Enter a value of n:");
 		int n= sc.nextInt();
 		for(int i=0;i<n;i++){
 			for(int j=0;j<n;j++){
				if(j==0||i==j||j==(n-1)) {
 				System.out.print("*");
 		}
		        else{
					System.out.print(" ");
				}
 			}
 			for(int j=0;j<n;j++){
				if(i==0||j==(n/2)|| i==(n-1)) {
 				System.out.print("*");
 		}
		        else{
					System.out.print(" ");
				}
 			}
 			for(int j=0;j<n;j++){
				if(j==0|| i+j==(n/2)|| i-j==(n/2)) {
 				System.out.print("*");
 		}
		        else{
					System.out.print(" ");
				}
 			}
 			for(int j=0;j<n;j++){
				if(i==0||j==(n/2)|| i==(n-1)) {
 				System.out.print("*");
 		}
		        else{
					System.out.print(" ");
				}
 			}
 			
 			for(int j=0;j<n;j++){
				if(j==(n/2)|| i==0) {
 				System.out.print("*");
 		}
		        else{
					System.out.print(" ");
				}
 			}
 			for(int j=0;j<n;j++){
				if(j==0&&i!=0||i==0&&j<7||j==(n/2)||i==(n/2) &&j<8) {
 				System.out.print("*");
 		}
		        else{
					System.out.print(" ");
				}
 			}
 			
 			
 			
 		System.out.println();
 		sc.close();
 	}	 
}
}
