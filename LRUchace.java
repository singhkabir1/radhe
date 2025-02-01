import java.util.LinkedHashMap;

public class LRUchace<K,V> extends LinkedHashMap<K,V>  {
    private int capacity;

    public LRUchace(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        
        return size() > capacity ;
    }


    public static void main(String[] args) {
       LRUchace<String,Integer> studentMap = new LRUchace<>(3);
       studentMap.put("kabir", 1);
       studentMap.put("nandini", 2);
       studentMap.put("kavyansh", 3);
       studentMap.get("kabir");
       studentMap.put("hitesh", 4);

       studentMap.get("hitesh");

       System.out.println(studentMap);
    }
}
