package guice;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class TextEditorModule extends AbstractModule  {
	@Override
	   protected void configure() {
		//simple bind
	     // bind(SpellChecker.class).to(SpellCheckerImpl.class);
	      
		
		//linked binding
	    //  bind(SpellChecker.class).to(SpellCheckerImpl.class);
	     // bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
	      
	      //annations	    
//	         bind(SpellChecker.class).annotatedWith(Winword.class)
//	            .to(WinWordSpellCheckerImpl.class);    
		
		//named binding 
		
		 bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice"))
         .to(OpenOfficeWordSpellCheckerImpl.class);
	      } 
	   } 


