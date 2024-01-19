package guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

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
	   
	
// 		using annotaions
	
// 		@Inject
//	   public TextEditor(@Winword SpellChecker spellChecker) {
//	      this.spellChecker = spellChecker;
//	   }
//
//	   public void makeSpellCheck(){
//	      spellChecker.checkSpelling(); 
//	   } 
	   
	
	//named binding 
//	   @Inject
//	   public TextEditor(@Named("OpenOffice") SpellChecker spellChecker) {
//	      this.spellChecker = spellChecker;      
//	   }
//
//	   public void makeSpellCheck(){
//	      spellChecker.checkSpelling(); 
//	   } 
 
		//Constant Bindings
//	 private String dbUrl;
//	   @Inject
//	   public TextEditor(@Named("JDBC") String dbUrl) {
//	      this.dbUrl = dbUrl;
//	   }
//
//	   public void makeConnection(){
//	      System.out.println(dbUrl);
//	   } 


	//@Provides Annotation
	
	@Inject
	   public TextEditor( SpellChecker spellChecker) {
	      this.spellChecker = spellChecker;
	   }
	   public void makeSpellCheck(){
	      spellChecker.checkSpelling();
	   } 




}


