public class MInofArr{
    public static int minArr(int arr[],int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int a=minArr(arr,i+1);
        return Math.min(a,arr[i]);
    }

    public static void main(String[] args){
        int arr1[]={2,3,8,5,6};
        System.out.println(minArr(arr1,0));
    }
}