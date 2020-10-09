import java.util.Scanner;
/** this program will take the heights provided and give the average + the heights that are above average
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("How many heights would you like to put in?");
    final int num = input.nextInt();
    double[] height = new double[num];
    for(int i= 0; i < height.length; i++){
      System.out.println("Please enter in your heights " + (i + 1));
      height[i] = input.nextDouble();
    }
    double sum = 0;
    for(int i = 0; i<height.length; i++){
      sum = sum + height[i];
    }
    double average = sum / num;
    System.out.println("The average height is " + average);
   for(int i = 0; i < height.length; i++){
     if(height[i] > average){
    
     
     System.out.println("The heights above average are " + height[i]);
     }
   }
    }
  }

