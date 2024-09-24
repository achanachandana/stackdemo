class ArrayStack{
    private final  int maxSize ;
    private int size;
    private int top;
    private final  int[] stackArray ;

    public ArrayStack(int userDefinedSize){
        maxSize =userDefinedSize;
        size =0;
        top=-1;//array index starts at 0
        stackArray = new int[maxSize];

    }
    //isempty:boolean
    public boolean  isEmpty(){
        return (size==0);

    }

    //isfullboolean
    public boolean  isFull(){
        return (size==maxSize);
    }

    //push: void
    public void push(int value){
        if(!isFull()){
            ++top;
            stackArray[top]= value;//or stackArray[++top]=value;
            System.err.println("Added " +value+ " to the top of the stack");
            size++;
            //return;
        }else{
            System.out.println("Stack is full");
           // return;
        }
    }

    //pop: int
    public int pop(){
        if(!isEmpty()){
            int element =stackArray[top];
            top--;
            size--;
            return element;


        }else{
            System.err.println("stack is empty");
            return -1;
        }
    }

    //peek: int
    public int peak(){
        if(!isEmpty()){
            int element =stackArray[top];
            return element;

        }else{
            System.err.println("stack is empty");
            return -1;
        }
    }

    //size :int
    public int size(){
        return size;
    }

}
class StackDemo{
    public static void main(String[] args) {
        ArrayStack stack =new ArrayStack(5);
        System.out.println("added values");
        stack.push(20);
        stack.push(36);
        stack.push(66);
        stack.push(50);
        stack.push(67);
        System.out.println("removing elements from stack:");
        System.out.println("size  pop " +stack.size());
        System.out.println(stack.pop()+ " is removed");
        System.out.println(stack.pop()+ " is removed");
        System.out.println("size after pop " +stack.size());
        System.out.println("peek value " +stack.peak());

    }
}