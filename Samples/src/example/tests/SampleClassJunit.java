package example.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleClassJunit {

  @Test
  public void test() {
    Assert.assertEquals(10, new SampleClass(5));
  }

}
