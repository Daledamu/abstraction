package abstraction;

public class PaypalBank implements HdfcBank {
	public void saving() {
		System.out.println("saving account");
	}
	public void current() {
		System.out.println("current account");
	}
	public void salary() {
		System.out.println("salary account");
	}
	public void branchDetails() {
		System.out.println("chennai");
	}
	public void permanentaddress() {
		System.out.println("permanentaddress");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaypalBank bank=new PaypalBank();
		bank.salary();
		bank.saving();
		bank.branchDetails();
		bank.permanentaddress();

	}

}
