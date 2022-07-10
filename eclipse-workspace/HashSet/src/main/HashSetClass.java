package main;
import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		System.out.println("Hello");
		filterNumber();
		filterChar1();
		filterChar2();
		filterObject();
		addHeterogenousData();
		removeData();
	}
	
	private static void filterNumber() {
		  HashSet<Integer> s=new HashSet<Integer>();  
	        s.add(1);    
	        s.add(8);    
	        s.add(10);   
	        s.add(102);  
	        s.stream()
            .filter(n  -> (n.hashCode()>10))
            .forEach(System.out::println);
		
	}
	
	private static void filterChar1() {
		  HashSet<String> s=new HashSet<String>();  
	        s.add("Apple");    
	        s.add("Mango");    
	        s.add("Banana");   
	        s.add("Grapes");  
	        s.stream()
          .filter(n  -> (n.startsWith("B")))
          .forEach(System.out::println);
		
	}
	
	private static void filterChar2() {
		  HashSet<String> s=new HashSet<String>();  
	        s.add("Apple");    
	        s.add("Mango");    
	        s.add("Banana");   
	        s.add("Grapes");  
	        s.stream()
        .filter(n  -> (n.contains("a")))
        .forEach(System.out::println);
		
	}
	
	private static void filterObject() {
		  HashSet<Book> s=new HashSet<Book>();
		  s.add(new Book("Fear not be strong",1002));
		  s.add(new Book("Wings of FIRE",2000));
		  s.stream()
	        .filter(n  -> (n.getBook() == "Wings of FIRE"))
	        .forEach(System.out::println);
	}
	
	private static void addHeterogenousData() {
		  HashSet s=new HashSet();  
	        s.add("Apple");    
	        s.add(1);    
	        s.add(null);   
	        s.add(true);  
	        s.add(0.0);  
	        System.out.println(s);
		
	}

	private static void removeData() {
		  HashSet<String> s=new HashSet<String>();  
	        s.add("Apple");    
	        s.add("Mango");    
	        s.add("Banana");   
	        s.add("Grapes");  
	        System.out.println(s);
	        s.remove("Banana");
	        System.out.println(s);
		
	}
	

}
