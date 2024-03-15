import java.util.*;

public class waterjugproblem {
    public static void main(String[] args) {
        int jug1Capacity = 5;
        int jug2Capacity = 3;
        int targetAmount = 4;

        Stack<State> stack = new Stack<>();
        stack.push(new State(0, 0));

        while (!stack.isEmpty()) {
            State currentState = stack.pop();
            if (currentState.jug1 == targetAmount || currentState.jug2 == targetAmount) {
                System.out.println("Solution found:");
                currentState.printPath();
                break;
            }

            if (currentState.jug1 < jug1Capacity) {
                stack.push(currentState.fillJug1());
            }

            // Fill jug2
            if (currentState.jug2 < jug2Capacity) {
                stack.push(currentState.fillJug2());
            }

            // Empty jug1
            if (currentState.jug1 > 0) {
                stack.push(currentState.emptyJug1());
            }

            // Empty jug2
            if (currentState.jug2 > 0) {
                stack.push(currentState.emptyJug2());
            }

            // Pour from jug1 to jug2
            if (currentState.jug1 > 0 && currentState.jug2 < jug2Capacity) {
                stack.push(currentState.pourJug1ToJug2());
            }

            // Pour from jug2 to jug1
            if (currentState.jug2 > 0 && currentState.jug1 < jug1Capacity) {
                stack.push(currentState.pourJug2ToJug1());
            }
        }
    }
}

class State {
    int jug1;
    int jug2;
    State prevState;

    public State(int jug1, int jug2) {
        this.jug1 = jug1;
        this.jug2 = jug2;
    }

    public State fillJug1() {
        return new State(5, this.jug2);
    }

    public State fillJug2() {
        return new State(this.jug1, 3);
    }

    public State emptyJug1() {
        return new State(0, this.jug2);
    }

    public State emptyJug2() {
        return new State(this.jug1, 0);
    }

    public State pourJug1ToJug2() {
        int amountToPour = Math.min(this.jug1, 3 - this.jug2);
        return new State(this.jug1 - amountToPour, this.jug2 + amountToPour);
    }

    public State pourJug2ToJug1() {
        int amountToPour = Math.min(this.jug2, 5 - this.jug1);
        return new State(this.jug1 + amountToPour, this.jug2 - amountToPour);
    }

    public void printPath() {
        if (prevState != null) {
            prevState.printPath();
        }
        System.out.println("(" + jug1 + ", " + jug2 + ")");
    }
}
