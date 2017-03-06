/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesmanager.core.model.customer;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mamadu
 */
@Entity
@Table(name = "CUSTOMERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findByCustomersId", query = "SELECT c FROM Customers c WHERE c.customersId = :customersId"),
    @NamedQuery(name = "Customers.findByCustomersGender", query = "SELECT c FROM Customers c WHERE c.customersGender = :customersGender"),
    @NamedQuery(name = "Customers.findByCustomersFirstname", query = "SELECT c FROM Customers c WHERE c.customersFirstname = :customersFirstname"),
    @NamedQuery(name = "Customers.findByCustomersLastname", query = "SELECT c FROM Customers c WHERE c.customersLastname = :customersLastname"),
    @NamedQuery(name = "Customers.findByCustomersDob", query = "SELECT c FROM Customers c WHERE c.customersDob = :customersDob"),
    @NamedQuery(name = "Customers.findByCustomersEmailAddress", query = "SELECT c FROM Customers c WHERE c.customersEmailAddress = :customersEmailAddress"),
    @NamedQuery(name = "Customers.findByCustomersNick", query = "SELECT c FROM Customers c WHERE c.customersNick = :customersNick"),
    @NamedQuery(name = "Customers.findByCustomersTelephone", query = "SELECT c FROM Customers c WHERE c.customersTelephone = :customersTelephone"),
    @NamedQuery(name = "Customers.findByCustomersAddress", query = "SELECT c FROM Customers c WHERE c.customersAddress = :customersAddress"),
    @NamedQuery(name = "Customers.findByCustomersPostalcode", query = "SELECT c FROM Customers c WHERE c.customersPostalcode = :customersPostalcode"),
    @NamedQuery(name = "Customers.findByCustomersCity", query = "SELECT c FROM Customers c WHERE c.customersCity = :customersCity"),
    @NamedQuery(name = "Customers.findByCustomersCompany", query = "SELECT c FROM Customers c WHERE c.customersCompany = :customersCompany"),
    @NamedQuery(name = "Customers.findByCustomersState", query = "SELECT c FROM Customers c WHERE c.customersState = :customersState"),
    @NamedQuery(name = "Customers.findByCustomersZone", query = "SELECT c FROM Customers c WHERE c.customersZone = :customersZone"),
    @NamedQuery(name = "Customers.findByCustomersCountry", query = "SELECT c FROM Customers c WHERE c.customersCountry = :customersCountry"),
    @NamedQuery(name = "Customers.findByCustomersBillingFirstname", query = "SELECT c FROM Customers c WHERE c.customersBillingFirstname = :customersBillingFirstname"),
    @NamedQuery(name = "Customers.findByCustomersBillingLastname", query = "SELECT c FROM Customers c WHERE c.customersBillingLastname = :customersBillingLastname"),
    @NamedQuery(name = "Customers.findByCustomersBillingCompany", query = "SELECT c FROM Customers c WHERE c.customersBillingCompany = :customersBillingCompany"),
    @NamedQuery(name = "Customers.findByCustomersBillingAddress", query = "SELECT c FROM Customers c WHERE c.customersBillingAddress = :customersBillingAddress"),
    @NamedQuery(name = "Customers.findByCustomersBillingPostalcode", query = "SELECT c FROM Customers c WHERE c.customersBillingPostalcode = :customersBillingPostalcode"),
    @NamedQuery(name = "Customers.findByCustomersBillingCity", query = "SELECT c FROM Customers c WHERE c.customersBillingCity = :customersBillingCity"),
    @NamedQuery(name = "Customers.findByCustomersBillingState", query = "SELECT c FROM Customers c WHERE c.customersBillingState = :customersBillingState"),
    @NamedQuery(name = "Customers.findByCustomersBillingZone", query = "SELECT c FROM Customers c WHERE c.customersBillingZone = :customersBillingZone"),
    @NamedQuery(name = "Customers.findByCustomersBillingCountry", query = "SELECT c FROM Customers c WHERE c.customersBillingCountry = :customersBillingCountry"),
    @NamedQuery(name = "Customers.findByCustomersFax", query = "SELECT c FROM Customers c WHERE c.customersFax = :customersFax"),
    @NamedQuery(name = "Customers.findByCustomersPassword", query = "SELECT c FROM Customers c WHERE c.customersPassword = :customersPassword"),
    @NamedQuery(name = "Customers.findByCustomersNewsletter", query = "SELECT c FROM Customers c WHERE c.customersNewsletter = :customersNewsletter"),
    @NamedQuery(name = "Customers.findByCustomersGroupPricing", query = "SELECT c FROM Customers c WHERE c.customersGroupPricing = :customersGroupPricing"),
    @NamedQuery(name = "Customers.findByCustomersEmailFormat", query = "SELECT c FROM Customers c WHERE c.customersEmailFormat = :customersEmailFormat"),
    @NamedQuery(name = "Customers.findByCustomersAuthorization", query = "SELECT c FROM Customers c WHERE c.customersAuthorization = :customersAuthorization"),
    @NamedQuery(name = "Customers.findByCustomersReferral", query = "SELECT c FROM Customers c WHERE c.customersReferral = :customersReferral"),
    @NamedQuery(name = "Customers.findByCustomersAnonymous", query = "SELECT c FROM Customers c WHERE c.customersAnonymous = :customersAnonymous"),
    @NamedQuery(name = "Customers.findByCustomersLang", query = "SELECT c FROM Customers c WHERE c.customersLang = :customersLang"),
    @NamedQuery(name = "Customers.findByMerchantid", query = "SELECT c FROM Customers c WHERE c.merchantid = :merchantid")})
public class Customers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_ID")
    private Integer customersId;
    @Column(name = "CUSTOMERS_GENDER")
    private Character customersGender;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_FIRSTNAME")
    private String customersFirstname;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_LASTNAME")
    private String customersLastname;
    @Column(name = "CUSTOMERS_DOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date customersDob;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_EMAIL_ADDRESS")
    private String customersEmailAddress;
    @Column(name = "CUSTOMERS_NICK")
    private String customersNick;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_TELEPHONE")
    private String customersTelephone;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_ADDRESS")
    private String customersAddress;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_POSTALCODE")
    private String customersPostalcode;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_CITY")
    private String customersCity;
    @Column(name = "CUSTOMERS_COMPANY")
    private String customersCompany;
    @Column(name = "CUSTOMERS_STATE")
    private String customersState;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_ZONE")
    private int customersZone;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_COUNTRY")
    private int customersCountry;
    @Column(name = "CUSTOMERS_BILLING_FIRSTNAME")
    private String customersBillingFirstname;
    @Column(name = "CUSTOMERS_BILLING_LASTNAME")
    private String customersBillingLastname;
    @Column(name = "CUSTOMERS_BILLING_COMPANY")
    private String customersBillingCompany;
    @Column(name = "CUSTOMERS_BILLING_ADDRESS")
    private String customersBillingAddress;
    @Column(name = "CUSTOMERS_BILLING_POSTALCODE")
    private String customersBillingPostalcode;
    @Column(name = "CUSTOMERS_BILLING_CITY")
    private String customersBillingCity;
    @Column(name = "CUSTOMERS_BILLING_STATE")
    private String customersBillingState;
    @Column(name = "CUSTOMERS_BILLING_ZONE")
    private Integer customersBillingZone;
    @Column(name = "CUSTOMERS_BILLING_COUNTRY")
    private Integer customersBillingCountry;
    @Column(name = "CUSTOMERS_FAX")
    private String customersFax;
    @Column(name = "CUSTOMERS_PASSWORD")
    private String customersPassword;
    @Column(name = "CUSTOMERS_NEWSLETTER")
    private Character customersNewsletter;
    @Column(name = "CUSTOMERS_GROUP_PRICING")
    private Integer customersGroupPricing;
    @Column(name = "CUSTOMERS_EMAIL_FORMAT")
    private String customersEmailFormat;
    @Column(name = "CUSTOMERS_AUTHORIZATION")
    private Integer customersAuthorization;
    @Column(name = "CUSTOMERS_REFERRAL")
    private String customersReferral;
    @Column(name = "CUSTOMERS_ANONYMOUS")
    private Boolean customersAnonymous;
    @Basic(optional = false)
    @Column(name = "CUSTOMERS_LANG")
    private String customersLang;
    @Basic(optional = false)
    @Column(name = "MERCHANTID")
    private int merchantid;

    public Customers() {
    }

    public Customers(Integer customersId) {
        this.customersId = customersId;
    }

    public Customers(Integer customersId, String customersFirstname, String customersLastname, String customersEmailAddress, String customersTelephone, String customersAddress, String customersPostalcode, String customersCity, int customersZone, int customersCountry, String customersLang, int merchantid) {
        this.customersId = customersId;
        this.customersFirstname = customersFirstname;
        this.customersLastname = customersLastname;
        this.customersEmailAddress = customersEmailAddress;
        this.customersTelephone = customersTelephone;
        this.customersAddress = customersAddress;
        this.customersPostalcode = customersPostalcode;
        this.customersCity = customersCity;
        this.customersZone = customersZone;
        this.customersCountry = customersCountry;
        this.customersLang = customersLang;
        this.merchantid = merchantid;
    }

    public Integer getCustomersId() {
        return customersId;
    }

    public void setCustomersId(Integer customersId) {
        this.customersId = customersId;
    }

    public Character getCustomersGender() {
        return customersGender;
    }

    public void setCustomersGender(Character customersGender) {
        this.customersGender = customersGender;
    }

    public String getCustomersFirstname() {
        return customersFirstname;
    }

    public void setCustomersFirstname(String customersFirstname) {
        this.customersFirstname = customersFirstname;
    }

    public String getCustomersLastname() {
        return customersLastname;
    }

    public void setCustomersLastname(String customersLastname) {
        this.customersLastname = customersLastname;
    }

    public Date getCustomersDob() {
        return customersDob;
    }

    public void setCustomersDob(Date customersDob) {
        this.customersDob = customersDob;
    }

    public String getCustomersEmailAddress() {
        return customersEmailAddress;
    }

    public void setCustomersEmailAddress(String customersEmailAddress) {
        this.customersEmailAddress = customersEmailAddress;
    }

    public String getCustomersNick() {
        return customersNick;
    }

    public void setCustomersNick(String customersNick) {
        this.customersNick = customersNick;
    }

    public String getCustomersTelephone() {
        return customersTelephone;
    }

    public void setCustomersTelephone(String customersTelephone) {
        this.customersTelephone = customersTelephone;
    }

    public String getCustomersAddress() {
        return customersAddress;
    }

    public void setCustomersAddress(String customersAddress) {
        this.customersAddress = customersAddress;
    }

    public String getCustomersPostalcode() {
        return customersPostalcode;
    }

    public void setCustomersPostalcode(String customersPostalcode) {
        this.customersPostalcode = customersPostalcode;
    }

    public String getCustomersCity() {
        return customersCity;
    }

    public void setCustomersCity(String customersCity) {
        this.customersCity = customersCity;
    }

    public String getCustomersCompany() {
        return customersCompany;
    }

    public void setCustomersCompany(String customersCompany) {
        this.customersCompany = customersCompany;
    }

    public String getCustomersState() {
        return customersState;
    }

    public void setCustomersState(String customersState) {
        this.customersState = customersState;
    }

    public int getCustomersZone() {
        return customersZone;
    }

    public void setCustomersZone(int customersZone) {
        this.customersZone = customersZone;
    }

    public int getCustomersCountry() {
        return customersCountry;
    }

    public void setCustomersCountry(int customersCountry) {
        this.customersCountry = customersCountry;
    }

    public String getCustomersBillingFirstname() {
        return customersBillingFirstname;
    }

    public void setCustomersBillingFirstname(String customersBillingFirstname) {
        this.customersBillingFirstname = customersBillingFirstname;
    }

    public String getCustomersBillingLastname() {
        return customersBillingLastname;
    }

    public void setCustomersBillingLastname(String customersBillingLastname) {
        this.customersBillingLastname = customersBillingLastname;
    }

    public String getCustomersBillingCompany() {
        return customersBillingCompany;
    }

    public void setCustomersBillingCompany(String customersBillingCompany) {
        this.customersBillingCompany = customersBillingCompany;
    }

    public String getCustomersBillingAddress() {
        return customersBillingAddress;
    }

    public void setCustomersBillingAddress(String customersBillingAddress) {
        this.customersBillingAddress = customersBillingAddress;
    }

    public String getCustomersBillingPostalcode() {
        return customersBillingPostalcode;
    }

    public void setCustomersBillingPostalcode(String customersBillingPostalcode) {
        this.customersBillingPostalcode = customersBillingPostalcode;
    }

    public String getCustomersBillingCity() {
        return customersBillingCity;
    }

    public void setCustomersBillingCity(String customersBillingCity) {
        this.customersBillingCity = customersBillingCity;
    }

    public String getCustomersBillingState() {
        return customersBillingState;
    }

    public void setCustomersBillingState(String customersBillingState) {
        this.customersBillingState = customersBillingState;
    }

    public Integer getCustomersBillingZone() {
        return customersBillingZone;
    }

    public void setCustomersBillingZone(Integer customersBillingZone) {
        this.customersBillingZone = customersBillingZone;
    }

    public Integer getCustomersBillingCountry() {
        return customersBillingCountry;
    }

    public void setCustomersBillingCountry(Integer customersBillingCountry) {
        this.customersBillingCountry = customersBillingCountry;
    }

    public String getCustomersFax() {
        return customersFax;
    }

    public void setCustomersFax(String customersFax) {
        this.customersFax = customersFax;
    }

    public String getCustomersPassword() {
        return customersPassword;
    }

    public void setCustomersPassword(String customersPassword) {
        this.customersPassword = customersPassword;
    }

    public Character getCustomersNewsletter() {
        return customersNewsletter;
    }

    public void setCustomersNewsletter(Character customersNewsletter) {
        this.customersNewsletter = customersNewsletter;
    }

    public Integer getCustomersGroupPricing() {
        return customersGroupPricing;
    }

    public void setCustomersGroupPricing(Integer customersGroupPricing) {
        this.customersGroupPricing = customersGroupPricing;
    }

    public String getCustomersEmailFormat() {
        return customersEmailFormat;
    }

    public void setCustomersEmailFormat(String customersEmailFormat) {
        this.customersEmailFormat = customersEmailFormat;
    }

    public Integer getCustomersAuthorization() {
        return customersAuthorization;
    }

    public void setCustomersAuthorization(Integer customersAuthorization) {
        this.customersAuthorization = customersAuthorization;
    }

    public String getCustomersReferral() {
        return customersReferral;
    }

    public void setCustomersReferral(String customersReferral) {
        this.customersReferral = customersReferral;
    }

    public Boolean getCustomersAnonymous() {
        return customersAnonymous;
    }

    public void setCustomersAnonymous(Boolean customersAnonymous) {
        this.customersAnonymous = customersAnonymous;
    }

    public String getCustomersLang() {
        return customersLang;
    }

    public void setCustomersLang(String customersLang) {
        this.customersLang = customersLang;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customersId != null ? customersId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.customersId == null && other.customersId != null) || (this.customersId != null && !this.customersId.equals(other.customersId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.salesmanager.core.model.customer.Customers[ customersId=" + customersId + " ]";
    }
    
}
