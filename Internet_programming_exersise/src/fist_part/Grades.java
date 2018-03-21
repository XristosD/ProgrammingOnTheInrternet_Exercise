/**
 * 
 */
package fist_part;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tolis
 *
 */
public class Grades {
	private Map<Students,Integer> studentsGrades;
	
	public Grades() {
		this.studentsGrades = new HashMap<Students,Integer>() ;
	}

	protected void importStudentGrade(Students s,Integer i) {
		studentsGrades.put(s,i);
	}

	protected Integer getStudentGrade(Students s) {
		return studentsGrades.get(s);
	}
}
