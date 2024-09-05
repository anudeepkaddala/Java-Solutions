class Array{
    public static void printArrayElements(int arr[],int i){
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,2,4,5};
        printArrayElements(arr,0);
    }
}