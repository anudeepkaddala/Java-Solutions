public class palindromeArray{
    static boolean palindromeCheck(int arr[],int front,int end){
        if(front>=end){
            return true;
        }
        if(arr[front]!=arr[end]){
            return false;
        }
        return palindromeCheck(arr,front+1,end-1);
    }
    public static void main(String[] args){
        int arr1[]={1,3,4,3,1};
        System.out.println(palindromeCheck(arr1,0,arr1.length-1));
    }
}