public class MinofArr2{
    public static int minArr(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int arr1[]={2,3,8,5,6};
        System.out.println(minArr(arr1));
    }
}