class ArrayRec{
    public static void printArr(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArr(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,4,3,6};
        int x=arr.length;
        printArr(arr,0);
        System.out.println("Finished Execution");
    }
}
