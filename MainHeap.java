class Heap{
    int ar[], int i;
    Heap(int size){
        ar[] = new int[size];
    }
    void swap(int i, int j){
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }
   //Take min as the ith position
   //compare ith value with left and right to check where is the minimum value
   //If min is found at some other index l or r, update min as l or r
   //swap the ith value with the min index value
   //If swapping is done with the other indexes, repeat the heapification on the other index also
    void heapify(int[] ar, int size, int i){
        int min = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < ar.length && ar[left] < ar[min])
            min = left;
        if(right < ar.length && ar[right] < ar[min])
            min = right;
        if(min != i){
            swap(ar, i, min);
            heapify(ar, size, min);
        }
    
    }
    void insertIntoHeap(int ar[], int size, int data){
        size++;
        ar[size] = data;
        //heapify all parent nodes from last to 0th parent
        for(int i = (size - 1) / 2; i >= 0; i--){
            heapify(ar, size, i);
        }
    }
    void deleteFromHeap(int ar[], int size, int data){
        for(int i = 0; i < size; i++){
            if(data == ar[i]){
            swap(ar, i, size - 1);
            size--;
            heapify(ar, size, i);
            }
        }
    }
}
public class MainHeap {
    

}