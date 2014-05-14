package lesson140312.interfaces;

public class TestInstruments {

	public static void main(String[] args) {

		WindInstrument windInstrument = new Trombon();
		MusicInstrument musicInstrument = new Violin();
		
//		Violin viloin = new Trombon();  ERROR
//		Violin violin = musicInstrument;  ERROR 
		Violin violin = (Violin) musicInstrument;
		violin.piccicato();
		
		Cleanable c = new Violin();
		c.clean();
		
		Violin v = (Violin) c;
		v.play();
		
		Trombon t = (Trombon) c;
		
//		musicInstrument.piccicato();

		takeCare(windInstrument);
		takeCare(musicInstrument);

		Cleanable[] objectsToClean = new Cleanable[3];
		objectsToClean[0] = windInstrument;
		objectsToClean[1] = musicInstrument;
		objectsToClean[2] = new Table();

		cleanAll(objectsToClean);

		musicInstrument = new Trombon();
		musicInstrument.play();
		System.out.println(musicInstrument.getClass().getSimpleName());

	}

	private static void cleanAll(Cleanable[] cleanables) {
		for (Cleanable cleanable : cleanables) {
			cleanable.clean();
		}
	}

	private static void takeCare(MusicInstrument instrument) {
		instrument.play();
		instrument.clean();
	}

}
