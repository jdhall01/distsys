package language.casting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//https://blog.frankel.ch/dynamic-casting-java/
//https://nipafx.dev/casting-in-java-8-and-beyond/
public class DynamicCastExample {

	//https://blog.frankel.ch/dynamic-casting-java/
	public static <T> List<T> filter(Class<T> cls, List<?> fruits) {
		return fruits.stream()
				.filter(cls::isInstance)
				.map(cls::cast)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> fruits = new ArrayList<>();
		fruits.add(new Apple(1));
		fruits.add(new Orange(1));
		fruits.add(new Apple(2));
		fruits.add(new Orange(2));
		fruits.add(null);
		
		List<Apple> apples = filter(Apple.class, fruits);
		for(Apple apple: apples) {
			System.out.println(apple);
		}
	}

}
