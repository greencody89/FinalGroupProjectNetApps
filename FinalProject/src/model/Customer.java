package model;
/**
 * Java representation of the User table in the database
 * @author Brian
 *
 */
public class Customer {

	private int id;
	private String username;
	private String password;
	
		/**
	 * default constructor
	 */
	public Customer() {
		this.id = 1;
		this.username = "";
		this.password = "";
	}
	
	/**
	 * Constructor
	 * @param id  the unique user ID
	 * @param username  the unique user's username
	 * @param password	the password associated with the account
	 */
	public Customer(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	/**
	 * Return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set a new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Set a new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Return the user's password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Set a new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
}

