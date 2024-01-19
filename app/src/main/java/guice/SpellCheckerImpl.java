package guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class SpellCheckerImpl implements SpellChecker{


	private String dbUrl;

	   public SpellCheckerImpl(){}

	   public SpellCheckerImpl(@Named("JDBC") String dbUrl){
	      this.dbUrl = dbUrl;
	   } 

	   @Override
	   public void checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	      System.out.println(dbUrl); 
	   }

}
