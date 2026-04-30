class Employee implements Cloneable{
    private String name;
    private double salary;
    private Date birthday;
    public Employee(String n,double s){
        name=n;
        salary=s;
        birthday=new Date();
    }
    public void setname(String n){
        name = n;
    }
    public void setbday(int dd,int mm,int yy){
        birthday.update(dd,mm,yy);
    }
    public String toString(){
        return this.name+" : "+this.salary+" : "+this.birthday;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public Object clone() throws CloneNotSupportedException{
        Employee temp=(Employee)super.clone();
        temp.birthday=(Date)birthday.clone();
        return temp;
    }
}

class Date implements Cloneable{
    private int day;
    private int month;
    private int year;
    public void update(int d,int m,int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    public String toString(){
        return day+"-"+month+"-"+year;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Week8 {
    public static void main(String[] args) throws Exception {
       Employee e1=new Employee("Raj",230000);

       //shallow copy
       Employee e2=e1;
       e2.setname("Rajashri");
       System.out.println(e1+" \n"+e2);

       //Deep copy
        Employee e3=new Employee(e1.getName(),e1.getSalary());
        e3.setname("Naina");
        e3.setbday(04, 02, 2007);
        System.out.println(e1+"\n"+e3);

        //cloning
        Employee e4=(Employee)e3.clone();
        e4.setname("Carl Sagan");
        e4.setbday(14,06,2015);
        System.out.println(e3+"\n"+e4);

        //deep  level cloning
        Employee e5=new Employee("george",25889);
        e5.setbday(19, 06, 2070);

        Employee e6=(Employee)e5.clone();
        e6.setname("ankur");
        e6.setbday(1, 01, 1000);
        System.out.println(e5+"\n"+e6);


    }
}
