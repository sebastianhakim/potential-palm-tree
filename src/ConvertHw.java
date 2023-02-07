import java.util.Scanner;

public class ConvertHw {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  {
    System.out.println("Choose a number 1 to 4");
    System.out.println("kg to lb(1) or cm to mm(2) or mile to km(3) or oz to gram(4)");
    System.out.println("Enter 'exit' or '-1' to exit the program");
    int result = scan.nextInt();
    

while (true) {
    
    String input = scan.nextLine();
   
    
    if (input.equals("exit") || input.equals("-1")) {
        break;
      }

    if (result == 1) {

        System.out.println("\nEnter kg value: ");
        double value1 = scan.nextDouble();
        double valueFinal = value1 * 2.2;
        System.out.print("lb is: " + valueFinal);
        
    } else if (result == 2) {

        System.out.println("Enter cm value:\n ");
        double value2 = scan.nextDouble();
        double valueFinal = value2 * 10;
        System.out.print("mm is: " + valueFinal);
        
    } else if (result == 3) {

        System.out.println("Enter mile value: ");
        double value3 = scan.nextDouble();
        double valueFinal = value3 * 1.61;
        System.out.print("km is: " + valueFinal);
        
    } else if (result == 4) {

        System.out.println("Enter oz: ");
        double value4 = scan.nextDouble();
        double valueFinal = value4 * 28.35;
        System.out.print("gram is: " + valueFinal);
        
    } else {
        System.out.println("Please choose a number between 1 and 4");
    
        continue;
    }
} 
scan.close();
} 
    }
}











