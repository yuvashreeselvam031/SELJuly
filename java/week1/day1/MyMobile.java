package week1.day1;

public class MyMobile {

	public void makeCall()
	{
		System.out.println("making a call");
	}
	public void sendMsg()
	{
		System.out.println("msg sent");
	}
	private void payBills()
	{
		System.out.println("AMOUNT PAID");
	}
	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
	}
}
