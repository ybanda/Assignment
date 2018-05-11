package com.att.assignment.modules;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

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
       
	List<Product> productList= null;

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
	productList = new ArrayList<>();
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
		//request.setAttribute("productList", productList);
		//doGet(request, response);
		// TODO Auto-generated method stub
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
				response.getWriter().append("Served at: ").append(request.getContextPath());
				String quantity= request.getParameter("quantity");
				
				String itemId = request.getParameter("itemId");
				String itemName= request.getParameter("itemName");
				String relatedProdId= request.getParameter("relatedProdId");
				Product product = new Product(quantity,itemId,itemName,relatedProdId);
				productList.add(product);
			
				logger.info("Details are - salesRepId ="+relatedProdId+" itemId -"+itemId+", quantity ="+quantity +"Item NAme="+itemName
						+" Product List ="+productList.size()
						);
				Gson gson = new Gson(); 
		        JsonObject jsonObject = new JsonObject();

		      
		        JsonElement productJSON = gson.toJsonTree(productList);
		        jsonObject.add("productJSON", productJSON);
		        logger.info(jsonObject.toString());
				out.println(jsonObject.toString());
				out.close();
		
	}

}
