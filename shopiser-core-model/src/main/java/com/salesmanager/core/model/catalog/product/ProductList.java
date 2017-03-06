package com.salesmanager.core.model.catalog.product;

import java.util.ArrayList;
import java.util.List;

import com.salesmanager.core.model.common.EntityList;

public class ProductList extends EntityList {
    private static final long serialVersionUID = -2378951764266074795L;
	
	private List<Product> products = new ArrayList<>();
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}


}
