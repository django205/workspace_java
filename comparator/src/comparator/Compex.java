package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Compex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student> al=new ArrayList<Student>();
		al.add(new Student("Django",1,20));
		al.add(new Student("Tango",2,25));
		al.add(new Student("Mango",3,20));
		al.add(new Student("Rango",4,21));
		al.add(new Student("Bango",5,22));
        System.out.println("sorting by name");
		Collections.sort(al,new namecomp());
		for(Student s:al){
			System.out.println(s.name+"      "+s.rollno+"      "+s.age);
		}
		
		System.out.println("sorting by age");
		Collections.sort(al,new Agecomp());
		for(Student s:al){
			System.out.println(s.name+"      "+s.rollno+"       "+s.age);
		}
	}

}
