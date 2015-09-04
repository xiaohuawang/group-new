package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the GOSHUSER database table.
 * 
 */
@Entity
@NamedQuery(name="Goshuser.findAll", query="SELECT g FROM Goshuser g")
public class Goshuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ID")
	private long userId;

	private BigDecimal credits;

	private String email;

	private String pass;

	@Column(name="USER_NAME")
	private String userName;

	//bi-directional many-to-one association to Goshitem
	@OneToMany(mappedBy="goshuser1")
	private List<Goshitem> goshitems1;

	//bi-directional many-to-one association to Goshitem
	@OneToMany(mappedBy="goshuser2")
	private List<Goshitem> goshitems2;

	public Goshuser() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public BigDecimal getCredits() {
		return this.credits;
	}

	public void setCredits(BigDecimal credits) {
		this.credits = credits;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Goshitem> getGoshitems1() {
		return this.goshitems1;
	}

	public void setGoshitems1(List<Goshitem> goshitems1) {
		this.goshitems1 = goshitems1;
	}

	public Goshitem addGoshitems1(Goshitem goshitems1) {
		getGoshitems1().add(goshitems1);
		goshitems1.setGoshuser1(this);

		return goshitems1;
	}

	public Goshitem removeGoshitems1(Goshitem goshitems1) {
		getGoshitems1().remove(goshitems1);
		goshitems1.setGoshuser1(null);

		return goshitems1;
	}

	public List<Goshitem> getGoshitems2() {
		return this.goshitems2;
	}

	public void setGoshitems2(List<Goshitem> goshitems2) {
		this.goshitems2 = goshitems2;
	}

	public Goshitem addGoshitems2(Goshitem goshitems2) {
		getGoshitems2().add(goshitems2);
		goshitems2.setGoshuser2(this);

		return goshitems2;
	}

	public Goshitem removeGoshitems2(Goshitem goshitems2) {
		getGoshitems2().remove(goshitems2);
		goshitems2.setGoshuser2(null);

		return goshitems2;
	}

}