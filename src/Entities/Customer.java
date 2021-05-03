package Entities;
import java.time.LocalDate;

public class Customer {
	
	public int id;
	public String firstName, lastName, nationalityId;
	public LocalDate dateOfBirth;
	
	
	public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}
	
}
