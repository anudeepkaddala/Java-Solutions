class ArrayTraverse{
    static int count=0;
    public static void printInReturn(int arr[],int i){
        if(i==arr.length||arr[i]==-1)
            return;
        printInReturn(arr,i+1);
        System.out.print(arr[i]+" ");   
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,3,6,-1,-1,-1,-1};
        printInReturn(arr1,0);
        System.out.println("Finished Execution");
    }
}
