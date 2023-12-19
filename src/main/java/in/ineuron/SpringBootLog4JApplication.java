package in.ineuron;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import in.ineuron.beans.Student;


@SpringBootApplication
@ImportResource(locations = "applicationContext.xml")
public class SpringBootLog4JApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootLog4JApplication.class, args);
		
		System.out.println();
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
		
		student.preparation("java");
		
		((ConfigurableApplicationContext) context).close();
	}

}
