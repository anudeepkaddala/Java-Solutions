import java.util.*;
import java.util.LinkedList;
class GraphPrim
{
    int adjMatrix[][];
    int numVertices;
    public GraphPrim(int numVertices)
    {
        this.numVertices=numVertices;
        adjMatrix=new int[numVertices][numVertices];
    }
    public void addEdge(int i,int j,int wt)
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
class Prims{
    int selectMinVertex(int value[],boolean visited[]){
        int vertex=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<value.length;i++){

        }
    }
    void findMST(GraphPrim g, int source){
        int size=g.numVertices;
        int parent[]=new int[size];
        int value[]=new int[size];
    }
}
class GraphMatrix{
    int nVertices;
    boolean matrix[][];
    Stack<Integer> st = new Stack<>();
    boolean[] visited;
    LinkedList<Integer> qu=new LinkedList<Integer>();
    

    GraphMatrix(int nVertices){
        this.nVertices = nVertices;
        matrix = new boolean[nVertices][nVertices];
        visited = new boolean[nVertices];
    }
    void addEdge(int start, int end){
        matrix[start][end] = true;
        matrix[end][start] = true;
    }
    void printMatrix(){
        System.out.print("\nGraph with Matrix: ");
        for(int i = 0; i < nVertices; i++){
            System.out.print("\n" + i + ":");
            for(int j = 0; j < nVertices; j++){
                if(matrix[i][j])
                    System.out.print(1 + "-->");
                else
                    System.out.print(0 + "-->");
            }
        }
    }
    void dfs(int vertex){
        visited[vertex] = true;
        int temp = vertex;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[temp][i] && !visited[i]){
                st.push(i);
                visited[i] = true;
            }
        }
        System.out.print(temp + " ");
        if(!st.isEmpty())
            dfs(st.pop());
        
    }
    void bfs(int vertex){
        visited[vertex] = true;
        int temp = vertex;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[temp][i] && !visited[i]){
                qu.offer(i);
                visited[i] = true;
            }
        }
        System.out.print(temp + " ");
        if(!qu.isEmpty())
            bfs(qu.poll());
        
    }
}

class GraphAdjList{
    int nVertices;
    LinkedList adjList[];
    
    GraphAdjList(int nVertices){
        this.nVertices = nVertices;
        adjList = new LinkedList[nVertices];
        for(int i = 0; i < nVertices; i++){
            adjList[i] = new LinkedList<>();
        }
    }
    void addEdge(int start, int end){
        adjList[start].add(start);
        adjList[end].add(start);
    }
    void printAdjGraph(){
        for(int i = 0; i < adjList.length; i++){
            System.out.print(i+":");
            for(Object o : adjList[i]){
                System.out.print("-->" + o);
            }
            System.out.println();
        }
    }
    
}

public class MainGraph {
    public static void main(String[] args) {
    
    GraphMatrix g = new GraphMatrix(5);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(0, 3);
    g.addEdge(1, 2);
    g.addEdge(2, 4);
    //g.dfs(0);
    g.bfs(0);
    

    /* 
    GraphAdjList g = new GraphAdjList(4);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.printAdjGraph();
    */
    }
}


//Algorithm for DFS traversal
/*
 * Visit any vertex of your choice and mark it as visited in visited array
 * Push all it's adjacent vertices in Stack
 * Push all the adjacent vertices which are not in stack and visited into the stack
 * pop the stack element and put it in visited if it is not already visited
 * Repeat the above steps again
 */