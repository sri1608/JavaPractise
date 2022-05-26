package constructor;

public class Store {
	private int id;
	private String name;
	private boolean cardspayment;
	private double amount;
	private String Storetype;
	
	public Store() {}

	public Store(int id, String name, boolean cardspayment, double amount, String storetype) {
		this.id = id;
		this.name = name;
		this.cardspayment = cardspayment;
		this.amount = amount;
		Storetype = storetype;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCardspayment() {
		return cardspayment;
	}

	public void setCardspayment(boolean cardspayment) {
		this.cardspayment = cardspayment;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStoretype() {
		return Storetype;
	}

	public void setStoretype(String storetype) {
		Storetype = storetype;
	}

	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", cardspayment=" + cardspayment + ", amount=" + amount
				+ ", Storetype=" + Storetype + "]";
	}
	

}
