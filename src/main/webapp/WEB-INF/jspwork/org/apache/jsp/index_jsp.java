/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-08-14 04:06:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/common/footer.jsp", Long.valueOf(1691979561595L));
    _jspx_dependants.put("/views/common/menubar.jsp", Long.valueOf(1691983679438L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"views/common/error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("    <html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>first</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            div.lineA {\r\n");
      out.write("                height: 100px;\r\n");
      out.write("                border: 1px solid grey;\r\n");
      out.write("                float: left;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                left: 120px;\r\n");
      out.write("                margin: 5px;\r\n");
      out.write("                padding: 5px;\r\n");
      out.write("            }\r\n");
      out.write("            div#banner {\r\n");
      out.write("                width: 500px;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("            }\r\n");
      out.write("            div#banner img {\r\n");
      out.write("                width: 450px;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("            }\r\n");
      out.write("            div#loginBox {\r\n");
      out.write("                width: 280px;\r\n");
      out.write("                font-size: 10pt;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding-left: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            div#loginBox button{\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 35px;\r\n");
      out.write("                background-color: navy;\r\n");
      out.write("                color: white;\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("                margin-bottom: 15px;\r\n");
      out.write("                font-size: 14pt;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function movePage() {\r\n");
      out.write("                //자바스크립트로 페이지 이동 또는 서블릿 컨트롤러 연결 요청시\r\n");
      out.write("                //location 내장객체의 href 속성을 사용함\r\n");
      out.write("                location.href = \"/first/views/member/loginPage.html\";\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>firstWebProject : first</h1>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    ");
      out.write('\r');
      out.write('\n');

    	//로그인 확인을 위해서 내장된 session 객체를 이용
    	Member loginMember = (Member) session.getAttribute("loginMember");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	nav > ul#menubar{\r\n");
      out.write("		list-style: none;\r\n");
      out.write("		position: relative;\r\n");
      out.write("		left: 150px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	nav > ul#menubar li {\r\n");
      out.write("		float: left;\r\n");
      out.write("		width: 120px;\r\n");
      out.write("		height: 30px;\r\n");
      out.write("		margin: 5px;\r\n");
      out.write("		padding: 0;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	nav > ul#menubar li a {\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("		width: 120px;\r\n");
      out.write("		height: 30px;\r\n");
      out.write("		display: block;\r\n");
      out.write("		background: orange;\r\n");
      out.write("		color: navy;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		margin: 0;\r\n");
      out.write("		text-shadow: 1px 1px 2px white;\r\n");
      out.write("		padding-top: 5px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	nav > ul#menubar li a:hover {\r\n");
      out.write("		text-decoration: none;\r\n");
      out.write("		width: 120px;\r\n");
      out.write("		height: 30px;\r\n");
      out.write("		display: block;\r\n");
      out.write("		background: navy;\r\n");
      out.write("		color: white;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		margin: 0;\r\n");
      out.write("		text-shadow: 1px 1px 2px white;\r\n");
      out.write("		padding-top: 5px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	hr{\r\n");
      out.write("		clear: both;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
 if(loginMember == null) { //로그인 하지 않았을 때 
      out.write("\r\n");
      out.write("		<nav>\r\n");
      out.write("			<ul id=\"menubar\">\r\n");
      out.write("				<li><a href=\"/first/index.jsp\">Home</a></li>\r\n");
      out.write("				<li><a href=\"/frist/nlist.admin\">공지사항</a></li>\r\n");
      out.write("				<li><a href=\"/first/blist?page=1\">게시글</a></li>\r\n");
      out.write("				<li><a href=\"#\">QnA</a></li>\r\n");
      out.write("				<li><a href=\"/first/views/testapi/testList.html\">테스트</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("	");
 } else if(loginMember.getAdmin().equals("Y")){ //관리자가 로그인 했을때 
      out.write("\r\n");
      out.write("		<nav>\r\n");
      out.write("			<ul id=\"menubar\">\r\n");
      out.write("				<li><a href=\"/first/index.jsp\">Home</a></li>\r\n");
      out.write("				<li><a href=\"/frist/nlist.admin\">공지사항관리</a></li>\r\n");
      out.write("				<li><a href=\"/first/blist?page=1\">게시글관리</a></li>\r\n");
      out.write("				<li><a href=\"/first.mlist\">회원관리</a></li>\r\n");
      out.write("				<li><a href=\"/first/views/testapi/testList.html\">테스트</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("	");
 } else { //일반회원이 로그인 했을때
      out.write("\r\n");
      out.write("		<nav>\r\n");
      out.write("			<ul id=\"menubar\">\r\n");
      out.write("				<li><a href=\"/first/index.jsp\">Home</a></li>\r\n");
      out.write("				<li><a href=\"/frist/nlist\">공지사항</a></li>\r\n");
      out.write("				<li><a href=\"/first/blist?page=1\">게시글</a></li>\r\n");
      out.write("				<li><a href=\"#\">암호화회원가입</a></li>\r\n");
      out.write("				<li><a href=\"/first/views/testapi/testList.html\">테스트</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("	");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <center>\r\n");
      out.write("                            <div id=\"banner\" class=\"lineA\">\r\n");
      out.write("                                <img src=\"/first/resources/images/photo2.jpg\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
 if(loginMember == null) {
      out.write("\r\n");
      out.write("                            <div id=\"loginBox\" class=\"lineA\">\r\n");
      out.write("                                first 사이트 방문을 환영합니다.<br>\r\n");
      out.write("                                <button onclick=\"movePage();\">로그인 하세요.</button><br>\r\n");
      out.write("                                <a href=\"/first/views/\">아이디/비밀번호 조회</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
 } else { //로그인했다면
      out.write("\r\n");
      out.write("                            <div id=\"loginBox\" class=\"lineA\">\r\n");
      out.write("                                ");
      out.print( loginMember.getUserName() );
      out.write(" 님.&nbsp;\r\n");
      out.write("                                <a href=\"/first/logout\">로그아웃</a><br>\r\n");
      out.write("                                <a href=\"\"></a>&nbsp;<a href=\"\">채팅</a>&nbsp;<a href=\"\">쪽지</a><br>\r\n");
      out.write("                                <a href=\"/first/myinfor?userid=");
      out.print( loginMember.getUserId() );
      out.write("\">My Page</a>\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </center>\r\n");
      out.write("                        <hr style=\"clear:both\">\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("footer {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	background-color: navy;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<footer>\r\n");
      out.write("		copyright@ict.org &nbsp; 지능형 도우미 서비스 융합 웹 개발자과정  <br> 서울시 서초구\r\n");
      out.write("		신논현동 ict기술협회, TEL : 02-1234-5678, FAX : 02-1234-5678\r\n");
      out.write("	</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}