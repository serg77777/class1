package lesson140428.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class A {
	
	@What(description = "This is my second annotation")
	@MyAnno(str = "Example")
	@That("hello")
	@Marker
	@Deprecated
	public static void myMethod() {
		Class clazz = A.class;
		try {
			Method method = clazz.getMethod("myMethod");
			MyAnno anno = method.getAnnotation(MyAnno.class);
			System.out.println("Str = " + anno.str() + ", val = " + anno.val());
			
			for (Annotation annotation : method.getAnnotations()) {
				System.out.println(annotation);
			}
			
			System.out.println("has marker = " + 
			method.isAnnotationPresent(Marker.class));
			
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myMethod();
	}

}
