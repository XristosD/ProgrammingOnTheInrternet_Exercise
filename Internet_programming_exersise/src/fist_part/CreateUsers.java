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
			System.out.println("���������� ������.");
			System.out.println("���� �� �����:");
			String n = sc.nextLine();
			System.out.println("���� �� �������:");
			String s = sc.nextLine();
			System.out.println("���� �� �����:");
			String d = sc.nextLine();
			System.out.println("���� ��� �.�.:");
			Integer i = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("���� ��� �.�.:");
			Integer i = sc.nextInt();
		}

		
	}

}
