package guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Simple {
	
	public interface Service {
        void execute();
    }
	 public static void main(String[] args) {
	       
	        Injector injector = Guice.createInjector(new LinkedBindingModule());

	      
	        Client client = injector.getInstance(Client.class);

	        client.performAction();
	    }
	
	
	 public static class LinkedBindingModule extends AbstractModule {
	        @Override
	        protected void configure() {
	         
	           // bind(Service.class).to(ServiceImpl1.class);
	            bind(Service.class).to(ServiceImpl2.class);
	        }
	    }
	 
	 public static class Client {
	        private final Service service;

	        @Inject
	        public Client(Service service) {
	            this.service = service;
	        }

	        public void performAction() {
	            service.execute();
	        }
	    }
	 public static class ServiceImpl1 implements Service {
	        @Override
	        public void execute() {
	            System.out.println("Executing 1 class ");
	        }
	    }
		
		 public static class ServiceImpl2 implements Service {
		        @Override
		        public void execute() {
		            System.out.println("Executing 2 class");
		        }
		    }
	

}
