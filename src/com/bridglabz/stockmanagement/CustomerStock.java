package com.bridglabz.stockmanagement;

public class CustomerStock {
	private String customerName;
	private String stockName;
	private Double noOfShares;
	private Double perSharePrice;
	private Double TotalSharePrice;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public Double getPerSharePrice() {
		return perSharePrice;
	}

	public void setPerSharePrice(Double perSharePrice) {
		this.perSharePrice = perSharePrice;
	}

	public Double getTotalSharePrice() {
		return TotalSharePrice;
	}

	public void setTotalSharePrice(Double totalSharePrice) {
		TotalSharePrice = totalSharePrice;
	}

	@Override
	public String toString() {
		return "CustomerStock [ customerName=" + customerName + ", stockName=" + stockName + ", noOfShares="
				+ noOfShares + ", perSharePrice=" + perSharePrice + ", TotalSharePrice=" + TotalSharePrice + "]";
	}

}
