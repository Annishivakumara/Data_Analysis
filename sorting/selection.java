import java.util.*;
public class  selection {
    int arr[] = new int[7];
    public void read() {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the numbers:");
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt();
        }
    }
   public void select(){
    int min;
    for(int i=0;i<arr.length-1;i++){
        min=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
     System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
          selection ls = new selection();
         ls.read();  
       ls.select();  
    }
    }
