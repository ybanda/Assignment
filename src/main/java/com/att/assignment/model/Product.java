/**
 * 
 */
package com.att.assignment.model;

/**
 * @author Yashwanth
 *
 */
public class Product {

	String quantity;
	String itemId ;
	String itemName;
	
	public Product(String quantity,String itemId, String itemName,String relatedProdId){
		this.quantity=quantity;
		this.itemId=itemId;
		this.itemName=itemName;
		this.relatedProdId=relatedProdId;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the relatedProdId
	 */
	public String getRelatedProdId() {
		return relatedProdId;
	}
	/**
	 * @param relatedProdId the relatedProdId to set
	 */
	public void setRelatedProdId(String relatedProdId) {
		this.relatedProdId = relatedProdId;
	}
	String relatedProdId;


}
