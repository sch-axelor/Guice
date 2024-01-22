package guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker{


//	@Override
//	   public void checkSpelling() {
//	      System.out.println("Inside checkSpelling." );
//	   } 
	  // private String dbUrl;
	   @Inject @Named("JDBC")
	   private String dbUrl;
	  
	   public SpellCheckerImpl(){}
	   
	   @Inject 
	   public void setDbUrl(@Named("JDBC") String dbUrl){
	      this.dbUrl = dbUrl;
	   }

	   @Override
	   public void checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	      System.out.println(dbUrl); 
	   }
}
