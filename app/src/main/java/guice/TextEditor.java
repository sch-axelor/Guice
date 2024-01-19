package guice;

import com.google.inject.Inject;

public class TextEditor {
	private SpellChecker spellChecker;

//	   @Inject
//	   public TextEditor(SpellChecker spellChecker) {
//	      this.spellChecker = spellChecker;
//	   }
//
//	   public void makeSpellCheck(){
//	      spellChecker.checkSpelling();
//	   }
	   
	
	//using annotaions
	@Inject
	   public TextEditor(@Winword SpellChecker spellChecker) {
	      this.spellChecker = spellChecker;
	   }

	   public void makeSpellCheck(){
	      spellChecker.checkSpelling(); 
	   } 

}
