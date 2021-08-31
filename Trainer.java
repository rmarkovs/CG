package trainers;
import java.util.regex.*;

public class Trainer 
{
	//declaration of variables
	private String id;
	private String email;
	private String first_name;
	private String last_name;
	private String phone_number;
	private Trainer_type trainer_type;
	private final String DEFAULT_VALUE = "NOT AVAILABLE";
	
	//constructor
	public Trainer(String id, String email, String first_name, String last_name, Trainer_type trainer_type, String phone_number)
	{
		this.id = id;
		this.email = email;
		this.setFirstName(first_name);
		this.setLastName(last_name);
		this.trainer_type = trainer_type;
		this.setPhoneNumber(phone_number);
	}
	
//setters - incomplete
	private void setFirstName(String first_name)
	{
		boolean isValid = first_name.matches("[a-zA-Z]+");
		if(isValid == true)
		{
			this.first_name = first_name;
		}
		else
		{
			this.first_name = DEFAULT_VALUE;
		}
		
	}
	
	private void setLastName(String last_name)
	{
		boolean isValid = last_name.matches("[a-zA-Z]+");
		if(isValid == true)
		{
			this.last_name = last_name;
		}
		else
		{
			this.last_name = DEFAULT_VALUE;
		}
	}
	
	private void setPhoneNumber(String phone)
	{
		if(phone.length() == 12)
		{
			boolean isValid = phone.matches("[0-9-]");
			if(isValid == true)
			{
				this.phone_number = phone;
			}
			else
			{
				this.phone_number = DEFAULT_VALUE;
			}
		}
		else
		{
			this.phone_number = DEFAULT_VALUE;
		}
	}
	//getters - complete
	public String getEmail()
	{
		return email;
	}

	public String getFirst_name()
	{
		return first_name;
	}
	
	public String getLast_name()
	{
		return last_name;
	}
	
	public Trainer_type getTrainer_type()
	{
		return trainer_type;
	}
	
	public String getPhone_Number()
	{
		return phone_number;
	}

	public String getId() {
		return id;
	}

}
