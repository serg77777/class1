package lesson140326.inner;

public class ListenerExample {

	public static class Conditioner implements TemperatureListener {
		public void hot() {
			System.out.println("conditioning on");
		}
		public void cold() {
			System.out.println("conditioning off");
		}

		@Override
		public void changed(int temp) {
			if (temp >= 30) {
				hot();
			}
			if (temp < 0) {
				cold();
			}
		}
	}

	static class Termometer {
		int temp = 0;
		private TemperatureListener _observer;

		public void setListener(TemperatureListener observer) {
			_observer = observer;
		}

		public void inc() {
			temp++;
			_observer.changed(temp);
		}

		public void dec() {
			temp--;
			_observer.changed(temp);
		}
	}

	public static void main(String[] args) {
		Termometer t = new Termometer();
		TemperatureListener o = new Conditioner();
		t.setListener(o);
		t.dec();
		
		t.setListener(new TemperatureListener() {
			@Override
			public void changed(int temp) {
				System.out.println("кажется, дождь начинается");
			}
		});
		
		t.inc();
		t.dec();
	}

}
