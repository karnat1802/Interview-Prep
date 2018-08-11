

public class Heap
{
    int maxSize;
    int size;
    int heap[];
    
    public Heap(int capacity)
    {
        maxSize = capacity;
        size = 0;
        heap = new int[maxSize];
    }
    
    
    
    public void swap(int heap[], int i, int j)
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    public int parent(int i)
    {
        return i/2;
    }
    
    public int leftChild(int i)
    {
        if(2*i < size)
            return 2*i;
            
        return 0;    
    }
    
    public int rightChild(int i)
    {
        if(2*i + 1 < size)
            return 2*i+1;
            
        return 0;    
    }
    
    public void heapifyUp(int i)
    {
        while(i>0 && heap[parent(i)]<heap[i])
        {
            swap(heap, i, parent(i));
            i = parent(i);
        }
        
    }
    
    public void heapifyDown(int i)
    {
        //To be done
        int maxIndex = i;
        int l = leftChild(i);
        if(l<size && heap[maxIndex]<heap[l])
            maxIndex = l;
        int r = rightChild(i);
        if(r<size && heap[i]<heap[maxIndex])
            maxIndex = r;
            
        if(i!=maxIndex)
            swap(heap,maxIndex, i);
            
        heapifyDown(maxIndex);    
            
            
    }
    
    public void insert(int p)
    {
        if (size == maxSize){
            System.out.println("The heap has reached its capacity");
            return;
        }
        
        size = size + 1;
        heap[size - 1] = p;
        heapifyUp(size-1);
        
        
            
    }
    
    public int extractMax(){
        int result = heap[size - 1];
        heap[0] = heap[size - 1];
        size = size - 1;
        heapifyDown(0);
        return result;
    }
    
    public void remove(int index){
        heap[index] = Integer.MAX_VALUE;
        heapifyUp(index);
        extractMax();
        
    }
    
    public int getMax()
    {
        return heap[0];
    }
    
    public boolean is_Empty()
    {
        return size==0;
    }
    
    public int get_size()
    {
        return size;
    }
    
    public void changePriority(int i , int p){
        int oldpriority = heap[i];
        heap[i] = p;
        if(p>oldpriority)
            heapifyUp(i);
        else{
            heapifyDown(i);
        }
            
    }
    public void printHeap()
    {
        System.out.println("The heap elements are:");
        for(int i = 0; i < size; i++)
        {
            System.out.println(heap[i]);
        }
    }
    public void main(String args[])
    {
        Heap heap = new Heap(10);
        heap.insert(5);
        heap.insert(8);
        
        heap.printHeap();
        heap.insert(15);
        heap.printHeap();
        heap.insert(4);
        heap.printHeap();
        heap.insert(20);
        heap.insert(6);
        heap.printHeap();
    }
}
