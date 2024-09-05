public class keypadCombination{
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombinations(String str,int i, String Combinations){
        if(i==str.length()){
            System.out.println(Combinations);
            return;
        }
        char current=str.charAt(i);
        String mapping=keypad[current-'0'];

        for(int j=0;j<mapping.length();j++){

            printCombinations(str,i+1,Combinations+mapping.charAt(j));
        }
    }
    public static void main(String args[]){
        String str="23";
        printCombinations(str,0,"");

    }
}