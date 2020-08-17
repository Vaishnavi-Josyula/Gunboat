import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
  {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter distance to target (in m): \n"); 
    double d = reader.nextDouble();
    System.out.print("Enter the height of the battery realtive to the water line (in m):  \n"); 
    double h = reader.nextDouble();
    System.out.print("Enter the initial velocity (in m/s):  \n"); 
    double u = reader.nextDouble();
    double a = (-4.9)*(d/u)*(d/u);
    double c = a+h;
    double first_answer = Math.atan((-d + Math.sqrt(d*d- 4*a*c))/(2*a));
    double final_answer = (first_answer*180)/3.1415926536;
    System.out.println("The angle is  " + final_answer);
   // double second_answer = Math.atan((-b - Math.sqrt((d*d)- 4*a*c))/2*a);
	}
}