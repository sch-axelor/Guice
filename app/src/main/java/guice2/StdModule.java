package guice2;

import com.google.inject.AbstractModule;

public class StdModule extends AbstractModule{
	
	@Override
	protected void configure() {
		// TODO Auto-generated method stub
	bind(StudentList.class).to(listofstudentImp.class);
		super.configure();
	}
	
	
	
}
