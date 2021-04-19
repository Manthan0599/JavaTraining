package CaseStudy02;

public class CarsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sedan s = new Sedan(1,"i20",true,550);
		System.out.println("Cost is: "+s.calculateDriveCost(20));
		System.out.println();
		HatchBack hb = new HatchBack(2,"Verna",true,true);
		System.out.println("Cost is Rs: "+hb.calculateDriveCost(10));
		System.out.println();
		UtilityCar uv=new UtilityCar(3,"Mahindra XUV",false);
		System.out.println("Cost is: "+uv.calculateDriveCost(10));
		
	}

}
