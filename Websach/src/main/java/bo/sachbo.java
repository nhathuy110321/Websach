package bo;

import java.util.ArrayList;

import bean.sachbean;
import dao.sachdao;

public class sachbo {
	sachdao sdao= new sachdao();
	ArrayList<sachbean> ds;
	public ArrayList<sachbean> getsach(){
		
		ds= sdao.getsach();
	 	return ds;
	}
	   public ArrayList<sachbean> timkiemloai(ArrayList<sachbean> ds, String ml){
		   ArrayList<sachbean> dstimkiem = new ArrayList<sachbean>();
		   for (sachbean o : ds) {
			   if(o.getMaloai().equals(ml)) {
				   dstimkiem.add(o);
			   }
			
		}
		   return dstimkiem;
		   
		   
	   }
	   public ArrayList<sachbean> timkiemteni (ArrayList<sachbean> ds, String ten ){
		   ArrayList<sachbean> dstimkiem = new ArrayList<sachbean>();
		   for (sachbean o : ds) {
			   if (o.getTensach().toLowerCase().trim().contains(ten.toLowerCase().trim())
						 || o.getMaloai().toLowerCase().trim().contains(ten.toLowerCase().trim())
						 || o.getTacgia().toLowerCase().trim().contains(ten.toLowerCase().trim())) {
				   dstimkiem.add(o);
				}
		}
		   return dstimkiem;
	   }
	 
}
