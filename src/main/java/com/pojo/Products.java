package com.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Products {
	
	@Id
	private int pid;
	private String pname;
	private String pdescription;
	private String price;
	
	@ManyToOne
	private Consumer user;
	@ManyToMany(mappedBy="seller")
	private List<Seller> seller=new ArrayList<Seller>();
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Consumer getUser() {
		return user;
	}
	public void setUser(Consumer user) {
		this.user = user;
	}
	public List<Seller> getSeller() {
		return seller;
	}
	public void setSeller(List<Seller> seller) {
		this.seller = seller;
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + ", pdescription=" + pdescription + ", price=" + price
				+ ", user=" + user + ", seller=" + seller + "]";
	}

	
	
}
