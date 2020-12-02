package VoHuyController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VoHuyBean.VoHuyBean;
import VoHuyBo.VoHuyBo;

/**
 * Servlet implementation class VoHuyController
 */
@WebServlet("/VoHuyController")
public class VoHuyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoHuyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			String ma = request.getParameter("txttk");
			VoHuyBo t = new VoHuyBo();
			if(ma !=null) {
						ArrayList<VoHuyBean> dsma = t.timTin(ma);
						request.setAttribute("lstma", dsma);
				}
			else {
				ArrayList<VoHuyBean> dstin = t.getTin();
				request.setAttribute("lsttin", dstin);
			}
			RequestDispatcher rd = request.getRequestDispatcher("HienThi.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
