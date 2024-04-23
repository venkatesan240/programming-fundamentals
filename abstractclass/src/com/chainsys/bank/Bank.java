package com.chainsys.bank;

public abstract class Bank {
	
	String userName;
	int accountNumber;
	String ifscCode;
	String branch;
	long phoneNumber;


	public Bank() {
		
	}

	public Bank(String userName, int accountNumber, String ifscCode, String branch, long phoneNumber) {
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.branch = branch;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

	@Override
	public String toString() {
		return "Bank [userName=" + userName + ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode
				+ ", branch=" + branch + ", phoneNumber=" + phoneNumber + "]";
	}

	public abstract void interestRate(float interest);
	
	public void loans() {
		System.out.println("housing loan");
		System.out.println("education loan");
	}

}
