import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stack capacity : ");
        int capacity = sc.nextInt();
        StackOfIntegers stack = new StackOfIntegers(capacity);

        for (int i = 0; i < capacity; i++) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}