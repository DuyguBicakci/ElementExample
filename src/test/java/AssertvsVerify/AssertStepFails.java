package AssertvsVerify;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AssertStepFails {
		
		@Test
		public void test1() {
			int n = 10; 
			int k = 5;
			
			assertEquals(n,k);
			System.out.println("next step in test1");
			assertTrue(n>k);
			
		}
		
		@Test
		public void test2() {
			int n = 10; 
			int k = 5;
			
			assertNotEquals(n,k);
			System.out.println("next step in test1");
			assertTrue(n>k);
			
			
		}

	}


