
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
    
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.5f,true);
        linkedHashMap.put("kabir", 1);
        linkedHashMap.put("gaurav", 2);
        linkedHashMap.put("nandini", 3);

        for( Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getValue() +": "+ entry.getKey());
        }

        HashMap<String,Integer> hashmap = new HashMap<>();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(hashmap);

        hashmap.put("shuvam", 91);
        hashmap.put("Bob", 80);
        hashmap.put("Akshit", 78);

      Integer res  =  hashmap.getOrDefault("kabir", 0);
      hashmap.putIfAbsent("shuvam", 92);
      System.out.println(res);
    }
}
