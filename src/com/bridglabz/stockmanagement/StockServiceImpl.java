package com.bridglabz.stockmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockServiceImpl implements StockService {
	Scanner sc = new Scanner(System.in);
	List<Stock> stockList = new ArrayList<Stock>();
	List<Customer> customerList = new ArrayList<Customer>();
	List<CustomerStock> customerstockList = new ArrayList<CustomerStock>();

	@Override
	public void getStockList() {
		for (Stock stock : stockList) {
			System.out.println(stock);
		}
		System.out.println("------------------------------------------------");
	}

	@Override
	public Stock addStock(Stock st) {
		stockList.add(st);
		return st;
	}

	@Override
	public void addStock() {
		Stock st = new Stock();
		System.out.println("Enter stock id : ");
		int id = sc.nextInt();
		System.out.println("Enter stock name : ");
		String name = sc.next();
		System.out.println("Enter minimum number of stock : ");
		Double noOfStock = sc.nextDouble();
		System.out.println("Enter share price : ");
		Double sharePrice = sc.nextDouble();
		st.setId(id);
		st.setStockName(name);
		st.setNoOfShares(noOfStock);
		st.setSharePrice(sharePrice);
		addStock(st);
		System.out.println("Stock Added Successfully");
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void buyStock() {
		System.out.println("Enter your name : ");
		String name = sc.next();
		if (isCustomerAvailable(name)) {
			Customer cust = getCustomerDetail(name);
			System.out.println("Available Stocks: ");
			for (Stock stock : stockList) {
				System.out.println(stock);
			}
			System.out.println("Enter stock name : ");
			String stock = sc.next();
			if (isStockAvailable(stock)) {

				Stock st = getStockDetail(stock);
				System.out.println("Enter number of stock you want to buy: ");
				Double noOfStock = sc.nextDouble();
				if (st.getNoOfShares() > noOfStock) {
					CustomerStock custCt = new CustomerStock();
					custCt.setCustomerName(cust.getName());
					custCt.setStockName(st.getStockName());
					custCt.setNoOfShares(noOfStock);
					custCt.setPerSharePrice(st.getSharePrice());
					custCt.setTotalSharePrice(noOfStock * st.getSharePrice());
					st.setNoOfShares(st.getNoOfShares() - noOfStock);
					customerstockList.add(custCt);
					System.out.println("Stock purchased");
					System.out.println("----------------------------------------------------");
				}
			} else {
				System.out.println("Stock not found");
				System.out.println("----------------------------------------------------");
			}
		} else {
			System.out.println("Customer not found please register yourself");
			System.out.println("----------------------------------------------------");
		}

	}

	public void getStock(String next) {
		for (Stock stock : stockList) {
			if (stock.getStockName().equalsIgnoreCase(next)) {
				System.out.println("Stock Detail found : " + stock);
				System.out.println("----------------------------------------------------");
				break;
			} else {
				System.out.println("Stock not found");
				System.out.println("----------------------------------------------------");
				break;
			}
		}
	}

	public Stock getStockDetail(String next) {
		for (Stock stock : stockList) {
			if (stock.getStockName().equalsIgnoreCase(next)) {
				return stock;
			}
		}
		return null;
	}

	@Override
	public Customer addCustomer() {
		Customer c = new Customer();
		System.out.println("Enter Customer Id: ");
		int id = sc.nextInt();
		System.out.println("Enter Customer Name: ");
		String name = sc.next();
		System.out.println("Enter Customer Mobile: ");
		Long mob = sc.nextLong();
		c.setId(id);
		c.setName(name);
		c.setMobile(mob);
		customerList.add(c);
		System.out.println(c);
		System.out.println("---------------------------------------------------------------");
		return c;
	}

	@Override
	public void getCustomer() {
		System.out.println("Enter Customer name: ");
		String name = sc.next();
		for (Customer cust : customerList) {
			if (cust.getName().equalsIgnoreCase(name)) {
				System.out.println("Customer Details : " + cust);
				System.out.println("----------------------------------------------------");
				break;
			} else {
				System.out.println("Customer not found ");
				System.out.println("----------------------------------------------------");
				break;
			}
		}
	}

	@Override
	public void getAllCustomer() {
		if (!customerList.isEmpty()) {
			System.out.println("Customer Details : ");
			for (Customer cust : customerList) {
				System.out.println(cust);
			}
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("No customer available");
			System.out.println("----------------------------------------------------");
		}
	}

	@Override
	public boolean isCustomerAvailable(String name) {
		for (Customer cust : customerList) {
			if (cust.getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isStockAvailable(String name) {
		for (Stock stock : stockList) {
			if (stock.getStockName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Customer getCustomerDetail(String next) {
		for (Customer cust : customerList) {
			if (cust.getName().equalsIgnoreCase(next)) {
				return cust;
			}
		}
		return null;
	}

	@Override
	public void getStockCustomerDetails() {
		if (!customerstockList.isEmpty()) {
			System.out.println("Customer Stock Details : ");
			for (CustomerStock cust : customerstockList) {
				System.out.println(cust);
			}
			System.out.println("----------------------------------------------------");
		} else {
			System.out.println("No customer available");
			System.out.println("----------------------------------------------------");
		}
	}
}
