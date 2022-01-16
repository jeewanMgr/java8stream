package java8stream.functionalinterface;

import java.util.function.*;
public class PredicateDemo {
	
	public static void main(String[] args) {
		Predicate<String> data = rawdata-> rawdata.length()<10;
		
		System.out.println("Apple lenght is smaller than 10: "+ data.test("Apple"));
		
	}

}
