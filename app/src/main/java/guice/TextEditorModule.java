package guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
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
		
//		 bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice"))
//         .to(OpenOfficeWordSpellCheckerImpl.class);
//	      } 
			
		//Constant Bindings
//		   bind(String.class)
//	         .annotatedWith(Names.named("JDBC"))
//	         .toInstance("jdbc:mysql://localhost:5326/emp");
//	   } 
		
		
//		@Provides
//		   public SpellChecker provideSpellChecker(){
//
//		      String dbUrl = "jdbc:mysql://localhost:5326/emp";
//		      String user = "user";
//		      int timeout = 100;
//
//		      SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
//		      return SpellChecker;
//		   }
		
	
		      bind(SpellChecker.class)
		         .toProvider(SpellCheckerProvider.class);
		   } 
	}
	


