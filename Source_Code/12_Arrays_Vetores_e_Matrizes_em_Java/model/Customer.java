package lecture10.model;

public class Customer {
	  // private int title;
	  private Title title;
	  private String name;     
	  private String lastName;
	  private Address address;
	  private String dateOfBirthday;
	 
	  private String email;
	 
	  public Customer() {
		  this(null);
  	}
	  
	
	public Customer(String name) {
		this(name, null);
  	}
	
	 public Customer(String name, String lastName) {
			this.name = name;
			this.lastName = lastName;
		}
		  

	public String getName() {
		return name;
	}

	 public void setName(String name) {
		if (name.length() < 3) {
			name = "Invalid";
		}
		this.name = name;
	}


	 public String getLastName() {
		return lastName;
	}

	 public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDateOfBirthday() {
		return dateOfBirthday;
	}


	public void setDateOfBirthday(String dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}
	
	public Title getTitle() {
		return title;
	}


	public void setTitle(Title title) {
		this.title = title;
	}
	
	public static void main(String [] args) {
		Customer rodrigo = new Customer("Rodrigo", "Pagliares");
		rodrigo.setTitle(Title.MR);
		

		
		Address address = new Address();
		
		
		rodrigo.setEmail("pagliares@bcc.unifal-mg.edu.br");
		rodrigo.setDateOfBirthday("07/05/1982");

	 
	 
 		address.setAddress("Av. Manoel Alves Taveira, 1108");
		address.setCity("Alfenas");
		address.setState("MG");
		address.setZipCode("34678-000");
		
		rodrigo.setAddress(address); // magic !
		
		String resposta = null;
		Title title = rodrigo.getTitle();
		switch (title) {
		case MR:
			resposta = "MR";
			break;
		case MRS:
			resposta = "MRS";
			break;
		case MISS:
			resposta = "MISS";
			break;
		case MS:
			resposta = "MS";
			break;
		case DR:
			resposta = "DR.";
			break;

		}
		
		System.out.println("The title of the customer is : "  + resposta);		

		System.out.println("The name of the customer is : "  + rodrigo.getName());		
		System.out.println("The last name of the customer is : "  + rodrigo.getLastName());
		System.out.println("Date of birthday : "  + rodrigo.getDateOfBirthday());
		
		System.out.println("The Address of the customer is : \n"  + 
										"Address...: "  + rodrigo.getAddress().getAddress() + "\n" +
										"City...: "  + rodrigo.getAddress().getCity() + "\n" +
										"State...: "  + rodrigo.getAddress().getState() + "\n" +
										"ZipCode...: "  + rodrigo.getAddress().getZipCode()+ "\n" +
										"Email...: "  + rodrigo.getEmail());	
	}


	
 }