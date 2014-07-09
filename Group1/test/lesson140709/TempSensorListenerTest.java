package lesson140709;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class TempSensorListenerTest {

	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();
	
	@Test
	public void test() {
		final SensorListener listener = context.mock(SensorListener.class);
		
		TempSensor sensor = new TempSensor();
		
		sensor.setListener(listener);
		
		context.checking(new Expectations() {
			{
				oneOf(listener).temperatureChanged(with(any(Integer.class)));
			}
		});
		
		sensor.inc();
		
	}

}
