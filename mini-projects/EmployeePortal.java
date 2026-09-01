import java.util.*;

class RequestRecord {
    private String category;
    private int count;

    public RequestRecord(String c, int cnt) {
        category = c;
        count = cnt;
    }

    public String getCategory() {
        return category;
    }

    public int getCount() {
        return count;
    }
}

public class EmployeePortal {

    // Define method aggregateRequestsByCategory here
    public static Map<String, Integer> aggregateRequestsByCategory(List<RequestRecord> list){
        Map<String,Integer> map= new HashMap<>();
        for(RequestRecord r: list){
            String category=r.getCategory();
            int count=r.getCount();
            map.put(category,map.getOrDefault(category,0)+ count);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<RequestRecord> requestList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String category = sc.next();
            int count = sc.nextInt();
            requestList.add(new RequestRecord(category, count));
        }

        Map<String, Integer> result = aggregateRequestsByCategory(requestList);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        sc.close();
    }
}

// Employee Portal Request Category Aggregation

// An employee portal records the number of requests raised by employees in
// different request categories (such as Leave, Payroll, and IT Support). Given
// a list of request records, write a Java program to compute the total number
// of requests for each category. Complete the program as specified below.

// Class RequestRecord has the following members:
//     Private instance variables: String category and int count
//     A constructor to initialize the instance variables
//     Method getCategory that returns the request category
//     Method getCount that returns the request count

// Class EmployeePortal has/should have the following members:
//     Define method aggregateRequestsByCategory that takes a List<RequestRecord>
//     and returns a Map<String, Integer> with category names as keys and total
//     request counts as values.
//     main method that does the following:
//         Accepts input to instantiate 5 RequestRecord objects (order: category, count)
//         Adds the records to a List<RequestRecord> object
//         Invokes method aggregateRequestsByCategory
//         Prints each category along with the total number of requests

// What you have to do
//     Define method aggregateRequestsByCategory in class EmployeePortal.

// Input
// Leave 3
// Payroll 2
// Leave 4
// ITSupport 1
// Payroll 3
// Expected Output
// Leave -> 7
// Payroll -> 5
// ITSupport -> 1
