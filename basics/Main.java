class Student {
    private String name;
    private int age;
    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Main{
    public static void main(String [] args){
        Student s1=new Student();
        s1.setName("Nea");
        s1.setAge(20);
        System.out.println("Name: " + s1.getName() + ", Age: " + s1.getAge());
    }
}
