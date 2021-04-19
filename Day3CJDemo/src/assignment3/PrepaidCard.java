package assignment3;

public abstract class PrepaidCard {
	private int cardNo;
	private double availableBalance;
	private double swipeLimit;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public double getSwipeLimit() {
		return swipeLimit;
	}
	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}
	public abstract boolean swipeCard(double amount);
	public void rechargeCard(double amt) {
		availableBalance = amt + availableBalance;
		System.out.println("Card Recharged, New Balance is: "+getAvailableBalance());
	}
	@Override
	public String toString() {
		return "Card No : " + cardNo + "\nAvailable Balance : " + availableBalance + "\nSwipe Limit: " + swipeLimit;
	}
}
