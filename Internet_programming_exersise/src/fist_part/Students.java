/**
 * 
 */
package fist_part;

/**
 * @author Tolis
 *
 */
public class Students extends Users {
	
	private String regNum;

	/**
	 * @param username
	 * @param name
	 * @param surname
	 * @param department
	 */
	public Students(String username, String name, String surname, String department, String regNum) {
		super(username, name, surname, department);
		// TODO Auto-generated constructor stub
		this.regNum = regNum;
	}

}
