package jdbc.beans;

import java.sql.Date;

public class Product {

	private Long id;
	private String name;
	private String qty;
	private String price;
	private Date exDate;

	public Product() {

	}

	public Product(Long id, String name, String qty, String price, Date exDate) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.exDate = exDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getExDate() {
		return exDate;
	}

	public void setExDate(Date exDate) {
		this.exDate = exDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + ", exDate=" + exDate
				+ "]";
	}

}
