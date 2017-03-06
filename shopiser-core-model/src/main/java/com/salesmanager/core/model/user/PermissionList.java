package com.salesmanager.core.model.user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PermissionList implements Serializable {
    private static final long serialVersionUID = -6838759232797491637L;

	private int totalCount;
	private List<Permission> permissions = new ArrayList<>();
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

}
