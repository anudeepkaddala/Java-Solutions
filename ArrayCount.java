class ArrayCount{
    static int count=0;
    public static int countArr(int arr[],int i){
        if(i==arr.length||arr[i]==-1)
            return count;
        count++;
        return countArr(arr,i+1);
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,3,6,-1,-1,-1,-1};
        int result=countArr(arr1,0);
        System.out.println(result);
        System.out.println("Finished Execution");
    }
}
