import java.util.*;
class Rectangle{
    int w;
    int h;
   
    public void setw(int w){
        this.w=w;
    }
    public void seth(int h){
        this.h=h;
    }
    public int area(){
        this.w=w;
        this.h=h;
        return w*h;
    } 
}
public class Area {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=Integer.parseInt(sc.nextLine());
        int h=Integer.parseInt(sc.nextLine());
        Rectangle r=new Rectangle();
        r.setw(w);
        r.seth(h);
        int area=r.area();
        System.out.println(area);
    }
    
}
