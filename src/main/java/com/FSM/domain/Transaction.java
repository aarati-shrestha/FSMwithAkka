package com.FSM.domain;


public class Transaction {

	private int id;
	private double value;
	public enum TransactionState {
	   UNVERIFIED, VERIFIED
	  }
	private TransactionState transactionState;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int id, double d, TransactionState transactionState) {
		super();
		this.id = id;
		this.value = d;
		this.transactionState = transactionState;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public TransactionState getTransactionState() {
		return transactionState;
	}
	public void setTransactionState(TransactionState transactionState) {
		this.transactionState = transactionState;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", value=" + value + ", transactionState="
				+ transactionState + "]";
	}
	
	
	
}
