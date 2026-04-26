public class Temp{
    public static void swap(int x,int y){
       System.out.println("Hello");
        int temp=x;
        x=y;
        y=temp; 
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        swap(arr[0],arr[4]);
        for(int i: arr){
            System.out.println(i);
        }
    }
}

/*
Here no swapping is happening in original address 
becoz the memory location of each element remains 
at same address even if we do swapping of values
after swap func is called the value of arr[0] 
will be 5 and arr[5] will be 1
*/