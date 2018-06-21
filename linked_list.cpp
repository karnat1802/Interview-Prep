#include <iostream>
#include <string>
using namespace std;

struct Node{
    int item;
    Node *next;
};


class List
{
    private:
    Node *head, *tail;
    public:
    
    List()
    {
        head = NULL;
        tail = NULL;
    }
    
    void createNode(int val)
    {
        Node *temp = new Node;
        temp->item = val;
        temp->next = NULL;
        if(head == NULL)
        {
            head = temp;
            tail = temp;
            temp = NULL;
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
            cout << temp->item << " ";
            temp = temp->next;
               
        }
        
    }
    int size()
    {
        Node *temp = new Node;
        temp = head;
        int size= 0;
        while(temp!=NULL)
        {
            size++;
            temp = temp->next; 
        }
    return size;        
    } 
    bool isEmpty()
    {
        if(head==NULL)
        {
            return true;
        }
        else{
            return false;    
        }
        
    }
    
    int valueAt(int pos)
    {
      if(pos-1 == 0)
      {
        return head->item;
      }
      else{
        Node *temp = new Node;
        temp  =head; 
        int i=0;
        while(temp!=NULL)
        {
            i++;
            if (i==pos)
            {
                return temp->item;
                break;
            }
            temp = temp->next;
        }
        return -1;
      
          
      }
      
    }
    
    void push_front(int val)
    {
        Node *temp = new Node;
        temp->item  =val;
        temp->next = head;
        head = temp;
    }
    
    int pop_front()
    {
        int val = head->item;
        head = head ->next;
        return val;
    }
    
    void push_back(int val){
        Node *newNode = new Node;
        Node *temp = new Node;
        newNode->item = val;
        newNode->next = NULL;
        // temp = head;
        // while(temp->next!=NULL)
        // {
        //     temp = temp->next;    
        // }
        // temp->next = newNode;
        tail->next = newNode;
        tail = newNode;
        
    }
    
    int front()
    {
        if(head !=NULL)
        {
            return head->item;
        }
        else {
            return -1;   
        }
    }
    
    int back()
    {
        // Node *temp = new Node;
        // temp = head;
        // while (temp->next!=NULL)
        // {
        //     temp = temp->next;    
        // }
        return tail->item;
        
    }
    
    int  pop_back()
    {
        Node *temp = new Node;
        temp = head;
        while(temp->next->next != NULL)
        {
            temp = temp->next;    
        }
        
        int val = temp->next->item;
        tail = temp;
        temp->next = NULL;
        return val;
    }   
    
    void insert(int val,int pos)
    {
        Node *temp = new Node;
        temp = head;
        Node *node = new Node;
        node->item = val;
        node->next = NULL;
        Node *prev = new Node;
        int index = 0;   
        if(pos ==0)
        {
            node->next = head;
            head = node;
            return;
        }
        else{
            while(index!=pos && temp!=NULL)
            {
                prev = temp;
                
                temp = temp->next;
                index++;
            }
            if(temp==NULL)
            {
                node->next = temp;
                prev->next = node;
                tail = node;
                return ;
            }
            else
            {
                
            node->next = temp;
            prev->next = node;
            return ;
            }
        }
        
        
    }
    
    void erase(int pos)
    {
     if(pos==0)
     {
        Node *t = new Node;
        t = head;
        head = head ->next;
        delete t;
        return;
     }
     else
     {
        int index = 0;
        Node *prev = new Node;
        Node *temp = new Node;
        temp = head;
        while(index!=pos && temp!=NULL){
            prev = temp;
            temp = temp->next;
            index++;
        }
        if(temp->next == NULL)
        {
            prev->next = temp->next;
            tail = prev;
        delete temp;
        return;
        }
        else{
        prev->next = temp->next;
            
        delete temp;
        return;
        } 
     }
     
    }
    
    void remove_value(int val)
    {
        if(head->item ==val)
        {
            Node *temp = new Node;
            temp = head;
            head = head->next;
            delete temp;
            return;
        }
        else{
            Node *prev = new Node;
            Node *temp = new Node;
            temp = head;
            while (temp->item!=val)
            {
                prev= temp;
                temp = temp->next;
            }
            
            prev->next = temp->next;
            temp->next = NULL;
            delete temp;
            return;
        }
    }
    
    int value_n_from_end(int pos)
    {
        Node *temp = new Node;
        temp = head;
        int size  = 0;
        while(temp->next!=NULL)
        {
            temp = temp->next;
            size++;
        }
        int newpos = size - pos;
        int index = 0;
        Node *curr = new Node;
        curr = head;
        while(index!=newpos)
        {
            curr = curr->next;
            index++;
        }
        return curr->item;
    }
    void reverse()
    {
        Node *curr = new Node;
        Node *prev = NULL;
        Node *next = NULL;
        curr = head;
        while(curr!=NULL)
        {
            next = curr->next;
            curr->next = prev;
            if(prev == NULL)
            {
                tail = curr;    
            }
            
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }
};
    

int main(){
    List obj;
    obj.createNode(10);
    obj.createNode(20);
    obj.display();
    cout << obj.size() <<endl;
    obj.createNode(40);
    cout << obj.size() <<endl ;
    cout <<  obj.isEmpty() << endl;
    cout << obj.valueAt(2) << endl;
    obj.createNode(30);
    obj.createNode(50);
    obj.display();
    cout << "\n" ;
    cout << obj.valueAt(5) << endl;
    
    obj.push_front(5);
    obj.display();
    cout << obj.pop_front() << endl;
    obj.display();
    obj.push_back(60);
    cout << "\n" ;
    obj.display();
    cout << "\n" ;
    cout << obj.front() << endl;
    cout << obj.back() << endl;     
    // obj.pop_back();
    // obj.createNode(90);
    obj.display();
     cout << "\n" ;
    obj.pop_back();
     cout << "\n" ;
    obj.display();
    
    obj.pop_back();
     cout << "\n" ;
    obj.display();
     cout << "\n" ;
    obj.insert(5,0);
    obj.display();
    
     cout << "\n" ;
    obj.insert(80,5);
    obj.display();
     cout << "\n" ;
     obj.erase(1);
    obj.display();
     cout << "\n" ;
     obj.erase(1);
    obj.display();
    
     cout << "\n" ;
     obj.erase(0);
    obj.display();
    cout << "\n" ;
    cout << obj.value_n_from_end(1) << endl;
    
    return 0 ;
};