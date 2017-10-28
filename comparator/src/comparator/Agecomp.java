package comparator;

import java.util.Comparator;

public class Agecomp implements Comparator<Student>{

	@Override
	public int compare(Student obj1,Student obj2) {

		if(obj1.age==obj2.age)
		return 0;
		else if(obj1.age>obj2.age)  
			return 1;  
			else  
			return -1;
		
	}

	
}
