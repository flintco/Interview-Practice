class Stack {
    static final int MAX_SIZE = 1000;
    int top;
    int[] array = new int[MAX_SIZE];

    boolean isEmpty(){
        if (array.length == 0){
            return true;
        } else {
            return false;
        }
    }
    boolean push(){}
    boolean pop(){}
    boolean peak(){}
}

class Main {
    Stack s = new Stack();
}