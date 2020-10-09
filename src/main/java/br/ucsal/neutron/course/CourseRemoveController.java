package br.ucsal.neutron.course;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/coursedelet")
public class CourseRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CourseDAO dao = new CourseDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		dao.delet(id);
		response.sendRedirect("./course");
	}

}
