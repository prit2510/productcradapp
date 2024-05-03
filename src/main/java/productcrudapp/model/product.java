package productcrudapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class product{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private String description;
	private long price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
		public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public product(int id, String name, String description, long price) {
		super();
		this.id = id;
		Name = name;
		this.description = description;
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", Name=" + Name + ", description=" + description + ", price=" + price + "]";
	}

}
