package example.tests;

public class SampleClass {
  private int i;

  public SampleClass(int i) {
    this.i=i;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    SampleClass s = new SampleClass(10);
   System.out.println("Hello world "+s.i);
  }

}
