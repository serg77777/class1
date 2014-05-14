package lesson140512.generics;

public class InstancesOfParamTypes {

	static class A<T> {
		
		T t = new T();  // ERROR!
	}
	
}
