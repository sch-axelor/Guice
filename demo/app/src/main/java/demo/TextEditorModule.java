package demo;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class TextEditorModule extends AbstractModule {
	 @Override
	   protected void configure() {
		 
		 //simple bindings
//	      bind(SpellChecker.class).to(SpellCheckerImpl.class);
		 
		 
		 //Linked Bindings
//		 bind(SpellChecker.class).to(SpellCheckerImpl.class);
//	      bind(SpellCheckerImpl.class).to(WinWordSpellCheckerImpl.class);
		 
		 //named binding 
		  // bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(OpenOfficeWordSpellCheckerImpl.class);
		  
//		  contains binding 
//		      bind(String.class)
//		         .annotatedWith(Names.named("JDBC"))
//		         .toInstance("jdbc:mysql://localhost:5326/emp");
//		   } 
		 
		 
		      
		      
		   } 
	  


