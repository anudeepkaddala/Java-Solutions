public class bubble {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArr(int arr[],int i){
        if(i==arr.length){
            return ;
        }
        System.out.print(arr[i]+" ");
        printArr(arr, i+1);
    }
    static void bubbleSort(int[] arr){
        for(int i=arr.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j, j+1);
                }
            }
        }
        printArr(arr, 0);
    }
    static void SelectionSort(int[] arr){
        for(int i=0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(arr, i, minIndex);
            }
        }
        printArr(arr, 0);
    }
    static void InsertionSort(int[] arr){
        
    }


    static void minIndex(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[temp]>arr[i]){
                temp=i;
            }
        }
        System.out.println(temp);
    }
    
    public static void main(String args[]){
        int[] arr={2,3,1,4};
        //bubbleSort(arr);
        //minIndex(arr);
        SelectionSort(arr);
}
}
