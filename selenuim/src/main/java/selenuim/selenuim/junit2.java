package selenuim.selenuim;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit2 {
	@BeforeClass
	public static void bclass() {
		System.out.println(" Before Class");
	}
	@AfterClass
	public  static void aclass() {
		System.out.println("After Class");
	}
		@Test
		public void tc1() {
				System.out.println("Test case1");
			}


		@Before
			public void be() {
				System.out.println(" Before");
			}
		@After

		   public void aft() {
			System.out.println("after");
			   }
		@Test
		public void tc2() {
			System.out.println("test case2");
		}
		}


