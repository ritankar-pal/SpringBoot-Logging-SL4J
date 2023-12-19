package in.ineuron.beans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Component(value = "java")
public class JavaCourseMaterial implements ICourse {

	private static Logger logger = LoggerFactory.getLogger(JavaCourseMaterial.class);
	
	static {
		System.out.println("JavaCourseMaterial.class file generated...)");
	}
	
	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial: 0 param constructor is created...");
	}
	
	@Override
	public String courseContent() {
		logger.debug("JavaCourseMaterial.courseContent()");
		return "1. OOPS 2. Exception Handling 3. Collection...";
	}

	@Override
	public float price() {
		return 450.500f;
	}

	@Override
	public String toString() {
		return "JavaCourseMaterial []";
	}
	
}
