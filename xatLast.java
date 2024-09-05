public class xatLast {
    public static void sorted(String str, int i, int count,String newStr){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        
        char current=str.charAt(i);
        if(current=='x'){
            count++;
            sorted(str,i+1,count,newStr);
        }
        else{
            newStr+=current;
            sorted(str,i+1,count,newStr);
            
        }
    }
    public static void main(String args[]){
        String str="axbcxdxxe";
        sorted(str,0,0,"");
        
        

    }
    
}
