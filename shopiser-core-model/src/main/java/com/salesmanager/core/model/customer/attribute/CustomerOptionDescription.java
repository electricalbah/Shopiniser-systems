package com.salesmanager.core.model.customer.attribute;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.Description;
import javax.persistence.Lob;

@Entity
@Table(name="CUSTOMER_OPTION_DESC", schema=SchemaConstant.SALESMANAGER_SCHEMA, uniqueConstraints={
	@UniqueConstraint(columnNames={
			"CUSTOMER_OPTION_ID",
			"LANGUAGE_ID"
		})
	}
)
public class CustomerOptionDescription extends Description {
    private static final long serialVersionUID = 296269858845127045L;

	
	@ManyToOne(targetEntity = CustomerOption.class)
	@JoinColumn(name = "CUSTOMER_OPTION_ID", nullable = false)
	private CustomerOption customerOption;
	
	@Column(name="CUSTOMER_OPTION_COMMENT")
	@Lob 
	private String customerOptionComment;
	

	
	public CustomerOptionDescription() {
	}

	public CustomerOption getCustomerOption() {
		return customerOption;
	}

	public void setCustomerOption(CustomerOption customerOption) {
		this.customerOption = customerOption;
	}

	public String getCustomerOptionComment() {
		return customerOptionComment;
	}

	public void setCustomerOptionComment(String customerOptionComment) {
		this.customerOptionComment = customerOptionComment;
	}


	

}
