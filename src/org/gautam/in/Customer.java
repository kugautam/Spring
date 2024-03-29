package org.gautam.in;

public class Customer
{
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	public int getCustomerId()
	{
		return customerId;
	}
	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	public long getCustomerContact()
	{
		return customerContact;
	}
	public void setCustomerContact(long customerContact)
	{
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress()
	{
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress)
	{
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
}