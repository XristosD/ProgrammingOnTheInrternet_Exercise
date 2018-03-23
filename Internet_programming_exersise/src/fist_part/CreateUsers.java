/**
 * 
 */
package fist_part;

import java.util.Scanner;

/**
 * @author Tolis
 *
 */
public class CreateUsers {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Professors p = new Professors("a","a","a","a");
		Students fd = new Students("a","a","a","a",3);
		Users.getUsersCounter();
		Courses c = new Courses("a");
		c.setCourseProfessors(p);
		c.courseGrades.importStudentGrade(fd,10);

		try {
			System.out.println("Δημιουργία Μαθητή.");
			System.out.println("Δώσε το όνομα:");
			String n = sc.nextLine();
			System.out.println("Δώσε το επώνυμο:");
			String s = sc.nextLine();
			System.out.println("Δώσε το τμήμα:");
			String d = sc.nextLine();
			System.out.println("Δώσε τον Α.Μ.:");
			Integer i = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Δώσε τον Α.Μ.:");
			Integer i = sc.nextInt();
		}

		
	}

}
