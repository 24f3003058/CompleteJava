import java.util.*;
public class ExceptionClass{
    public static void main(String[] args){
        int[] sq_sides_of_tri= {1,4,9,16,25,36,49,64,81,100};
        Scanner s=new Scanner(System.in);
        String choice="n";
        do{ 
            try{
                System.out.println("\nEnter the stride r length");
                int stride =s.nextInt();
                s.nextLine();
                if (stride==0){
                    throw new ArithmeticException("Stride cannot be zero");
                }
                int iterations =sq_sides_of_tri.length/stride;
                int [] hypotenuse_sq= new int[iterations];
                System.out.println("iterations :"+ iterations);
                int i=0; int k=0;
                while(iterations>0){
                    hypotenuse_sq[k++] =sq_sides_of_tri[i]+ sq_sides_of_tri[i+stride];
                    i=i+stride;
                    iterations--;
                }
                System.out.println("Hypotenuse Squared ");
                for (int val : hypotenuse_sq){
                    System.out.println(val +" ");
                }
                System.out.println("\nDo you want to continue? Enter Y or N");
                choice=s.nextLine();

            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("\nPlease enter NON_Zero strides\nDo you want to continue? Enter Y if continue otherwise N");
                choice=s.nextLine();
            }
            catch(RuntimeException e){
                if(e instanceof ArrayIndexOutOfBoundsException){
                    System.out.println("\n Array indexing issue");
                    e.printStackTrace();
                    System.exit(0);
                }
                System.out.println("Runtime Exception occured !!!");
                e.printStackTrace();

            }catch(Exception e){
                System.out.println("Unknown Exception\n");
                e.printStackTrace();

            }
            
    
        }while(choice.equalsIgnoreCase("y"));
    }


}