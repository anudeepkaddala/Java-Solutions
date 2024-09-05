class ArraySum{
    static int sum=0;
    public static int countArr(int arr[],int i){
        if(i==arr.length)
            return sum;
        sum=sum+arr[i];
        return countArr(arr,i+1);
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,3,6,-1,-1,-1,-1};
        int result=countArr(arr1,0);
        System.out.println(result);
        System.out.println("Finished Execution");
    }
}
