class GraphPrim
{
    int adjMatrix[][];
    int numVertices;
    
    public GraphPrim(int numVertices)
    {
        this.numVertices=numVertices;
        adjMatrix=new int[numVertices][numVertices];
    }
    public void addEdges(int i,int j,int wt)
    {
        adjMatrix[i][j] = wt;
        adjMatrix[j][i] = wt;

    }
    public void printAdjMatrix()
    {
        System.out.println("The elements of Adj Matrix graph are: ");
        for(int i=0; i<numVertices;i++)
        {
            System.out.print(i+" -> ");
        for(int b: adjMatrix[i])
        {
            System.out.print(b+"  ");
        }
        System.out.println();
        }
            
    }

}
class Dijkstras
{
    static int selectMinVertex(int value[],boolean visited[])
    {
        int vertex=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<value.length; i++)
        {
            if(visited[i]==false && value[i]<min)
            {
                vertex=i;
                min=value[i];
            }
        }
        return vertex;
    }
    
     void findMST(GraphPrim g,int start)    {   
        int size=g.adjMatrix.length;
        int parent[]=new int[size];
        int value[]=new int [size];
        boolean visited[]=new boolean[size];
        for(int i=0; i<size; i++)
        {
            value[i]=Integer.MAX_VALUE;
            parent[i]=-1;
        }
        value[start]=0;  //source
        for(int i=0; i<size; i++)
        {
        int u=selectMinVertex(value,visited);
        visited[u]=true;
        for(int j=0; j<size; j++)
        {
            int total_cost= value[u] + g.adjMatrix[u][j];
        if(g.adjMatrix[u][j]!=0 && !visited[j] && total_cost <value[j])
            {
                value[j]=total_cost;
                parent[j]=u;
            }
        }
        }
        for(int i=1; i<size; i++)
        {
            System.out.println("u->v : "+parent[i]+" -> "+i+"  wt: "+g.adjMatrix[parent[i]][i]);
        }

    }
    void printShortestPath(int i,int j)
    {    

    }
}
public class DijkstrasEx {

    
    public static void main(String args[])
    {
        GraphPrim g=new GraphPrim(6);
        g.addEdges(0,1,4);
        g.addEdges(0,2,6);
        g.addEdges(1,4,7);
        g.addEdges(2,3,3);
        g.addEdges(1,3,2);
        g.addEdges(4,5,7);
        g.addEdges(3,4,4);
        g.addEdges(3,5,6);
        g.addEdges(2,4,5);
        g.addEdges(1,2,4);
        g.printAdjMatrix();
        Dijkstras djk=new Dijkstras();
        djk.findMST(g,0);

    }
}