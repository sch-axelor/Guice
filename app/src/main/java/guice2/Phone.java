package guice2;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String brandName;
    
    @OneToOne
    private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Phone(int id, String brandName, Student student) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.student = student;
	}

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	} 
 
    
    
    
    
}
    
    
    
    
    
    


