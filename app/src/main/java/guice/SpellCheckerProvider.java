package guice;

import com.google.inject.Provider;

public class SpellCheckerProvider implements Provider<SpellChecker>{

	   @Override
	   public SpellChecker get() {
	      String dbUrl = "jdbc:mysql://localhost:5326/emp";
	      String user = "user";
	      int timeout = 101;

	      SpellChecker SpellChecker = new SpellCheckerImpl();
	      return SpellChecker;
	   } 

}
