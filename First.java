import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class First {



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        Integer removeElement = stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());





        // linkedlist as stack 

        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.getLast(); // peek

        list.removeLast(); // pop

        list.size();
        list.isEmpty();


        // array as stack

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.get(list.size()-1); // peek 
        list1.remove(list.size() -1);  //pop
        
    }
}