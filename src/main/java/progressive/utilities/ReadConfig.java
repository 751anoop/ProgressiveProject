package progressive.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro=new Properties();

	public ReadConfig() {
		

		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream input = new FileInputStream(src);
			pro.load(input);
		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());
		}
		
	}
	
	public String getWebURL() {
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getZipcode() {
		String zip=pro.getProperty("zipcode");
		return zip;
	}
	public String getFirstName() {
		String fname=pro.getProperty("firstname");
		return fname;
	}
	public String getLastName() {
		String lname=pro.getProperty("lastname");
		return lname;
	}
	public String getDOB() {
		String dob=pro.getProperty("dateofbirth");
		return dob;
	}
	public String getStreet() {
		String street=pro.getProperty("streetaddress");
		return street;
	}
	public String getCity() {
		String city=pro.getProperty("city");
		return city;
	}
	public String getMiles() {
		String miles=pro.getProperty("milesdriven");
		return miles;
	}
	public String getEmail() {
		String email=pro.getProperty("primaryemail");
		return email;
	}
}

