/**
 * 
 */
package com.att.assignment.model;

import java.sql.Blob;
import java.util.List;

/**
 * @author Yashwanth
 *
 */
public class Product {

	String productId;
	String productName;
	String description;
	List<RelatedProducts> relatedProducts;
	Blob productImage;
}
