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
    public void insertion(){
      
        for( int i=1;i<arr.length;i++){
           int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
        }
        System.out.println("Sorted  array");
       for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
         selection ls = new selection();
         ls.read();  
        ls.insertion();
    }
    }
