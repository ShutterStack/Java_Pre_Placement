class Stacks{
    final int capacity=10;
    int stack[] = new int[capacity];
    int top =-1;

    public boolean isEmpty() {
        if (top ==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if (top == capacity-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int val){
        if (!isFull()){
            stack[++top] = val;
        }else{
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        if (!isEmpty()){
            stack[top] = 0;
            top--;
        }else{
            System.out.println("Stack is empty");
        }
    }

    public void peek(){
        System.out.println("Element peeked on stack top: "+stack[top]);
    }
}


public class towerofhanoi {
    int itr = 1;
    Stacks s1 = new Stacks();
    Stacks s2 = new Stacks();
    Stacks s3 = new Stacks();

    public void show(){
        System.out.println("\t\tIteration: "+itr++);
        System.out.println("\tTower 1 \tTower 2 \tTower 3");
        for (int i=2;i>=0;i--){
            System.out.println("|\t"+s1.stack[i]+"\t|\t"+s2.stack[i]+"\t|\t"+s3.stack[i]+"\t|");
            System.out.println("-------------------------------------------------");
        }
        
    }
    public static void main(String[] args) {
        towerofhanoi h = new towerofhanoi();

        //itr 1
        h.s1.push(3);
        h.s1.push(2);
        h.s1.push(1);
        h.show();

        //itr 2+
        h.s1.pop();
        h.s3.push(1);
        h.show();

        //itr 3
        h.s1.pop();
        h.s2.push(2);
        h.show();

        //itr 4
        h.s3.pop();
        h.s2.push(1);
        h.show();

        //itr 5
        h.s1.pop();
        h.s3.push(3);
        h.show();

        //itr 6
        h.s2.pop();
        h.s1.push(1);
        h.show();

        //itr 7
        h.s2.pop();
        h.s3.push(2);
        h.show();

        //itr 8
        h.s1.pop();
        h.s3.push(1);
        h.show();
    }
}