package guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import java.lang.annotation.Target;
import com.google.inject.BindingAnnotation;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD }) @Retention(RUNTIME)
@interface Winword{}

public class GuiceTester {
	public static void main(String[] args) {
		//	      Injector injector = Guice.createInjector(new TextEditorModule());
		//	      TextEditor editor = injector.getInstance(TextEditor.class);
		//	      SpellChecker spellChecker = new SpellCheckerImpl();
		//	      injector.injectMembers(spellChecker);
		//	      
		//	     
		//	      editor.makeSpellCheck();
		//	   } 
	
		
		//scope
		
		 Injector injector = Guice.createInjector(new TextEditorModule());
	      SpellChecker spellChecker = new SpellCheckerImpl();
	      injector.injectMembers(spellChecker);

	      TextEditor editor = injector.getInstance(TextEditor.class);     
	      System.out.println(editor.getSpellCheckerId());

	      TextEditor editor1 = injector.getInstance(TextEditor.class);     
	      System.out.println(editor1.getSpellCheckerId());
	}
		
}	
