package com.think;

public class Order
{
	
	PaymentGateway paygeteway;
	
	Order(PaymentGateway p)
	{
		this.paygeteway=p;
	}
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	boolean finalizeorder()
	{
		return paygeteway.makePayment();
	}

}
