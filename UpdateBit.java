import java.util.*;
public class UpdateBit {
    public static void main(String args[]){
        int n=5; //5=0101
        int pos=1;
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        if(oper == 1){
            int bitMask=1<<pos;
            int newNum1=(bitMask | n);
            System.out.println(newNum1);
        }
        else{
            int bitMask=1<<pos;
            int negbitMask=~(bitMask);
            int newNum2=(negbitMask & n);
            System.out.println(newNum2);
        }

    }
}
