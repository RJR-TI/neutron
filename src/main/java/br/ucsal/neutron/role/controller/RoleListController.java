package br.ucsal.neutron.role.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.neutron.role.dao.RoleDAO;
import br.ucsal.neutron.role.model.Role;



@WebServlet("/role")
public class RoleListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   private RoleDAO dao = new RoleDAO();
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Role> roles = dao.listar();
		
		request.setAttribute("roles", roles);
		request.getRequestDispatcher("./role/list.jsp").forward(request, response);
	}

}
