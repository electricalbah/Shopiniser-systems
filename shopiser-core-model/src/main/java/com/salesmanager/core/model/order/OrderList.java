package com.salesmanager.core.model.order;

import java.util.List;

import com.salesmanager.core.model.common.EntityList;

public class OrderList extends EntityList {
    private static final long serialVersionUID = 9168737235068875990L;

	private List<Order> orders;

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

}
