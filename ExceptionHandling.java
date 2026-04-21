public class ExceptionHandling{
    public static void main(String[] args) {
        int arr[]=new int[2];
      try{
        for(int i=0;i<3;i++){
           System.out.println(arr[i]/arr[i+1]); 
        }
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("array index out of size");
      } catch(RuntimeException obj){
        System.out.println("runtime exception occured");
      }catch(Exception d){
        System.out.println("exception");
      } 
    }
}