package lesson140709;

public class TempSensor {

	SensorListener listener;
	int temperature = 20;

	public void setListener(SensorListener sensorListener) {
		this.listener = sensorListener;
	}
	
	public void inc() {
		temperature++;
		listener.temperatureChanged(temperature);
	}

	
}
