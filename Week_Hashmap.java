import java.util.WeakHashMap;

public class Week_Hashmap {
   public static void main(String[] args) {
        WeakHashMap<String, Image> ImageCache = new WeakHashMap<>();
        ImageCache.put(new String("Img1"), new Image("image 1"));
        ImageCache.put(new String("Img1"), new Image("image 2"));
        System.out.println(ImageCache);
       
        System.gc();
        simulateApplicationRuning();

        System.out.println("cache after running (some entries may be  cleared ) :"+ImageCache);
   }


   private static void simulateApplicationRuning(){

    try {
        System.out.println("simulating application running.......");
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        // TODO: handle exception
    }
   }


}
class Image{
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image [name=" + name + "]";
    }
}
    

    
    
    



