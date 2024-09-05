import java.util.*;
public class Linear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to find: ");
        int number=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==number){
                System.out.println("Present at index: "+ i);
            }
        }
    }
}
