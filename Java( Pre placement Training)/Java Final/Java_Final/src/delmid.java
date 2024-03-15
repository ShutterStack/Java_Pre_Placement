public class delmid {
    final int CAPACITY = 10;
    int TOP = -1;
    int[] Stacks = new int[CAPACITY];

    public boolean isFull() {
        if (TOP >= CAPACITY - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (TOP == -1) {
            return true;
        }
        return false;
    }

    public void push(int n) {
        if (!isFull()) {
            TOP++;
            Stacks[TOP] = n;
        } else {
            System.out.println("The Stack is full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int res = Stacks[TOP];
            Stacks[TOP] = 0;
            TOP--;
            return res;
        } else {
            System.out.println("The Stack is empty, cannot pop");
        }
        return 0;
    }

    public void traverse() {
        if (!isEmpty()) {
            for (int i = TOP; i >= 0; i--) {
                System.out.println(Stacks[i]);
            }
        } else {
            System.out.println("The Stack is empty");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        delmid stack = new delmid();
        for (int i = arr.length; i > 0; i--) {
            stack.push(i);
        }
        stack.traverse();
        int mid = (int) stack.TOP / 2;
        delmid tempStack = new delmid();
        for (int i = 0; i <= mid; i++) {
            tempStack.push(stack.pop());
        }
        System.out.println("--------------------------------");
        tempStack.traverse();
        tempStack.pop();
        for (int i = 0; i <= tempStack.TOP + 1; i++) {
            stack.push(tempStack.pop());
        }
        System.out.println("--------------------------------");
        stack.traverse();
    }
}