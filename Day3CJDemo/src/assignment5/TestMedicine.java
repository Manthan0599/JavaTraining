package assignment5;
public class TestMedicine {

	public static void main(String[] args) {
		Tablet t = new Tablet();
		t.setPrice(50);
		t.setExpiryDate("03-01-2023");
		Syrup s= new Syrup();
		s.setPrice(45);
		s.setExpiryDate("05-05-2023");
		Ointment o = new Ointment();
		o.setPrice(60);
		o.setExpiryDate("09-10-2024");
		Medicine m[]= {t,s,o};
		for(int i=0;i<3;i++) {
			m[i].getDetails();
			m[i].displayLabel();
		}
		

	}

}
