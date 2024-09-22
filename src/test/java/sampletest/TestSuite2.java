package sampletest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

public class TestSuite2 {

   //@Test
   public void negativeTest1() {

        fail("negativeTest1 to test Failure result");
   }

   //@Test
   public void negativeTest2() throws Exception {

        throw new Exception("negativeTest2 to test Error result");

    }

   @Disabled("negativeTest3 to test Skip result")
   @Test
   public void negativeTest3() {
       //not executed
     
   }

}
