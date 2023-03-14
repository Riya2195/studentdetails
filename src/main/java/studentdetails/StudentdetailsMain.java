package studentdetails;

public class StudentdetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetails s = new Studentdetails();
		s.setName("Riya");
		s.setRollno(29);

		Address a = new Address();
		a.setHousename("Arimattom");
		a.setStreetname("chennadu");
		a.setZipcode(123456);
		a.print();

	}

}
