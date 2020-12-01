package VoHuyBo;

import java.util.ArrayList;

import VoHuyBean.VoHuyBean;
import VoHuyDao.VoHuyDao;

public class VoHuyBo {
	VoHuyDao t = new VoHuyDao();
	public ArrayList<VoHuyBean> getTin() throws Exception{
		return t.getTin();
	}
	public ArrayList<VoHuyBean> timTin(String ma) throws Exception{
		return t.timTin(ma);
	}
}
