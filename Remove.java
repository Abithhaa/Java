import java.util.LinkedList;

public class Remove {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Cherry");
        linkedList.add("Plum");

        
        System.out.println("Original LinkedList: " + linkedList);

        
        linkedList.clear();

        
        System.out.println("Modified LinkedList: " + linkedList);
    }
}
