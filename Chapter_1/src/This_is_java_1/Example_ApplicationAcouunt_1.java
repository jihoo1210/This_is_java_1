package This_is_java_1;

public class Example_ApplicationAcouunt_1 {
	private String ano;
	private String owner;
	private int balance;
	
	public Example_ApplicationAcouunt_1(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance =  balance;}
	
}
