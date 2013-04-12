package example.tests;

public class SquareRootCalculator {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println("args[0] "+args[0]);
    int number =Integer.parseInt(args[0]);
    System.out.println(" "+number);
    int rangeMax=number/2;
    for ( int i=0;i<rangeMax;i++){
      int square=i*i;
      if(number<square){
        int root=i-1;
        System.out.println("square root is "+root);
        break;
      }else if(number == square){
        int root =i;
        System.out.println("square root is "+root);
        break;
      }
    }

  }

}
