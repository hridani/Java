package onelvshop;

public class Customer {
	private String name;
	private int age;
	private double balance;
	
	public Customer(String name, int age, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty() || name == null) {
			throw new IllegalArgumentException("Name Customer can not be empty");
		}
		
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (0 > age || age > 120) {
			throw new IllegalArgumentException("Age cannot be negative or more 120");
		}
			
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Balance can not be negative");
		}
		this.balance = balance;
	}
}
