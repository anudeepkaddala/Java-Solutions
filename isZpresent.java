public class isZpresent{
    static boolean Zpresence(String arr[],int i){
        if(i==arr.length-1){
            return false;
        }
        if(arr[i].charAt(0)=='Z'){
            return true;
        }
        return Zpresence(arr,i+1);
    }

    public static void main(String args[]){
        String[] arr1={"AB","BC","CD","ZE","RW"};
        System.out.println(Zpresence(arr1,0));
    }
}