
public class ExamineDouble {
  private double doubleVal;

  /**
   * @param args
   */
  
  public static void main(String[] args) {
   ExamineDouble e = new ExamineDouble();
   try {
     e.setDoubleVal(100);
     System.out.println(e.getDoubleVal());
     e.setDoubleVal(100.0);
     System.out.println(e.getDoubleVal());
   } catch (Exception ex){
     
   }
  
  }

  public double getDoubleVal() {
    return doubleVal;
  }

  public void setDoubleVal(double doubleVal) {
    this.doubleVal = doubleVal;
  }

}
