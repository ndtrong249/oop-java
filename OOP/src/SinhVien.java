import java.util.Scanner;

public class SinhVien {
	String masv;
	String ten;
	float m1;
	float m2;
	float m3;
	// constructer - Ham khoi tao
	public SinhVien() {
		
	}
	public SinhVien(String abc) {
		System.out.print("Ham khoi tao thu 2 - " + abc);
	}
	public SinhVien(String masinhvien, String ten, float m1, float m2, float m3) {
		this.masv = masinhvien;
		this.ten = ten;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public float tinhdiem() {
		return m1 + m2 + m3;
	}
	
	public void in() {
		System.out.print("\nMa SV: " + masv +
				"\nTen SV: " + ten +
				"\nDiem mon thu nhat: " + m1 + 
				"\nDiem mon thu hai: " + m2 + 
				"\nDiem mon thu ba: " + m3 +
				"\nTong diem 3 mon: " + tinhdiem());
	}
	
	
}
