package in.ineuron.beans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Student {
	
	private static Logger logger = LoggerFactory.getLogger(Student.class);
	
	@Autowired
	@Qualifier("courseId")
	private ICourse course;
	
	static {
		System.out.println("Student.class file generated...)");
	}
	
	public Student() {
		System.out.println("Student: 0 param constructor is created...");
	}
	
	public void preparation(String examName) {
		
		logger.debug("Student.preparation()");
		
		System.out.println("Course choosen is: " + course.getClass().getName());
		
		String courseContent = course.courseContent();
		logger.info("Choosen courses are: " + courseContent);
		
		float price = course.price();
		logger.info("Course Price is Rs " + price);
		
		System.out.println("Preparation is going on for " + courseContent + " purchased for Rs. " + price);
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
}
