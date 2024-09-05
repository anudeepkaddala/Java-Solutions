public class noDuplicates {
    public static boolean[] map=new boolean[100];
    public static void remDuplicates(String str, int i, String newStr){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        char current=str.charAt(i);
        if(map[current-'a']==true){
            remDuplicates(str,i+1,newStr);
        }
        else{
            newStr+=current;
            map[current-'a']=true;
            remDuplicates(str,i+1,newStr);
        }
    }

    public static void main(String args[]){
        String str="aabbcdde";
        remDuplicates(str,0,"");


    }
    
}
