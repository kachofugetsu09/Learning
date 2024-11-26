package CONSTRUCTOR;

public class Stack {
    private int maxSize;
    private int[] stackarr;
    private int top;
    public Stack(int size){
        this.maxSize=size;
        this.stackarr=new int[size];
        this.top=-1;
    }
    public void push(int value){
        if(isfull()){
            return;
        }
        stackarr[++top]=value;
    }
    public int pop(){
        if(isempty()){
            return -1;
        }
        return stackarr[top--];
    }
    public int peek(){
        if(isempty()){
            return -1;
        }
        return stackarr[top];
    }
    public boolean isempty(){
        return(top==-1);
    }
    public boolean isfull(){
        return(top==maxSize-1);
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5); // 创建一个容量为 5 的栈

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("栈顶元素: " + stack.peek());

        System.out.println("弹出元素: " + stack.pop());
        System.out.println("弹出元素: " + stack.pop());

        System.out.println("栈是否为空: " + stack.isempty());
    }
}
