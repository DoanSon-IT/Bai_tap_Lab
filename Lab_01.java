/*Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím. 
In ra màn hình với định dạng:
<tên_sinh_viên> có điểm = <điểm> 
Ví dụ: "Eric" có điểm = 9.6
 */

package Thuc_hanh_Lab;

import java.util.Scanner;

public class Lab_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sinh viên: ");
		String name = scanner.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		double dtb = scanner.nextDouble();

		System.out.println(name + " có điểm trung bình là: " + dtb);
	}
}
