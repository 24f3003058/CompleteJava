import java.util.Scanner;

class Project implements Cloneable{
    String proj_name;
    double budget;
    Project(String p,double b){
        this.proj_name=p;
        this.budget=b;
    }
    public void setProjName(String p){
        this.proj_name=p;
    }
    public String toString(){
        return "Project: "+proj_name+" , budget: "+budget;
    }
    public Project clone() throws CloneNotSupportedException{
        return (Project)super.clone();
    }
}
class Manager implements Cloneable{
    private String manager_name;
    private Project proj;
    public Manager(String mn,Project p){
        this.manager_name=mn;
        this.proj=p;
    }
    public String toString(){
        return proj+"\n" +" Manager:"+manager_name;
    }
    public Manager clone() throws CloneNotSupportedException{
        Manager m=(Manager)super.clone();
        m.proj=proj.clone();
        return m;
    }
}
class Team implements Cloneable{
    private String teamName;
    private Manager mngr;
    public Team(String t,Manager m){
        this.teamName=t;
        this.mngr=m;
    }
    public void setTeamName(String t){
        this.teamName=t;
    }
    public void setManager(Manager m){
        mngr=m;
    }
    public String toString(){
        return teamName+"\n" +mngr;
    }
    public Team clone() throws CloneNotSupportedException{
        Team t=(Team)super.clone();
        t.mngr=mngr.clone();
        return t;
    }
}


public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        Project p1 = new Project("AI Development", 100000);
        Manager m1 = new Manager("Madhu", p1);
        Team t1 = new Team("Alpha", m1);
        Team t2 = t1.clone();
        t2.setTeamName(sc.nextLine());
        t2.setManager(new Manager(sc.nextLine(),

        new Project(sc.nextLine(), sc.nextDouble())));

        System.out.println("Team t1: " + t1);
        System.out.println("Team t2: " + t2);
        sc.close();
    }
}
