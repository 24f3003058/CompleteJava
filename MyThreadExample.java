import java.util.*;

class MyThread extends Thread{
    int id;

    MyThread(int id){
        this.id=id;
    }
    public void run(){
        for (int i=0;i<=5;i++){
            System.out.println(id + " ---> " + Thread.currentThread().getName() + i );
        }
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
    } 
}

public class MyThreadExample {
    public static void main(String[] args) {
        MyThread t1=new MyThread(7);
        MyThread t2=new MyThread(3);
        MyThread t3=new MyThread(5);
        MyThread t4=new MyThread(6);
        MyThread t5=new MyThread(1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}