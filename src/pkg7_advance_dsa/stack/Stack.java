package pkg7_advance_dsa.stack;

public class Stack {
    Node head;
    Node top;
    int size=0;

    public int size(){
        return size;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        if (head==null){
            head=top = newNode;
            size++;
        }
        else {
            top.next = newNode;
            top = newNode;
            size++;
        }
    }

    //remove early inserted data
    public Object pop(){
        if (isEmpty()){
            //System.out.println("stack is empty");
            return null;
        }

        Object poppedData = top.data;

        if (size==1){
            head=top=null;
        }else{
            Node temp = head;
            while (temp.next!=top) {
                temp = temp.next;
            }
            temp.next = null;
            top=temp;
        }

        size--;
        return poppedData;
    }

    //Get last inserted data
    public Object peek(){
        return top.data;
    }

    public int search(Object data){
        if (isEmpty()){
            return -1;
        }

        Node temp = head;
        int index=0;
        
        while (temp!=null){
            if (temp.data==data){
                return index;
            }
            index++;
            temp=temp.next;
        }
        return -1;
    }
    public boolean isEmpty(){
        return size==0;
    }

    //display stack
    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println();
    }
}
