import java.util.*;
public class Radius {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter r1: ");
		double r1=input.nextDouble();
		
		System.out.print("Enter r2: ");
		double r2=input.nextDouble();
		
		System.out.print("Enter r3: ");
		double r3=input.nextDouble();
		
		double area1=r1*r1*3.1416;
		double area2=r2*r2*3.1416;
		double area3=r3*r3*3.1416;
		
		double perimeter1=2*3.1416*r1;
		double perimeter2=2*3.1416*r2;
		double perimeter3=2*3.1416*r3;
		
		System.out.println("Area of circle 1: "+area1);
		System.out.println("Area of circle 2: "+area2);
		System.out.println("Area of Circle 3: "+area3);
		

		System.out.println("Perimeter of circle 1: "+perimeter1);
		System.out.println("Perimeter of circle 2: "+perimeter2);
		System.out.println("Perimeter of circle 3: "+perimeter3);

		if(r1>0 && r2>0) {
			System.out.println("Positive");
		}
		else if(r1<0 && r2<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("others");
		}
		
			
		if(r3>r2) {
			if(r3>r1) {
				System.out.println("Max"+r3);
			}
			else {
				System.out.println("Max"+r1);
			}
			
		}
		else {
			if(r1>r2) {
				if(r1>r3) {
					System.out.println("Max"+r1);
				}
				else {
						System.out.println("Max"+r3);
					}
				}
			}
		}
			
		
	}


