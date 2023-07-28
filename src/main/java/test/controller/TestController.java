package test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestController extends HttpServlet {
  private static final long serialVersionUID = 1L;  //???
 
  @Override   //DOG然後按ENTER快捷鍵
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  	var xxx = req.getParameter("xxx");   //如何帶到jsp網頁上顯示出來
	  	req.setAttribute("nickname", xxx);  //key value
	  	req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
