class ArrayTraverse2{
    static int count=0;
    public static void printInReturn(int arr[],int i){
        if(i==-1)
            return;
        printInReturn(arr,i-1);
        System.out.print(arr[i]+" ");   
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,3,6,-1,-1,-1,-1};
        printInReturn(arr1,arr1.length-1);
        System.out.println("Finished Execution");
    }
}
