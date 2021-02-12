package JavaCore.pojos;

import java.time.LocalDate;

public class PersonPOJO {
	private String name;
	private String lastName;
	private LocalDate startDate;

	public PersonPOJO(String name, String lastName, LocalDate startDate) {
		this.name = name;
		this.lastName = lastName;
		this.startDate = startDate;
	}

	public String getName() {
		return this.name + this.lastName;
	}

	public LocalDate getStart() {
		return this.startDate;
	}

}
