package com.cg.mmbank.pojo;

public abstract class Customer {
	private String customerName;
	private long contactNumber;
	private String emailId;
	private String dateOfBirth;
	private long accountNo;

	private static int custId;

	static {
		custId = 200;
	}

	{
		this.accountNo = ++custId;
	}
}