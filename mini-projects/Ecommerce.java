import java.util.*;

class Product{
    String productName;
    double price;
    double discount;
    Product(String p,double price,double discount){
        this.productName=p;
        this.price=price;
        this.discount=discount;
        
    }
    Product(Product p){
        this.productName=p.productName;
        this.price=p.price;
        this.discount=p.discount;
    }
    Product(String pn,double p){
        this.productName=pn;
        this.price=p;
    }
    public double discountedPrice(double discount){
        if(discount==0){
            return price;
        }
        else{
            return price-price*(discount/100);
        }
        

    }
    public void totalCost(double discount){
        System.out.println("Product Name "+productName+ "\n"+ "Original Price = "+ price+"\n"+ "DiscountPrice = " +discountedPrice(discount));
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    String str= sc.next();
    double price=sc.nextDouble();
    double discount=sc.nextDouble();

    Product p1=new Product(str,price,discount);
    p1.totalCost(discount);

    String str1= sc.next();
    double p=sc.nextDouble();
    double d=sc.nextDouble();

    Product p2=new Product(str1,p,d);
    p2.totalCost(d);

    sc.close();
    }
}
