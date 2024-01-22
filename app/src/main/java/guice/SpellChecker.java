package guice;

import com.google.inject.ImplementedBy;

@ImplementedBy(SpellCheckerImpl.class)


public interface SpellChecker {
	 public void checkSpelling();

	 public double getId();
	 

}
