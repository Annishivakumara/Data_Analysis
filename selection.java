import java . util.*;
public class selection{
      int []  number={1 ,3 ,5,6, 8, 4,2};

    public void bin(int low, int high , int data){
        while(low<=high){
            int mid=(low+high)/2;
            if(number[mid]==data){
                System.out.println("Data found");
                break;
            }
            else if(data>number[mid]){
                mid=high-1;
            }
            else if(data>number[mid]){
                mid=low+1;
            }
        
        }
    }
    public static void main(String [] args){
      selection s= new selection();
      Scanner sc= new Scanner(System.in);
      int data=sc.nextInt();
      s.bin(0,4,data);
    }
}
