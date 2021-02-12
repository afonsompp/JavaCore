package JavaCore.pojos;

import java.time.LocalDate;

public class PersonBean {
	private String name;
	private String lastName;
	private LocalDate startDate;

	public PersonBean() {
	}

	public PersonBean(String name, String lastName, LocalDate startDate) {
		this.name = name;
		this.lastName = lastName;
		this.startDate = startDate;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getStartDate() {
		return this.startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


}
