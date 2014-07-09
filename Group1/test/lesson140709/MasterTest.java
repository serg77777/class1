package lesson140709;

import org.jmock.Expectations;
import org.jmock.Sequence;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class MasterTest {

	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();
	
	@Test
	public void test() {
		final Pet pet = context.mock(Pet.class);
		
		final Sequence takeCare = context.sequence("takeCare");
		
		context.checking(new Expectations() {
			{
				oneOf(pet).feed(); inSequence(takeCare);
				oneOf(pet).play(); inSequence(takeCare);
				allowing(pet).pet(); inSequence(takeCare);
			}
		});
		
		Master master = new Master();
		master.takeCare(pet);
	}

}
