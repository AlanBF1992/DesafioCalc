package cl.desafiolatam.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OperacionesServlet
 */
@WebServlet("/resultado")
public class ResultadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultadoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numero1 = 0;
		int numero2 = 0;
		
		try {
			numero1 = Integer.parseInt(request.getParameter("numero1"));
			numero2 = Integer.parseInt(request.getParameter("numero2"));
		} catch (Exception ex) {
			// No es número entero, send to error page
			getServletContext().getRequestDispatcher("/error").forward(request, response);
		}
		
		String operacion = request.getParameter("operacion");
		
		String respuesta;
				
		switch(operacion) {
		case "Suma":
			respuesta = numero1 + " + " + numero2 + " = " + (numero1 + numero2) + ".";
			break;
		case "Resta":
			respuesta = numero1 + " - " + numero2 + " = " + (numero1 - numero2) + ".";
			break;
		case "Multiplicacion":
			respuesta = numero1 + " x " + numero2 + " = " + (numero1 * numero2) + ".";
			break;
		case "Division":
			respuesta = numero1 + " ÷ " + numero2 + " = " + (1.0f * numero1 / numero2) + ".";
			break;
		case "Ordenar":
			respuesta = "De menor a mayor, los números son: " + Math.min(numero1, numero2) + ", " + Math.max(numero1, numero2);
			break;
		case "Paridad":
			respuesta = "El número " + numero1 + " es: " + (numero1 % 2 == 0? "par": "impar") + ".";
			respuesta += "\nEl número " + numero2 + " es: " + (numero2 % 2 == 0? "par": "impar") + ".";
			break;
		default:
			respuesta = "";
			break;
		}
		
		request.setAttribute("respuesta", respuesta);
		doGet(request, response);
	}

}
