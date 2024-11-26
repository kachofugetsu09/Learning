package CONSTRUCTOR;

public class QueueUsingStacks {
    private Stack stack1; // 用于入队操作的栈
    private Stack stack2; // 用于出队操作的栈

    public QueueUsingStacks(int size) {
        this.stack1 = new Stack(size);
        this.stack2 = new Stack(size);
    }

    // 入队操作
    public void enqueue(int value) {
        stack1.push(value);
    }

    // 出队操作
    public int dequeue() {
        if (stack2.isempty()) {
            // 如果 stack2 为空，将 stack1 中的所有元素移到 stack2 中
            while (!stack1.isempty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    // 查看队列头部元素
    public int peek() {
        if (stack2.isempty()) {
            while (!stack1.isempty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    // 检查队列是否为空
    public boolean isEmpty() {
        return stack1.isempty() && stack2.isempty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("队列头部元素: " + queue.peek());

        System.out.println("移除元素: " + queue.dequeue());
        System.out.println("移除元素: " + queue.dequeue());

        System.out.println("队列是否为空: " + queue.isEmpty());
    }
}
