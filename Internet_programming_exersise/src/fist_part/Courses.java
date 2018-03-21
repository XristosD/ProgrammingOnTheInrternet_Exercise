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
	private Grades courseGrades = new Grades();
	public Courses(String courseName, LinkedList<Professors> courseProfessors) {
		super();
		this.courseName = courseName;
		this.courseProfessors = courseProfessors;
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
	public void setCourseProfessors(LinkedList<Professors> courseProfessors) {
		this.courseProfessors = courseProfessors;
	}
}
