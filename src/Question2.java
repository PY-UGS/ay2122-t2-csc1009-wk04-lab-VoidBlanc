public class Question2 {
    public static void main(String[] args){
        int capacity = 10;
        StackOfIntegers stack = new StackOfIntegers(capacity);
        for (int i = 0; i < capacity; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}