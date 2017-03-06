package com.salesmanager.core.model.user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.salesmanager.core.constants.SchemaConstant;
import com.salesmanager.core.model.common.audit.AuditListener;
import com.salesmanager.core.model.common.audit.AuditSection;
import com.salesmanager.core.model.common.audit.Auditable;
import com.salesmanager.core.model.generic.SalesManagerEntity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@EntityListeners(value = AuditListener.class)
@Table(name = "PERMISSION", schema=SchemaConstant.SALESMANAGER_SCHEMA)
public class Permission extends SalesManagerEntity<Integer, Permission> implements Auditable {
    private static final long serialVersionUID = -2337330417722888200L;

	@Id
	@Column(name = "PERMISSION_ID", unique=true, nullable=false)
	@TableGenerator(name = "TABLE_GEN", table = "SM_SEQUENCER", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "PERMISSION_SEQ_NEXT_VAL")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "TABLE_GEN")
	private Integer id;
	
	public Permission() {
		
	}
	
	public Permission(String permissionName) {
		this.permissionName = permissionName;
	}
	
	
	@NotNull 
        @Size(min=1)
	@Column(name="PERMISSION_NAME", unique=true)
	private String permissionName;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.REFRESH})
	@JoinTable(name = "PERMISSION_GROUP", schema=SchemaConstant.SALESMANAGER_SCHEMA, joinColumns = { 
			@JoinColumn(name = "PERMISSION_ID", nullable = false, updatable = false) }
			, 
			inverseJoinColumns = { @JoinColumn(name = "GROUP_ID", 
					nullable = false, updatable = false) }
	)
        
        //todo
//	@Cascade({
//		org.hibernate.annotations.CascadeType.DETACH,
//		org.hibernate.annotations.CascadeType.LOCK,
//		org.hibernate.annotations.CascadeType.REFRESH,
//		org.hibernate.annotations.CascadeType.REPLICATE
//		
//	})
        @OneToMany(cascade={CascadeType.DETACH, CascadeType.REFRESH})
	private List<Group> groups = new ArrayList<>();
	
	@Embedded
	private AuditSection auditSection = new AuditSection();
	
	
	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
		
	}

	@Override
	public AuditSection getAuditSection() {
		return this.auditSection;
	}

	@Override
	public void setAuditSection(AuditSection audit) {
		this.auditSection = audit;
		
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public List<Group> getGroups() {
		return groups;
	}

}
