package first.testNG.example;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;



public class TestNGMoreDemo {


	
	@Test(dependsOnMethods= {"secondTest"}, alwaysRun= true)
	public void firstTest() {
		System.out.println("Im first TestNG test");	
	}
	
	///if u want to test performance
	
	@Test (groups= {"group1"}, timeOut=100000)
	public void secondTest() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Im second test");	
	}
	
	
	@Test(enabled=false)
	public void thirdTest() {
		System.out.println("I am third test");	
	}
	
	
}

