public class BackTrack
{   static int n;
    public boolean isSafe(int maze[][],int soln[][],int i,int j)
    {
        return i<n && j<n && i>=0 && j>=0 &&soln[i][j]!=1&&maze[i][j]==0;
    }
    public boolean move(int maze[][],int soln[][],int x,int y,int d1,int d2)
    {
        if(x==d1 && y==d2){
            soln[x][y]=1;
            return true;
        }
        if(!isSafe(maze,soln,x,y))
        return false;
        soln[x][y]=1;
        return move(maze,soln,x+1,y,d1,d2)||move(maze,soln,x,y+1,d1,d2);
    }
    public void printSoln(int soln[][])
    {
        int i,j;
        for(i=0;i<soln.length;i++){
        for(j=0;j<soln[0].length;j++)
        System.out.print(soln[i][j]+" ");
        System.out.println();
        }
    }
    
	public static void main(String[] args) {
		
		int maze[][]={{0,1,1,1},{0,0,1,1},{1,0,1,1},{0,0,0,0}};
		int soln[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		n=maze.length;
		BackTrack m=new BackTrack();
        System.out.println(m.move(maze,soln,0,0,3,3));
		m.printSoln(soln);s
		
	}
}