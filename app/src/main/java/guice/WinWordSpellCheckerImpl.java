package guice;

class WinWordSpellCheckerImpl extends SpellCheckerImpl{
	   @Override
	   public void checkSpelling() {
	      System.out.println("Inside WinWordSpellCheckerImpl.checkSpelling." );
	   } 
	}