package bean;

public class giohangbean {
	 String masach;
	 String tensach;
	 long giasach, soluong;
	 String anh;
	 long thanhtien;
	public giohangbean(String masach, String tensach, long soluong , long giasach, String anh) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		
		this.soluong = soluong;
		this.giasach = giasach;
		this.anh = anh;
		this.thanhtien = soluong * giasach;
	}
	public giohangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMasach() {
		return masach;
	}
	public void setMasach(String masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getGiasach() {
		return giasach;
	}
	public void setGiasach(long giasach) {
		this.giasach = giasach;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public long getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = soluong * giasach;
	}
}
