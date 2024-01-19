package guice;

import com.google.inject.AbstractModule;

public class TextEditorModule extends AbstractModule  {
	@Override
	   protected void configure() {
		//simple bind
	     // bind(SpellChecker.class).to(SpellCheckerImpl.class);
	      
		
		//linked binding
	      bind(SpellChecker.class).to(SpellCheckerImpl.class);
	      bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
	   } 

}
