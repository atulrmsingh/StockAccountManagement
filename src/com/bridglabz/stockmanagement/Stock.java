package com.bridglabz.stockmanagement;

public class Stock {
	private int id;
	private String stockName;
	private Double noOfShares;
	private Double sharePrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Double getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(Double noOfShares) {
		this.noOfShares = noOfShares;
	}

	public Double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(Double sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", stockName=" + stockName + ", noOfShares=" + noOfShares + ", sharePrice="
				+ sharePrice + "]";
	}

}
