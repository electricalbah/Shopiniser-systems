package com.salesmanager.core.model.customer;

import java.util.List;

import com.salesmanager.core.model.common.EntityList;

public class CustomerList extends EntityList {
    private static final long serialVersionUID = 2098461039416945764L;

	private List<Customer> customers;
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<Customer> getCustomers() {
		return customers;
	}

}
