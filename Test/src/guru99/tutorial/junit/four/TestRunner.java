package guru99.tutorial.junit.four;

import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;		

public class TestRunner {				
			public static void main(String[] args) {									
      Result result = JUnitCore.runClasses(Junit4AssertionTest.class);					
			for (Failure failure : result.getFailures()) {							
         System.out.println(failure.toString());					
      }		
      System.out.println("Result=="+result.wasSuccessful());							
   }		
}