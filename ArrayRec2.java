class ArrayRec2{
    public static void printArr(int arr[],int i){
        if(i==arr.length||arr[i]==-1)
            return;
        
        System.out.println(arr[i]);
        printArr(arr,i+1);
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,3,6,-1,-1,-1,-1};
        int arr2[]={1,2,3,42,234,1};
        printArr(arr1,0);
        printArr(arr2,0);
        System.out.println("Finished Execution");
    }
}
