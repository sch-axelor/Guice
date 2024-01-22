package guice;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
@Singleton
public class SpellCheckerImpl implements SpellChecker{


//	@Override
//	   public void checkSpelling() {
//	      System.out.println("Inside checkSpelling." );
//	   } 
	  // private String dbUrl;
	
	//optional injection
//	private String dbUrl = "jdbc:mysql://localhost:5326/emp";
//
//	   public SpellCheckerImpl(){}
//	   
//	   @Inject(optional=true)
//	   public void setDbUrl(@Named("JDBC") String dbUrl){
//	      this.dbUrl = dbUrl;
//	   }
//
//	   @Override
//	   public void checkSpelling() { 
//	      System.out.println("Inside checkSpelling........." );
//	      System.out.println(dbUrl); 
//	   }
	
	
	//  OPTIONAL INJECTION	
//	public SpellCheckerImpl(){}
//	   
//	   @Override
//	   public void checkSpelling() { 
//	      System.out.println("Inside checkSpelling. ondemand injction" );
//	   }
	
	
	//scopes
	
	 double id; 
	   public SpellCheckerImpl(){
	      id = Math.random();    
	   }

	   @Override
	   public void checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	   }

	   @Override
	   public double getId() { 
	      return id;
	   }
}
