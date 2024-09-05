public class maze{
    public static int pathCount(int i, int j, int n, int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1&&j==m-1){
            return 1;
        }

        int rightCount=pathCount(i,j+1,n,m);
        int leftCount=pathCount(i+1,j,n,m);
        return rightCount+leftCount;

    }
    public static void main(String[] args) {
        int m=3;
        int n=3;
        int totalpaths=pathCount(0,0,n,m);
        System.out.println(totalpaths);
    }
}