package example.tests;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class StringDuplicates {

  /**
   * @param args
   * Anser to the question in the link http://www.ardendertat.com/2012/01/06/programming-interview-questions-25-remove-duplicate-characters-in-string/ 
   * For any string specified remove the duplicate elements from the string 
   */
  public static void main(String[] args) {
    System.out.println(" "+args[0]);
    // used LinkedHashSet here as the order is maintained and duplicates are not inserted. Making use of the inbuilt Java functionality
    /**
     * Java in-built O(n)
     */
    LinkedHashSet<Character> removedDuplicates = new LinkedHashSet<Character>();
    char[] input = args[0].toCharArray();
    for ( int i=0;i< args[0].length();i++){
      removedDuplicates.add(input[i]);
    }
    for ( Character i : removedDuplicates){
      System.out.println(i);
    }
    /**
     * brute force O(n^2)
     */
    char[] output = new char[args[0].length()] ;int k=0;boolean flag=true;
    for ( int i =0;i< args[0].length();i++){
      char c = input[i];
      for( int j=0;j<output.length;j++){
        if(output[j]==c){
          flag=false;
          break;
        }  
      }
      if(flag){
        output[k]=c;k++;
        flag=true;
      } else {
        flag=true;
      }
    }
    String outputS = new String(output);
    System.out.println(outputS);
    
    /**
     * Algorithm o(n) 
     */
    Set<Character> output2 = new HashSet<Character>(); 
    for ( int i=0;i<input.length;i++){
      output2.add(input[i]);
    }
    outputS = new String(output);
    System.out.println(outputS);    
  }

}
