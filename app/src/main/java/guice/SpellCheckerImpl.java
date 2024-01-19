package guice;

import com.google.inject.Inject;

public class SpellCheckerImpl implements SpellChecker{


	@Override
	   public void checkSpelling() {
	      System.out.println("Inside checkSpelling." );
	   } 

}
