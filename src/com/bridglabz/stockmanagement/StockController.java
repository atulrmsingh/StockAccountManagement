package com.bridglabz.stockmanagement;

import java.util.Scanner;

public class StockController {
	static Scanner sc = new Scanner(System.in);
	static StockServiceImpl stockService = new StockServiceImpl();

	public static void main(String[] args) {
		StockController stc = new StockController();
		int count = 9;
		int result;
		do {
			result = showMainMenu();
			stc.handleUserSelection(result);
		} while (result != count);

	}

	public static int showMainMenu() {
		System.out.println("Press 1.Add Stock\n" + "Press 2.Get Stock\n" + "Press 3.Get All Stock\n"
				+ "Press 4.Add Customer\n" + "Press 5.Buy Stock\n" + "Press 6.Get Customer Details\n"
				+ "Press 7.Get All Customer\n" + "Press 8.Get Customer Stock Details\n" + "press 9.exit");
		int val = sc.nextInt();
		return val;
	}

	public void handleUserSelection(int val) {
		switch (val) {
		case 1:
			stockService.addStock();
			break;
		case 2:
			System.out.println("Enter Stock name: ");
			stockService.getStock(sc.next());
			break;
		case 3:
			stockService.getStockList();
			break;
		case 4:
			stockService.addCustomer();
			break;
		case 5:
			stockService.buyStock();
			break;
		case 6:
			stockService.getCustomer();
			break;
		case 7:
			stockService.getAllCustomer();
			break;
		case 8:
			stockService.getStockCustomerDetails();
			break;
		case 9:
			System.out.println("application closed");
			System.out.println("------------------------------------------------------------");
			break;
		default:
			System.out.println("Invalid Choice .. Try Again.");
			System.out.println("------------------------------------------------------------");
		}
	}
}
