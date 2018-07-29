package beans;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@ManagedBean

public class User {
	
	@NotNull(message = "Please enter a First Name")
	@Size(min=4, max=15)
	private String firstName;
	
	@NotNull(message = "Please enter a Last Name")
	@Size(min=4, max=15)
	private String lastName;
	
	public User() {
		firstName = "Richard";
		lastName = "Boyd";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
