class ArrayCount3{
    static int count=0;
    public static int countArr(int arr[],int i){
        if(i==arr.length)
            return count;
        if(arr[i]>0){
            count++;
        }
        return countArr(arr,i+1);
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,3,-1,4,-1,-1,-1};
        int result=countArr(arr1,0);
        System.out.println(result);
        System.out.println("Finished Execution");
    }
}
