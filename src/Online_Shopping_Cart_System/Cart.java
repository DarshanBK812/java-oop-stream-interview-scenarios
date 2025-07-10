package Online_Shopping_Cart_System;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

public class Cart {

	public static void main(String[] args) {
		List<Product> cart = new ArrayList<>(
				Arrays.asList(new Product(1, "Oreo", 10.00, 2), new Product(2, "DairyMilk", 100.00, 1),
						new Product(3, "Munch", 40.00, 2), new Product(4, "Mountain Due", 45.00, 1)));

		// 0.Print the Item name and itz price
//		Map<String, Integer> map = cart.stream().collect(Collectors.toMap(Product::getProductName,
//				Product::getProductQuantity, (existing, duplicate) -> existing));
//		System.out.println(map);

		// 1.Calculate total bill
//		double totalSum = cart.stream().mapToDouble(product -> product.getProductPrice() * product.getProductQuantity())
//				.sum();
//		System.out.println(totalSum);

		// 2.Remove product from cart based on ID
//		int id = 2;
//		ListIterator<Product> item = cart.listIterator();
//		Product item2 = null;
//		while (item.hasNext()) {
//			Product product = item.next();
//			if (id == product.getProductId()) {
//				item2 = product;
//				break;
//			}
//		}
//		cart.remove(item2);
//		
//		cart.stream().map(Product::getProductName).forEach(System.out::println);

		cart.remove(cart.stream().filter(item -> item.getProductId() == 2).findFirst().orElse(null));

		cart.forEach(System.out::println);
	}

}
