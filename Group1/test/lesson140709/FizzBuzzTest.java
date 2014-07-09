package lesson140709;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class FizzBuzzTest {
	private int _input;
	private String _output;
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				{3,"Fizz"},
				{5,"Buzz"},
				{17,"17"},
				{15,"FizzBuzz"},
				{300,"FizzBuzz"},
		});
	}
	
	public FizzBuzzTest(int input, String output) {
		_input = input;
		_output = output;
		
	}
	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void test() {
		assertEquals(_output,fb.convert(_input));
	}
}
