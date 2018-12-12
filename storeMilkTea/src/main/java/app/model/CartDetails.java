package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class CartDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", length = 11, nullable = false, unique = true)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id", nullable = false)
	private Carts carts;
	@Column(name="quantium",length=11,nullable=true)
	private Integer quantium;
	@Column(name="Size",length=1,nullable=true)
	private String Size;
	@Column(name="statust",nullable=true)
	private Integer statust;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Carts getCarts() {
		return carts;
	}
	public void setCarts(Carts carts) {
		this.carts = carts;
	}
	public Integer getQuantium() {
		return quantium;
	}
	public void setQuantium(Integer quantium) {
		this.quantium = quantium;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public Integer getStatust() {
		return statust;
	}
	public void setStatust(Integer statust) {
		this.statust = statust;
	}
	
}
