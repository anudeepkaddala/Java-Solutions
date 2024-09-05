public class binarySearch {

    public static void sort(int arr[]){
        int i=0;
        int temp=0;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    static boolean binarySearch(int arr[], int low, int high, int data) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == data)
                return true;

            if (arr[mid] > data)
                return binarySearch(arr, low, mid - 1, data);
            return binarySearch(arr, mid + 1, high, data);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = {12, 4, 3, 2, 65, 1, 8};
        sort(arr1);
        int mid = arr1.length / 2;
        System.out.println(binarySearch(arr1, 0, arr1.length - 1, 2));
    }
}
