import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) 
  {
    //the following code takes in the distance(m), height(m), and inital velocity(m/s), and outputs the higher angle(degrees)
			
    //this chunk of code takes in the three paramenters listed above and stores them
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter distance to target (in m): \n"); 
    double d = reader.nextDouble();
    System.out.print("Enter the height of the battery realtive to the water line (in m):  \n"); 
    double h = reader.nextDouble();
    System.out.print("Enter the initial velocity (in m/s):  \n"); 
    double u = reader.nextDouble();
		
    //here, we're plugging in values into the formula to get theta	
    double a = (-4.9)*(d/u)*(d/u);
		//b = d, so I didn't create a new variable and chose to stick with d
    double c = a+h;
    double first_answer = Math.atan((-d + Math.sqrt(d*d- 4*a*c))/(2*a));
    /* double second_answer = Math.atan((-b - Math.sqrt((d*d)- 4*a*c))/2*a);
     second_answer is ignored as per instructions */
    // since Java stores angles in radians and we want the answer in degrees, we multiply first_answer by 180/pi
    double final_answer = (first_answer*180)/3.1415926536;
    System.out.println("The angle is  " + final_answer);
	}
}
