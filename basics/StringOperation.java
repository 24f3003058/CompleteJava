public class StringOperation {
    public static void main(String [] aegs){
        String str1="Hello India";

        int length=str1.length();
        System.out.println("Length of the string is: "+length);

        String str2=str1.toUpperCase();
        System.out.println("Uppercase string is: "+str2);

        String Str3 =str1.toLowerCase();
        System.out.println("Lowercase string is: "+Str3);

        //substring from a specific index
        String Str4=str1.substring(6);
        System.out.println("Substring from index 6 is: "+Str4);

        //replace a substring with another string
        String str5=str1.replace("India","World");
        System.out.println("String after replacement is: "+str5);

        //substring from a specific index to another index
        String str6=str1.substring(3,8);
        System.out.println("Substring from index 3 to 8 is: "+str6);

        //if we want to check whether a string contains a specific sequence of characters
        boolean contains=str1.contains("India");
        System.out.println("Does the string contain 'India'? "+contains);

        str1="               Hello World            ";
        String str7=str1.trim();
        System.out.println("String after trimming is: "+str7);

        
    }
    
}
