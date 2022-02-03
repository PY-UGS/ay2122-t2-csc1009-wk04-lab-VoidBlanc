import java.util.Arrays;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers(){
        elements = new int[16];
        size = -1;
    }

    public StackOfIntegers(int capacity){
        elements = new int[capacity];
        size = -1;
    }

    public boolean empty(){
        if (size == -1){
            return true;
        }else{
            return false;
        }
    }

    public int peek(){
        return elements[this.size];
    }

    public void push(int value){
        size += 1;
        elements[size] = value;
    }

    public int pop(){
        int result = elements[size];
        if (size != -1){
            size -= 1;
            int[] temp = Arrays.copyOfRange(elements,0,size+1);
            elements = temp;
        }
        return result;
    }

    public int getSize(){
        return this.size;
    }

}
