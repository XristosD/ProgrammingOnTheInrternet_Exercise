/**
 * 
 */
package fist_part;

/**
 * @author xristos
 *class user
 */
class Users {
	
	private String username, name, surname, department;
	private static int usersCounter = 0;
	
	protected Users(String username, String name, String surname, String department) {
		super();
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.department = department;
		usersCounter++;
	}

	
	protected String getUsername() {
		return username;
	}
	protected void setUsername(String username) {
		this.username = username;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getSurname() {
		return surname;
	}
	protected void setSurname(String surname) {
		this.surname = surname;
	}
	protected String getDepartment() {
		return department;
	}
	protected void setDepartment(String department) {
		this.department = department;
	}
	protected static int getUsersCounter() {
		return usersCounter;
	}
	

}
