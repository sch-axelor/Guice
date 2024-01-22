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
//				private String dbUrl;
//		   private String user;
//		   private Integer timeout;
//
//		   @Inject
//		   public SpellCheckerImpl(String dbUrl, 
//		      String user, 
//		      Integer timeout){
//		      this.dbUrl = dbUrl;
//		      this.user = user;
//		      this.timeout = timeout;
//		   } 
//
//		   @Override
//		   public void checkSpelling() { 
//		      System.out.println("Inside checkSpelling." );
//		      System.out.println(dbUrl);
//		      System.out.println(user);
//		      System.out.println(timeout);
//		   }
//		      SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
//		      return SpellChecker;
//		   }
		
	
//		      bind(SpellChecker.class)
//		         .toProvider(SpellCheckerProvider.class);
//		   } 
		
		
//		      try {
//		         bind(SpellChecker.class)
//		            .toConstructor(SpellCheckerImpl.class.getConstructor(String.class));
//		      } catch (NoSuchMethodException | SecurityException e) {
//		         System.out.println("Required constructor missing");
//		      } 
//		      bind(String.class)
//		         .annotatedWith(Names.named("JDBC"))
//		         .toInstance("jdbc:mysql://localhost:5326/emp");
//		   } 
		
	//	Constructor Injection		  
//		      bind(SpellChecker.class).to(SpellCheckerImpl.class);
//		   } 
		
	//method injection
		
//		      bind(String.class)
//		         .annotatedWith(Names.named("JDBC"))
//		         .toInstance("jdbc:mysql://localhost:5326/emp");
		} 
	}
	
	


