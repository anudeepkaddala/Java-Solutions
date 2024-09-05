public class linearSearch {
    static boolean search(int arr[],int i,int data){
        if(i==arr.length)
            return false;
        if(data==arr[i])
            return true;
        return search(arr, i+1, data);
    }
    public static void main(String[] args) {
        int arr1[]={12,4,3,2,65,1};
        System.out.println(search(arr1, 0, 3));
    }
}
