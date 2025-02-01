import java.util.HashMap;
import java.util.Map.Entry;
// import java.util.Set;

public class Hash_Map {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "kabir");
        map.put(2, "nandini");
        map.put(3, "kavyansh");
        map.put(4, "nainshi");
        String student = map.get(2);
        System.out.println(student);
        map.containsKey(2);
        map.containsValue("kabir");
 
        // Set<Integer>  keys = map.keySet();
        for(int i : map.keySet()){
           System.out.println(map.get(i));
        }
        

        // Set<Map.Entry<Integer,String> entries= new map.entrySet();
        for(Entry<Integer, String> i : map.entrySet()){
            i.setValue(i.getValue().toUpperCase());
        //    System.out.println(i.getKey()+": "+i.getValue()); 
        }
        System.out.println(map);

        map.remove(1);
    }
}