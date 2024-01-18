package demo;

import com.google.inject.Inject;
import com.google.inject.name.Named;


public class TextEditor {
	private SpellChecker spellChecker;
	//Constant binding
//	private String dbUrl;
//	   @Inject
//	   public TextEditor(@Named("JDBC") String dbUrl) {
//	      this.dbUrl = dbUrl;
//	   }
//
//	   public void makeConnection(){
//	      System.out.println(dbUrl);
//	   } 
	   //named binding 
//	@Inject
//	   public TextEditor(@Named("OpenOffice") SpellChecker spellChecker) {
//	      this.spellChecker = spellChecker;      
//	   }
//
//	   public void makeSpellCheck(){
//	      spellChecker.checkSpelling();
//	   }
	   
	   public TextEditor( SpellChecker spellChecker) {
		      this.spellChecker = spellChecker;
		   }
		   public void makeSpellCheck(){
		      spellChecker.checkSpelling();
		   } 

}
