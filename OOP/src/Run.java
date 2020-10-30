import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Nhap so luong sinh vien: ");
		//int soluongsv = sc.nextInt();
		// 3 sinh vien
		//int[] mangSoNguyen = new int[3];
		//SinhVien[] mangSinhVien = new SinhVien[soluongsv];
		List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
//		for(int i = 0; i < soluongsv; i++) {
//			System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ": ");
//			System.out.println("Nhap Ma sinh vien thu: ");
//			sc.nextLine();
//			String masv = sc.nextLine();
//			
//			System.out.println("Nhap ten sinh vien: ");
//			String ten = sc.nextLine();
//			
//			System.out.println("Nhap Diem mon hoc 1: ");
//			float diem1 = sc.nextFloat();
//			System.out.println("Nhap Diem mon hoc 2: ");
//			float diem2 = sc.nextFloat();
//			System.out.println("Nhap Diem mon hoc 3: ");
//			float diem3 = sc.nextFloat();
//			listSinhVien.add(new SinhVien(masv, ten, diem1, diem2, diem3));
//		}
		//
		//Enumarable
		//
		SinhVien sv = new SinhVien("17IT2", "nguyen A", 2.0f, 3.0f, 4.5f);
		listSinhVien.add(sv);
		listSinhVien.add(new SinhVien("18IT1", "nguyen B", 4.0f, 3.0f, 4.5f));
		listSinhVien.add(new SinhVien("19IT5", "nguyen C", 8.0f, 3.0f, 4.5f));
		
		boolean isContain = listSinhVien.contains(sv);
		
		if(isContain) {
			System.out.println("Bao gom doi tuong sinh vien");
		}else {
			System.out.println("khong bao gom doi tuong sinh vien");
		}
		// foreach
		for (SinhVien sinhVien : listSinhVien) {
			sinhVien.in();
		}
	}

}
