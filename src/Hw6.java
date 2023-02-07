import java.util.Scanner;

public class Hw6 {
    


public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Choose a number 1 to 4");
        System.out.println("kg to lb(1) or cm to mm(2) or mile to km(3) or oz to gram(4)");
        int result = scan.nextInt();
       
while (true) {

    String input = scan.nextLine();
    if (input.equals("exit") || input.equals("-1")) {
        break;
      }

    switch(result)
    {
        case 1:
        System.out.println("Enter kg value: ");
        double value1 = scan.nextDouble();
        double valueFinal1 = value1 * 2.2;
        System.out.print("lb is: " + valueFinal1);
        break;

        case 2:
        System.out.println("Enter cm value: ");
        double value2 = scan.nextDouble();
        double valueFinal2 = value2 * 10;
        System.out.print("mm is: " + valueFinal2);
        break;
    
        case 3:
        System.out.println("Enter mile value: ");
        double value3 = scan.nextDouble();
        double valueFinal3 = value3 * 1.61;
        System.out.print("km is: " + valueFinal3);
        break;

        case 4:
        System.out.println("Enter oz: ");
        double value4 = scan.nextDouble();
        double valueFinal4 = value4 * 28.35;
        System.out.print("gram is: " + valueFinal4);
        break;

        default:
        System.out.println("Please choose a number between 1 and 4");
        
     }
} 
scan.close();
}

}
