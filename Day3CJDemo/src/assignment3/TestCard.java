package assignment3;
public class TestCard {

	public static void main(String[] args) {
		TravelCard tc = new TravelCard();
		tc.setCardNo(3799);
		tc.setAvailableBalance(78000);
		tc.setSwipeLimit(35000);
		//tc.rechargeCard(4000);
		boolean b = tc.swipeCard(3999);
		if(b == true) {
			System.out.println("Transaction Completed, Take your card......");
		}
		else {
			System.out.println("Transaction Failed, Take your card......");
		}
		System.out.println(tc);
	}

}
