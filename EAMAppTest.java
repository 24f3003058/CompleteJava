import java.util.*;

class Asset {
    public String assetName;

    public Asset(String a) {
        assetName = a;
    }

    
    // Define getDetails() here
    public String getDetails(){
        return "Asset: "+assetName;
    }


}

class ITAsset extends Asset {
    private String assetType;

    public ITAsset(String a, String t) {
        super(a);
        assetType = t;
    }

    // Override getDetails() here
    public String getDetails(){
        return "IT Asset: "+assetName+", Type: "+assetType;
    }
}

class EAMApp {

    // Define display() method here
    public static void display(Asset obj){
        System.out.println(obj.getDetails());
    }
}



public class EAMAppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String assetName = sc.next();
        String itAssetName = sc.next();
        String assetType = sc.next();

        Asset a = new Asset(assetName);
        ITAsset it = new ITAsset(itAssetName, assetType);

        EAMApp.display(a);
        EAMApp.display(it);

        sc.close();
    }
}

// Enterprise Asset Management - Inheritance

// An Enterprise Asset Management (EAM) tool maintains details of different
// types of assets used in an organization. The base class Asset stores common
// information related to an asset. The subclass ITAsset inherits from Asset and
// stores additional information specific to IT assets.

// Write a Java program that creates objects of Asset and ITAsset, overrides
// methods to display appropriate asset details, and prints the details of both
// objects in a uniform manner.

// Class Asset has/should have the following members:
//     Public instance variable String assetName
//     Constructor to initialize the instance variable
//     Method getDetails() that returns asset details in the format:
//     Asset: <assetName>

// Class ITAsset should:
//     Inherit from Asset
//     Have a private instance variable String assetType
//     Constructor to initialize the instance variables
//     Override method getDetails() such that it returns details in the format:
//     IT Asset: <assetName>, Type: <assetType>

// Class EAMApp should:
//     Define a method display(T obj) that prints the details of the object by
//     invoking its getDetails() method
//     main method that does the following:
//         Create one object of Asset and one object of ITAsset
//         Use the method display() to print details of both objects

// What you have to do
//     Define the method getDetails() in class Asset
//     Override the method getDetails() in class ITAsset
//     Define the method display() in class EAMApp

// Input
// Building
// Server01
// Hardware
// Expected Output
// Asset: Building
// IT Asset: Server01, Type: Hardware
