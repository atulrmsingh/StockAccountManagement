package com.bridglabz.stockmanagement;

public interface StockService {

	public void getStockList();

	public Stock addStock(Stock st);

	public void getStock(String next);

	public void addStock();

	public void buyStock();

	public Customer addCustomer();

	public void getCustomer();

	public void getAllCustomer();

	public boolean isCustomerAvailable(String name);

	public boolean isStockAvailable(String name);

	public Stock getStockDetail(String next);

	public Customer getCustomerDetail(String next);

	public void getStockCustomerDetails();
}
