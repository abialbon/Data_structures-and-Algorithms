public class DynamicArrayStack {
    private int size; // total capacity of the stack
    private int length; // no of elements in the stack
    private int[] stack;

    DynamicArrayStack() {
        stack = new int[2];
        size = 2;
    }

    DynamicArrayStack(int s) {
        stack = new int[s];
        size = s;
    }

    public void push(int element) {
        if (length == size) {
            resize(size * 2);
        }
        stack[length++] = element;
    }

    public int pop() throws Exception {
        if (length == 0) { throw new Exception("The stack is empty"); }
        else {
            int temp = stack[length - 1];
            stack[--length] = 0;
            if (length < size/4) resize(size/2);
            return temp;
        }
    }

    private void resize(int newSize) {
        int[] temp = new int[newSize];
        for (int i = 0; i < length; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    public int length() {
        return length;
    }

    public static void main(String[] args) throws Exception {

    }
}
