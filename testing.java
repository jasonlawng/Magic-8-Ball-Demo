import java.util.Scanner;
import java.util.Random;

public class testing{

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      
      int num = rand.nextInt(5);
      
      System.out.println("What is your question>");
      String ans = scan.nextLine();
      
      if (num == 0) {
          
          System.out.println("Heck no.");
      }

       else  if (num == 1) {

            System.out.println("Maybe so.");
        }

        else if (num == 2) {

            System.out.println("Definitely.");
        }

        else if (num == 3) {

            System.out.println("Leave it up to chance and ask again.");
        }

        else {

            System.out.println("You already know the answer,");
        }
        
    }

}
