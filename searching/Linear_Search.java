
package search;
import java.util.*;

public class Linear {
    int arr[] = new int[5];

    public void read() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt();
        }
    }

    public void search(int data) {
        boolean isFound = false; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                System.out.println("Found");
                isFound = true;
                break;
            }
        }
        
        if (!isFound) {  
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Linear ls = new Linear();
        ls.read();  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter data to search:");
        int data = sc.nextInt();
        ls.search(data);  
    }
}
