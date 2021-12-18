package abstraction;

public class AxisBank extends Bank {
	public void saving() {
	System.out.println("saving account");
}
public void current() {
	System.out.println("current account");
}
public void salary() {
	System.out.println("salary account");
}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.salary();
		axis.saving();
		axis.branchDetails();
	

}
}