package com.att.assignment.modules;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.att.assignment.model.Product;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Map<String,Product> productList= null;

	private static Logger logger = Logger.getLogger(AddProduct.class);
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void init() throws ServletException {
		productList = new HashMap<>();
		super.init();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Inside of Add Product :: GET");
		request.setAttribute("productList", productList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation =request.getParameter("operation");
		String quantity= request.getParameter("quantity");

		String itemId = request.getParameter("itemId");
		String itemName= request.getParameter("itemName");
		String relatedProdId= request.getParameter("relatedProdId");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		response.setHeader("Cache-control", "no-cache, no-store");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "-1");

		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.setHeader("Access-Control-Max-Age", "86400");
		logger.info("Inside of Add Product :: POST");
		Gson gson = new Gson(); 
		JsonObject jsonObject = new JsonObject();
		try {

			switch(operation) {
			case "delete":
				productList.remove(itemId);
				logger.info("After Deleting Operation - List="+productList);
				break;
			case "add":
			case "update":
				Product product = new Product(quantity,itemId,itemName,relatedProdId);
				productList.put(itemId,product);

				logger.info("Details are - salesRepId ="+relatedProdId+" itemId -"+itemId+", quantity ="+quantity +"Item NAme="+itemName
						+" Product List ="+productList.size()
						);
				break;
			
				default:
					logger.info("Nothing to show here");
				


				
			}
			JsonElement productJSON = gson.toJsonTree(productList.values());
			jsonObject.add("productJSON", productJSON);
			logger.info(jsonObject.toString());
			out.println(jsonObject.toString());
			out.close();
		}
			catch(Exception exception) {

			}
			finally{

			}

		}

	}
