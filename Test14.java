class Date{
    private int day,month,year;//instances

    //constructor
    public Date (int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    //methods
    public void setDay(int day){
        this.day=day;
    }

    public void setMonth(int month){
        this.month=month;
    }

    public void setYear(int year){
        this.year=year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }
    public int getyear(){

        return this.year;
    }
    
    
}
 
//Main class
public class Test14{
    public static void main(String [] args){
       
        Date date1=new Date(12,04,2024); //object
        System.out.println(date1.getDay());

        date1.setDay(23);
        System.out.println(date1.getMonth());
        System.out.println(date1.getyear());
        
        
    }
}
