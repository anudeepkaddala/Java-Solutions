public class AscendingOrder{
    static boolean ascend(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return ascend(arr,i+1);
    }

    public static void main(String[] args){
        int arr1[]={2,3,8,5,6};
        System.out.println(ascend(arr1,0));
    }
}