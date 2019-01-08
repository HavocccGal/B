import java.util.*;
public class MinFinder {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		int x= input.nextInt();
		
		System.out.print("Enter y: ");
		int y= input.nextInt();
		
		System.out.print("Enter z: ");
		int z= input.nextInt();
		
		if(z<y) {
			if(z<x) {
				System.out.print("min" +z);
			}
			else {
				System.out.print("min" +x);
			}		
		}
		else {
			if(x<y) {
				if(x<y) {
					System.out.print("min" +x);
				}
				else {
					System.out.print("min"+y);
				}
			}
		}
	}

}
