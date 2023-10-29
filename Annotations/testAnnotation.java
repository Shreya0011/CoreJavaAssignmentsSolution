package Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Test{
	String str() default "test-case";
}

class test1 {
	
	@Test
	public void check() {
		System.out.println("inside check");
	}
	
	public void check2() {
		System.out.println("inside check2");
	}
}
public class testAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1 obj = new test1();
		
		for(Method method: obj.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(Test.class)) {
				Annotation an = method.getAnnotation(Test.class);
				Test n = (Test)an;
				System.out.println(n.str());
				
				try {
					method.invoke(obj);
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}

}
