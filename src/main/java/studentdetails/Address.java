package studentdetails;

public class Address extends Studentdetails{
	
	private String housename, streetname;
	private int zipcode;

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public String getHousename() {
		return housename;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getZipcode() {
		return zipcode;
	}

	
	public void print() {
		//student Print Student name, roll number with address
		
		System.out.println("Name is "+ getName());
		System.out.println("Roll number  is "+ getRollno() );
		System.out.println("Student address is "+housename+","+streetname+","+zipcode);


	}

}
