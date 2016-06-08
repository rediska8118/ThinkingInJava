package ex04;

import java.util.Formatter;

public class Receipt {

	private double total = 0;
	private int width = 10;
	private Formatter f = new Formatter(System.out);

	public void printTitle() {
		f.format("%-" + width * 3 + "s %" + width + "s %" + width * 2 + "s\n",
				"Item", "Qty", "Price");
		f.format("%-" + width * 3 + "s %" + width + "s %" + width * 2 + "s\n", "----", "---", "-----");
	}

	public void print(String name, int qty, double price) {
		f.format("%-"+width*3+".15s %"+width+"d %"+width*2+".2f\n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		f.format("%-" + width * 3 + "s %" + width + "s %" + width * 2 + ".2f\n", "Tax", "", total * 0.06);
		f.format("%-" + width * 3 + "s %" + width + "s %" + width * 2 + "s\n", "", "", "-----");
		f.format("%-" + width * 3 + "s %" + width + "s %" + width * 2 + ".2f\n", "Total", "", total * 1.06);
	}

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack’s Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}
