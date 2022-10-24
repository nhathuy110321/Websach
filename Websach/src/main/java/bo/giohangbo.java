package bo;

import java.security.spec.DSAGenParameterSpec;
import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.IfStatement;

import bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean> ds = new ArrayList<giohangbean>() ;
	public void Them(String masach, String tensach, long soluong, long giasach, String anh) {
		for(giohangbean g: ds)
		 if(g.getMasach().equals(masach)) {
			 g.setSoluong(soluong+ g.getSoluong());
			return; 
		 }
			ds.add(new giohangbean(masach, tensach, soluong, giasach, anh));
	}
	public void Xoa(String masach) {
		for (int i=0; i<ds.size(); i++) {
			if (ds.get(i).getMasach().equals(masach)) {
				ds.remove(i);
				return;
			}
		}
	}
	public void XoaAll() {
		ds.removeAll(ds);
	}
	public void XoaNhieu(String [] list) {
		for (String item: list) {
			for (int i=0; i<ds.size(); i++) {
				if (item.equals(ds.get(i).getMasach())) {
					ds.remove(i);
					i--;
				}
			}
		}
	}
	public long tongtien() {
		long sum=0;
		for (giohangbean g: ds) {
			sum=sum+ g.getThanhtien();
		}
		return sum;	
	}
	public long dems1() {
		long s1=0;
		for(giohangbean g:ds) {
			
			s1 +=g.getSoluong(); 
		}
		return s1;
	}
	public void sua(String masach, long sl) {
		for(int i =0; i< ds.size(); i++) {
			if(ds.get(i).getMasach().equals(masach)) {
				ds.get(i).setSoluong(sl);
			}
		}
	}
}
