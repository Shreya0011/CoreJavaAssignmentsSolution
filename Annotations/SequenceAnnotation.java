package Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	
	int Sequence() default 0;
	
}


class MyClass{
	
	@Execute(Sequence=2)
	public void myMethod1() {
		System.out.println("in method 1");
	}
	
	
	@Execute(Sequence = 1)
	public void myMethod2() {
		System.out.println("in method 2");
	}
	
	
	@Execute(Sequence = 3)
	public void myMethod3() {
		System.out.println("in method 3");
	}
	
}



public class SequenceAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj = new MyClass();
		
		Map<Integer, Method> order = new TreeMap<>();
		
		for(Method method : obj.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(Execute.class)) {
				Annotation an = method.getAnnotation(Execute.class);
				Execute ex = (Execute)an;
				order.put(ex.Sequence(), method);
				
			}
		}
		
		for(Integer seq: order.keySet()) {
			Method m = order.get(seq);
			try {
				m.invoke(obj);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
