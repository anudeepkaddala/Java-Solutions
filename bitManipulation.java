import java.util.*;
public class bitManipulation {
    public static void main(String args[]){
        int n=5; //5=0101
        int pos=2; //change it and see for 3 
        
/*This is for get operation */
        /*int bitMask=1<<pos;
        if((bitMask & n)==0){
            System.out.println("It is zero");
        }
        else{
            System.out.println("It is one");
        }
*/


/*This is for set operation */
/*
        int bitMask=1<<pos;
        int newNum1=(bitMask|n);
        System.out.println(newNum1);


*/

/*This is clear operation */

        int bitMask=1<<pos;
        int negbitMask=~(bitMask);

        int newNum2=(negbitMask & n);
        System.out.println((newNum2));

    
    }


    
}
