package VoHuyDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DungChung.CDungChung; 
import VoHuyBean.VoHuyBean;

public class VoHuyDao {
	Connection cn;
	public void KetNoi() throws Exception{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn= DriverManager.getConnection(CDungChung.url, CDungChung.un, CDungChung.pass);
	}
	public ArrayList<VoHuyBean> getTin() throws Exception{
		KetNoi();
		String sql= "select * from VoHuy";
		PreparedStatement cmd = cn.prepareStatement(sql);
		ResultSet r= cmd.executeQuery();
		ArrayList<VoHuyBean> ds = new ArrayList<VoHuyBean>();
		while(r.next()) {
			   int matin = r.getInt("MaTin");
			   String tieude = r.getString("TieuDe");
			   String tomtat = r.getString("TomTat");
			   Date ngayduatin = r.getDate("NgayDuaTin");
			   String noidung = r.getString("NoiDung");
			   VoHuyBean t = new VoHuyBean(matin, tieude, tomtat, ngayduatin, noidung);
			   ds.add(t);
		   }
		r.close();
		return ds;
	}
	public ArrayList<VoHuyBean> timTin(String ma) throws Exception{
		KetNoi();
		String sql= "select * from VoHuy where (TieuDe like N'%"+ma+"%') or (NoiDung like N'%"+ma+"%')";
		System.out.println(sql);
		PreparedStatement cmd = cn.prepareStatement(sql);
		ResultSet r= cmd.executeQuery();
		ArrayList<VoHuyBean> ds = new ArrayList<VoHuyBean>();
		while(r.next()) {
			   int matin = r.getInt("MaTin");
			   String tieude = r.getString("TieuDe");
			   String tomtat = r.getString("TomTat");
			   Date ngayduatin = r.getDate("NgayDuaTin");
			   String noidung = r.getString("NoiDung");
			   VoHuyBean t = new VoHuyBean(matin, tieude, tomtat, ngayduatin, noidung);
			   ds.add(t);
		   }
		r.close();
		return ds;
	}
}
