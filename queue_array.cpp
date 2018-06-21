#include <iostream>
#include <string>
using namespace std;
class Queue

{
  private: 
    int front;
    int end;
    int arr[5];
  public:
    Queue()
    {
        front  = -1;
        end = -1;
    }
    bool isEmpty()
    {
        if(front ==-1 && end ==-1)
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    bool isFull()
    {
        if(((end+1)%5) == front)
        {
            return true;
        }
        else{
            return false;   
        }
    }
    void enqueue(int val){
        if(isFull())
        {
            cout << "Already Full...." <<endl;
        }
        else if(isEmpty())
        {
            front  = 0;
            end = 0;
        }
        else
        {
            end = (end +1)%5;
        }
        arr[end] = val;
    }
    void dequeue()
    {
        if(front == end)
        {
            cout << arr[front] <<endl;
            front  = -1;
            end  = -1;
            return;
        }
        if(isEmpty())
        {
            cout << "Queue is already empty" << endl;
            return;   
        }
        cout << arr[front] << endl;
        front = (front + 1)%5;
        
        
    }
    
    void display()
    {
        int size  = (end + 5  -front)%5 + 1;
        int index ;
        for (int i =0; i<size;i++)
        {
            index = (front+i)%5;
            cout << arr[index] << " ";
        }
        cout <<"\n" ;    
    }
};




int main()
{
  Queue obj;
  obj.enqueue(10);
  obj.display();
  obj.enqueue(20);
  obj.display();
  obj.enqueue(30);
  obj.display();
  obj.enqueue(40);
  obj.display();
  obj.enqueue(50);
  obj.display();
  obj.enqueue(50);
  obj.display();
  obj.dequeue();
  obj.display();
  obj.dequeue();
  obj.display();
  obj.dequeue();
  obj.display();
  obj.dequeue();
  obj.display();
  obj.enqueue(60);
  obj.display();
  obj.dequeue();
  obj.display();
  obj.dequeue();
  obj.display();
  obj.enqueue(50);
  obj.display();
  obj.enqueue(80);
  obj.display();
  return 0;  
};