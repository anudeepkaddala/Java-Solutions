public class firstAndLast {
    public static int first=-1;
    public static int last=-1;
    public static void fandl(String str, int i, char element){
        if(i==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current=str.charAt(i);
        if(current==element){
            if(first==-1){
                first=i;
            }
            else{
                last=i;
            }
    
        }
        fandl(str,i+1,element);

    }
    public static void main(String args[]){
        String str="abbacaccdadb";
        fandl(str,0,'c');
        

    }
    
}
