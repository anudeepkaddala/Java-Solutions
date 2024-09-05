public class GuestNumber {
    public static int guestCount(int n){
        if(n<=1){
            return 1;
        }
        int single=guestCount(n);
        int pair= (n-1)*guestCount(n-2);

        return single+pair;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(guestCount(n));
    }
    
    
}
