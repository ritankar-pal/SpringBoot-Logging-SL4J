package in.ineuron.beans;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component(value = "dotNet")
public class DotNetCourseMaterial implements ICourse {
	
	private static Logger logger = LoggerFactory.getLogger(DotNetCourseMaterial.class);
	
	static {
		System.out.println("DotNetCourseMaterial.class file generated...)");
	}
	
	public DotNetCourseMaterial () {
		System.out.println("DotNetCourseMaterial: 0 param constructor is created...");
	}


	@Override
	public String courseContent() {
		logger.debug("DotNetCourseMaterial.courseContent()");
		return "1. C# OOPS, 2. Eception Handling 3. C# Collection";
	}

	@Override
	public float price() {
		return 250.0f;
	}

	@Override
	public String toString() {
		return "DotNetCourseMaterial []";
	}
}
