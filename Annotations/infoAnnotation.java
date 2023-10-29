package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	
	String AuthorID();
	String Author() default "";
	String Supervisor() default "";
	String Date();
	String Time();
	int Version();
	String Description() default "";
	}


@Info(
	AuthorID = "sbc123",
	Date = "12th dec 1994",
	Time = "1.00 pm",
	Version = 12
)
class DevClass{
	
	@Info(
			AuthorID = "cjh22",
			Author = "jake",
			Supervisor = "judy",
			Date = "23rd oct 2012",
			Time = "8.00 am",
			Version = 11,
			Description = "dev method"
			)
	public void DevMethod() {
		System.out.println("inside dev method");
	}
	
	@Info(
			AuthorID = "efj56",
			Date = "3rd january 2002",
			Time = "4.00 pm",
			Version = 9
		)
	
	int devVariable;
}


public class infoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevClass obj = new DevClass();
		obj.DevMethod();

	}

}
