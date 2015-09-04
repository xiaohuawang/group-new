package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the GOSHITEM database table.
 * 
 */
@Entity
@NamedQuery(name="Goshitem.findAll", query="SELECT g FROM Goshitem g")
public class Goshitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ITEM_ID")
	private long itemId;

	private String avail;

	private String description;

	@Column(name="ITEM_NAME")
	private String itemName;

	private String piclink;

	private double price;

	@Column(name="SHIP_COST")
	private double shipCost;

	//bi-directional many-to-one association to Goshuser
	@ManyToOne
	@JoinColumn(name="BUYER_ID")
	private Goshuser goshuser1;

	//bi-directional many-to-one association to Goshuser
	@ManyToOne
	@JoinColumn(name="SELLER_ID")
	private Goshuser goshuser2;

	public Goshitem() {
	}

	public long getItemId() {
		return this.itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getAvail() {
		return this.avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPiclink() {
		return this.piclink;
	}

	public void setPiclink(String piclink) {
		this.piclink = piclink;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getShipCost() {
		return this.shipCost;
	}

	public void setShipCost(double shipCost) {
		this.shipCost = shipCost;
	}

	public Goshuser getGoshuser1() {
		return this.goshuser1;
	}

	public void setGoshuser1(Goshuser goshuser1) {
		this.goshuser1 = goshuser1;
	}

	public Goshuser getGoshuser2() {
		return this.goshuser2;
	}

	public void setGoshuser2(Goshuser goshuser2) {
		this.goshuser2 = goshuser2;
	}

}