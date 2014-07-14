package tetris;

import static org.junit.Assert.*;

import org.junit.Test;

public class FieldTest {

	@Test
	public void test() {
		Field field = new Field(20,10);
		assertEquals(20, field.box.length);
		assertEquals(10, field.box[0].length);
	}

}
