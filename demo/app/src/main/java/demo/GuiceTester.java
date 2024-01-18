package demo;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class GuiceTester {
   public static void main(String[] args) {
      Injector injector = Guice.createInjector(new TextEditorModule());
      TextEditor editor = injector.getInstance(TextEditor.class);
      
      //named buinding 
    //  editor.makeSpellCheck();
      
      //Constant Bindings
      //editor.makeConnection();
      
      //@Provides Annotation 
      editor.makeSpellCheck();
   } 
}

