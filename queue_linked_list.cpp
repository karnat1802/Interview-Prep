#include <iostream>
#include <string>
using namespace std;
struct Node{
    int data;
    struct Node* next;
};
class List
{
    private:
        Node *head;
        Node *tail;
    public:
        List()
        {
            head = NULL;
            tail = NULL;
        }
        
        void enqueue(int val)
        {
            Node *temp = new Node;
            temp->data = val;
            temp->next = NULL;
            
            if(head ==NULL)
            {
                head = temp;
                tail = temp;
            }
            else
            {
                tail->next = temp;
                tail = temp;
            }
        }
        
        void display()
        {
            Node *temp = new Node;
            temp = head;
            while(temp!=NULL)
            {
                cout << temp->data << " " ;
                temp = temp->next;   
            }
        } 
        
        bool checkEmpty()
        {
            if(head == NULL)
            {
                return true;    
            }
            else{
                return false;   
            }
        } 
        
        int dequeue()
        {
            if(head == NULL)
            {
                cout << "Queue already Empty" <<endl;
                return -1;
            }
            else
            {
                Node *temp = new Node;
                temp = head;
                head = head->next;
                delete temp;
            }
        }    
        
};

int main()
{
  List obj;
  obj.enqueue(10);
  obj.display();
  cout << '\n' ;
  obj.enqueue(20);
  obj.enqueue(30);
  obj.display();
  cout << '\n' ;
  cout << obj.checkEmpty() << endl;
  obj.enqueue(40);
  obj.enqueue(50);
  cout << '\n' ;
  obj.display();
  obj.dequeue();
  cout << '\n' ;
  obj.display();
  obj.dequeue();
  cout << '\n' ;
  obj.display();
  obj.dequeue();
  cout << '\n' ;
  obj.display();
  obj.dequeue();
  cout << '\n' ;
  obj.display();
  obj.dequeue();
  cout << '\n' ;
  obj.display();
  obj.dequeue();
  cout << '\n' ;
  obj.display();
  return 0;
}
