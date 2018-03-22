/**
 * 
 */
package fist_part;

/**
 * @author Tolis
 *
 */
public class Students extends Users {
	
	private int regNum;

	/**
	 * @param username
	 * @param name
	 * @param surname
	 * @param department
	 */
	public Students(String username, String name, String surname, String department, int regNum) {
		super(username, name, surname, department);
		// TODO Auto-generated constructor stub
		this.regNum = regNum;
	}

}
