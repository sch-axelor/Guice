package guice2;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;






@Entity
@Table(name = "student")
public class Student {

	
		@Id
	    private int stidId;
	    private String studName;

		public int getStidId() {
			return stidId;
		}
		public boolean setStidId(int stidId) {
			this.stidId = stidId;
			return false;
		}
		public String getStudName() {
			return studName;
		}
		public boolean setStudName(String studName) {
			this.studName = studName;
			return false;
		}
	   
	    
	  
	   

		

	

		

			
}
