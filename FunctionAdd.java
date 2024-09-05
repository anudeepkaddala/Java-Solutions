import java.util.*;
public class FunctionAdd{
    public static int Add(int a, int b ){
        int c=a+b;
        System.out.println(c);
        return 1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Add(a,b);

    }
}