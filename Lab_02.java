/* Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật. 
Tính toán và in ra console:
- chu vi hình chữ nhật
- diện tích hình chữ nhật
- cạnh nhỏ nhất của hình chữ nhật*/

package Thuc_hanh_Lab;

import java.util.Scanner;

public class Lab_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
		int chieuDai = scanner.nextInt();
		System.out.print("Nhập chiều rộng của hình chữ nhật: ");
		int chieuRong = scanner.nextInt();

		// Tính chu vi hình chữ nhật
		System.out.println("Chu vi hình chữ nhật là: " + (chieuDai + chieuRong) * 2);
		// Tính diện tích hình chữ nhật
		System.out.println("Diện tích hình chữ nhật là: " + (chieuDai * chieuRong));
		// Tìm cạnh nhỏ nhất của hình chữ nhật
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + Math.min(chieuDai, chieuRong));
	}
}
