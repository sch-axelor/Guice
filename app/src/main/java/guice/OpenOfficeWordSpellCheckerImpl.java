package guice;

public class OpenOfficeWordSpellCheckerImpl extends SpellCheckerImpl{
	   @Override
	   public void checkSpelling() {
	      System.out.println("Inside OpenOfficeWordSpellCheckerImpl.checkSpelling. Named binding " );
	   } 
	}
