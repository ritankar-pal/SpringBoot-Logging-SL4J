package in.ineuron.beans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component(value = "uiCourse")
public class UICourseMaterial implements ICourse {

	private static Logger logger = LoggerFactory.getLogger(UICourseMaterial.class);
	
	static {
		System.out.println("UICourseMaterial.class file generated...)");
	}
	
	public UICourseMaterial () {
		System.out.println("UICourseMaterial: 0 param constructor is created...");
	}
	
	@Override
	public String courseContent() {
		logger.debug("UICourseMaterial.courseContent()");
		return "1. HTML 2. CSS 3. JavaScript";
	}

	@Override
	public float price() {
		return 500.32f;
	}

	@Override
	public String toString() {
		return "UICourseMaterial []";
	}
	
}
