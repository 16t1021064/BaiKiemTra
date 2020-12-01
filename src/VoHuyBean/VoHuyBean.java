package VoHuyBean;

import java.sql.Date;

public class VoHuyBean {
	private int matin;
	private String tieude;
	private String tomtat;
	private Date ngayduatin;
	private String noidung;
	public int getMatin() {
		return matin;
	}
	public void setMatin(int matin) {
		this.matin = matin;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getTomtat() {
		return tomtat;
	}
	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}
	public Date getNgayduatin() {
		return ngayduatin;
	}
	public void setNgayduatin(Date ngayduatin) {
		this.ngayduatin = ngayduatin;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public VoHuyBean(int matin, String tieude, String tomtat, Date ngayduatin, String noidung) {
		super();
		this.matin = matin;
		this.tieude = tieude;
		this.tomtat = tomtat;
		this.ngayduatin = ngayduatin;
		this.noidung = noidung;
	}
	public VoHuyBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
