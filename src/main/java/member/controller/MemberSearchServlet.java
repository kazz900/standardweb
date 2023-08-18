package member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MemberSearchServlet
 */
@WebServlet("/msearch")
public class MemberSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberSearchServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 한글 인코딩 처리
		request.setCharacterEncoding("UTF-8");
		
		// 전송온 값 꺼내서 변수 또는 객체에 저장함
		String action = request.getParameter("action");
		String keyword = null, begin = null, end = null;
		
		if(action.equals("enrolldate")) {
			begin = request.getParameter("begin");
			end = request.getParameter("end");
		}else {
			keyword = request.getParameter("keyword");
		}
		
		// 모델 서비스 메소드로 값 전달하고 실행하고 결과 받기
		MemberService mservice = new MemberService();
		ArrayList<Member> list = null;
		
		switch (action) {
		case "id":
			list = mservice.selectSearchUserid(keyword);	
			break;
		case "gender":	
			list = mservice.selectSearchGender(keyword);	
			break;
		case "age":	
			list = mservice.selectSearchAge(keyword);
			break;
		case "enrolldate":	
			list = mservice.selectSearchEnrollDate(
					java.sql.Date.valueOf(begin),
					java.sql.Date.valueOf(end));
			break;
		case "loginok":	
			list = mservice.selectSearchLoginOK(keyword);
			break;
		default:
			break;
		}
		
		RequestDispatcher view = null;
		if(list.size() > 0) {
			view = request.getRequestDispatcher("views/member/memberListView.jsp");
			request.setAttribute("list", list);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			if(keyword != null) {
				request.setAttribute("message", action + "에 대한 " + keyword + " 결과가 존재하지 않습니다");
			}
		}
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
