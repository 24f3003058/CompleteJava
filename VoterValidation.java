import java.util.*;

class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}
class CitizenshipException extends Exception{
    public CitizenshipException(String message){
        super(message);
    }
}

class RegistrationException extends Exception{
    public RegistrationException(String message){
        super(message);
    }
}

class FirstTimeVoterException extends Exception{
    public FirstTimeVoterException(String message){
        super(message);
    }
}

class Voter{
    private int age;
    private boolean isCitizen;
    private boolean isRegistered;
    private boolean firstTimeVoter;

    public Voter( int age,boolean isCitizen, boolean isRegistered, boolean firstTimeVoter){
        this.age=age;
        this.isCitizen=isCitizen;
        this.isRegistered=isRegistered;
        this.firstTimeVoter=firstTimeVoter;
    } 
    public void validateVoter(){
        try{
            if(age<18){
                throw new AgeException("You must be 18 or older to vote.");
            }
            else if(!isCitizen){
                throw new CitizenshipException("Only citizens are allowed to vote");
            }
            else if(!isRegistered){
                if(firstTimeVoter){
                    RegistrationException re =new RegistrationException("You must be registerd to vote");
                    re.initCause(new FirstTimeVoterException("First-time voters must register before voting."));
                    throw re;
                }
                else{
                    throw new RegistrationException("You must be registered to vote");
                }
            }
            else{
                System.out.println("You are eligible to vote");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            if(e.getCause()!=null){
                System.out.println(e.getCause().getMessage());
            }
        }
        finally{
            System.out.println("Thank you for using our voter validation system");
        }
    }
}

public class VoterValidation {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Are you a citizen (true/false): ");
        boolean isCitizen=sc.nextBoolean();
        System.out.print("Are you registered to vote(true/false):");
        boolean isRegistered=sc.nextBoolean();
        System.out.println("Is this your first time voting ? ");
        boolean firstTimeVoter=sc.nextBoolean();
        Voter v=new Voter(age, isCitizen, isRegistered, firstTimeVoter);
        v.validateVoter();
        sc.close();
    }
}