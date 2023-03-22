import java.util.Scanner;

/**
 * 
 */

/**
 * @author Nikita B
 *
 */
public class Program16 {

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
				if( j==0 || j == (n-1) || (i==j)&&i<6 || (i+j==(n-1)&&i<6)   ) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
				for(int j=0;j<n;j++){
					if(  i==0 && j!=0 && j<6|| j==0 && (i<6) || i==(n/2) && j<6 || j==(n/2) && i>5 || i==(n-1)&&j<5  )  {
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				
				
					for(int j=0;j<n;j++){
						if( j==0|| i==0 && j<=5 || j==(n/2)&& i!=0 && i!=(n-1)|| i==(n-1)&&j<5&&j!=6) {
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