package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

class Student implements Comparable<Student>{
	String name;
	int rollno;
	int marks;
	Student(){
		
	}
	Student(String name,int rollno,int marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	@Override
	public int compareTo(Student ss) {
		if(this.rollno==ss.rollno)
		return 0;
		else if(this.rollno>ss.rollno)  return 1;
		else return -1;
	}
	
	
	
}

public class Arraylistex {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student("yogesh",15,67);
		Student s2=new Student("django",13,45);
		Student s3=new Student("targarean",14,89);
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()){
			
			Student s= itr.next();
			//System.out.println(s);
			System.out.println("    "+s.name+"     "+s.rollno+"     "+s.marks);
		}
		
//		ListIterator<Student> litr=list.listIterator();
//		while(litr.hasPrevious()){
//			Student s4=litr.previous();
//			System.out.println("    "+s4.name+"     "+s4.rollno+"     "+s4.marks);
//		}
//		
		
		Collections.sort(list);
		for(Student ssa:list){
			System.out.println("    "+ssa.name+"     "+ssa.rollno+"     "+ssa.marks);
		}
	}

}
