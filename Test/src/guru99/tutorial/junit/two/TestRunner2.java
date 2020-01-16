package guru99.tutorial.junit.two;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner2 {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyFirstTestClass.class);
		for(Failure fail : result.getFailures()) {
			System.out.println(fail.toString());
		}
		System.out.println("Result=="+result.wasSuccessful());
	}

}
