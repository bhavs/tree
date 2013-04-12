import java.util.Hashtable;


public class HelloWorld2 {
  public static void main(String[] args){
    Hashtable<HelloWorld,Integer> sample = new Hashtable<HelloWorld, Integer>();
    sample.put(new HelloWorld(), 1);
  }

}
