package com.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Consumer {
	@Id
	private int cid;
	private String fname;
	private String lname;
	private long mobile;
	@OneToOne
	@JoinColumn(name="Address_id")
	private Address address;
	@OneToMany(mappedBy="user")
	private List<Products> products=new ArrayList<Products>();
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return "Consumer [cid=" + cid + ", fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", address="
				+ address + ", products=" + products + "]";
	}
	
	

}
