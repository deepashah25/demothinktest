package com.think;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class OrderTest {

@Mock
public PaymentGateway paygateway;



@Test
public void m1()
{
	//paygateway=Mockito.mock(PaymentGateway.class);
	MockitoAnnotations.initMocks(this);
	Order or=new Order(paygateway);
	when(paygateway.makePayment()).thenReturn(true);
	when(paygateway.getTransactionCode()).thenReturn(9000);
	
	assertTrue(or.finalizeorder());
	
}

}
