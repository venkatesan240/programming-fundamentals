package com.chainsys.bank;

public class Bank {
	
	String userName;
	int accountNumber;
	String ifscCode;
	String branch;
	long phoneNumber;
	int account;
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public Bank() {
		
	}
	public Bank(String userName, int accountNumber, String ifscCode, String branch, long phoneNumber, int account) {
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.branch = branch;
		this.phoneNumber = phoneNumber;
		this.account = account;
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
				+ ", branch=" + branch + ", phoneNumber=" + phoneNumber + ", account=" + account + "]";
	}
	
	
}
