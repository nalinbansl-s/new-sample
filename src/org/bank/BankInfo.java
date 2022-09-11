package org.bank;

public class BankInfo extends AxisBank {
public void Savings() {
	System.out.println("savings acc");
}
public void fixed() {
	System.out.println("fixed acc");
}
public static void main(String[] args) {
	BankInfo b= new BankInfo();
b.deposit();
b.Savings();
b.fixed();


}




}
