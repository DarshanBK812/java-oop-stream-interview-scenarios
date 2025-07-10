package oop_design_oriented_scenarios_Banking_Management_System;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankingSystem {

	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(new SavingAccount("SBI", 1, "darshan", 1000, "Saving"),
				new SavingAccount("BankOfBaroda", 1, "Varsha", 100000, "Saving"),
				new SavingAccount("Canara", 1, "Maha", 100062, "Saving"),
				new SavingAccount("SBI", 1, "Chandu", 15100, "Saving"),
				new SavingAccount("SBI", 1, "Jummu", 1000, "Saving"));

		// Using collections
		List<String> names = new ArrayList<>();

		double sumBal = 0;

		String maxBalHOlder = "";
		double maxBal = Integer.MIN_VALUE;

		Map<String, Integer> map = new HashMap<>();

		for (Account account : accounts) {

			if (account.getBankName() == "SBI") {
				sumBal += account.getAccBal();
				names.add(account.getAccHolderName());
			}

			if (maxBal < account.getAccBal()) {
				maxBal = account.getAccBal();
				maxBalHOlder = account.getAccHolderName();
			}
			map.put(account.getBankName(), map.getOrDefault(account.getBankName(), 0) + 1);
		}

//		System.out.println(names);
//		System.out.println(sumBal);
//		System.out.println(maxBalHOlder);
//		System.out.println(map);

//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

//		 1. Print all account holder names who have an account in the "SBI" bank.

//		List<String> names2 = accounts.stream().filter((Account account) -> account.getBankName().equals("SBI"))
//				.map(Account::getAccHolderName).toList();
//		System.out.println(names2);

//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

//		2.Find the total balance of all "SBI" accounts.

//		Double sum = accounts.stream().filter(account -> account.getBankName().equals("SBI"))
//				.mapToDouble(Account::getAccBal).sum();
//		System.out.println(sum);

// <----------------------------------------------------------------------------------------------------------------------------------------------------------->
//		3.Find the account holder with the maximum balance.

//		System.out.println(
//				accounts.stream().max(Comparator.comparing(Account::getAccBal)).map(Account::getAccHolderName));

		// Minimum Balance
//		System.out.println(
//				accounts.stream().max(Comparator.comparing(Account::getAccBal).reversed()).map(Account::getAccHolderName));

//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

//		4.Count how many accounts are from each bank.
		
		Map<String, Long> map2 = accounts.stream().collect(Collectors.groupingBy(Account::getBankName, Collectors.counting()));

//		Map<String, Long> map2 = accounts.stream().collect(Collectors.groupingBy(Account::getBankName , Collectors.counting()));

//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

//		5.Sort and display all account holder names by their balance in descending order.
//		System.out.println(accounts.stream().sorted(Comparator.comparing(Account::getAccBal).reversed()).map(Account::getAccHolderName).toList());

//<----------------------------------------------------------------------------------------------------------------------------------------------------------->

//		 6.How would you count how many accounts exist for each bank using Streams?
//		Map<String, Long> countByBank = accounts.stream()
//			    .collect(Collectors.groupingBy(Account::getBankName, Collectors.counting()));
//		System.out.println();

	}
}