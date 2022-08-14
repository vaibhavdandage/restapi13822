package project.vpd.restapp13822.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Id;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="products")
public class Product {
	 
	@Id
	@GeneratedValue
	 private int id;
	 private String title;
	 private String imageUrl;
	 private double price;
	 private double shippingCharges;
	 
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = Id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getShippingCharges() {
		return shippingCharges;
	}
	public void setShippingCharges(double shippingCharges) {
		this.shippingCharges = shippingCharges;
	}
}