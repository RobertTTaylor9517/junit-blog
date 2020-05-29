package junitpractice;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Enclosed.class)
public class Testertest {
	
	
	public static class additonAndReverseTest {
		
		Tester testerObject = new Tester();
		
		@Test
		public void test_additionTest() {
			assertThat(testerObject.addition(2, 3), is(5));
		}
		
		@Test
		public void test_reverseStringTest() {
			String inputString = "the";
			
			assertThat(testerObject.reverse(inputString), is("eht"));
		}
	}
	
	
	
	public static class equalsTwoTest {
		Tester testerObject = new Tester();
		
		@Test
		public void test_equalsTwoTrue() {
			assertTrue(testerObject.equalsTwo(2));
		}
		
		@Test
		public void test_equalsTwoFalse() {
			assertFalse(testerObject.equalsTwo(3));
		}
	}
	
	@RunWith(Parameterized.class)
	public static class sortTest{
		Tester testerObject = new Tester();
		int[] expectedData = {1,3,4,6,8};
		
		@Parameters
		public static int[][] data() {
			int expected[][] = {{1,4,6,3,8}, {35, 68, 32, 45}};
			
			return expected;
		}
		
		private int[] input;

		public sortTest(int[] input) {
			super();
			this.input = input;
		}
		
		@Test
		public void test_sorter() {
			assertArrayEquals(expectedData, testerObject.sortArray(input));
		}
		
	}
	
}
