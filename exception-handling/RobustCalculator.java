import java.util.*;

public class RobustCalculator{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Choose an operation:");
            System.out.println(" 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide\n 5.Exit");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                try{
                    switch(choice){
                        case 1:
                            System.out.println("Result ="+ (a+b));
                            break;
                        case 2 :
                            System.out.println("Result ="+(a-b));
                            break;
                        case 3:
                            System.out.println("Result ="+ (a*b));
                            break;
                        
                    }

                }catch(ArithmeticException e){
                    System.out.println("cannot divide by zero");
                }
            }
        } 
        while(choice != 5);
        }
    }
