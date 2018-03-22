/**
 * 
 */
package fist_part;
import java.util.*; 

/**
 * @author Tolis
 *
 */
public class Courses {
	private String courseName;
	private LinkedList<Professors> courseProfessors;
	public Grades courseGrades = new Grades();
	
	public Courses(String courseName) {
		super();
		this.courseName = courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public LinkedList<Professors> getCourseProfessors() {
		return courseProfessors;
	}
	public void setCourseProfessors(Professors p) {
		this.courseProfessors.add(p);
	}
}
