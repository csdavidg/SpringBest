package co.com.david.aopdemo.entity;

public class Account {

	private Long id;
	private Long number;

	public Account() {
	}

	public Account(Long id, Long number) {
		this.id = id;
		this.number = number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", number=" + number + "]";
	}

}
