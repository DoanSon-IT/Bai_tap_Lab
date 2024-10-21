/*Viết chương trình nhập vào bàn phím cạnh của một khối lập phương. 
Tính và xuất ra thể tích của hình lập phương.*/

package Thuc_hanh_Lab;

import java.util.Scanner;

public class Lab_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào độ dài cạnh của hình lập phương: ");
		double canh = scanner.nextDouble();

		// Tính thể tích: cạnh * cạnh * cạnh ( cạnh^3)
		System.out.println("Thể tích của hình lập phương là: " + Math.pow(canh, 3));

	}

}
