package assignment3;

public class TravelCard extends PrepaidCard implements Rewardable{
	double rewardPoints;

	@Override
	public boolean swipeCard(double amount) {
		double swpLimit=getSwipeLimit();
		if(amount<= swpLimit) {
			rewardPointCount(amount);
			return true;
		}
		else {
			return false;
		}
		
	}

	public void rewardPointCount(double amt) {
		// TODO Auto-generated method stub
		rewardPoints = amt / 20;
		System.out.println("You have earned " +rewardPoints+" points on this Transaction");
	}
	
}