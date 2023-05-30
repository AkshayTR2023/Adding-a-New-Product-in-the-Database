//Product.java
package com.ecommerce.pojo;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pID;
    private String pName;
    private double pCost;
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpCost() {
		return pCost;
	}
	public void setpCost(double pCost) {
		this.pCost = pCost;
	}
    
   
    
}
