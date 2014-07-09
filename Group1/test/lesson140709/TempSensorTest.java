package lesson140709;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TempSensorTest {

	TempSensor s = new TempSensor();

	@Before
	public void setup() {
		s.setListener(new SensorListener() {
			@Override
			public void temperatureChanged(int newTemp) {
				System.out.println("new temp " + newTemp);
			}
		});
	}
	
	@Test
	public void testSetListener() {
		assertNotNull(s.listener);
		assertTrue(s.listener instanceof SensorListener);
	}
	
	@Test
	public void testIncTemp() throws Exception {
		s.inc();
		assertEquals(21, s.temperature);
	}
	
}
