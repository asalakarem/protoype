package servlet;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import prototype.Button;
import prototype.PrototypeRegistry;


public class prototypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prototypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrototypeRegistry registry = new PrototypeRegistry();

        Button redButtonPrototype = new Button(10, 40, "red");

        
        registry.addItem("LandingButton", redButtonPrototype);

        Button clonedButton = (Button) registry.getByColor("red");

        request.setAttribute("clonedButton", clonedButton);

        request.getRequestDispatcher("prototype.jsp").forward(request, response);;



}}