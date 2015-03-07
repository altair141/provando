package my.calculator.garabator.linux;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Operar extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Float A,B;
		String operacion = req.getParameter("operacion");
		
		resp.getWriter().print("<html><body>");
		try{
			A = new Float(req.getParameter("valorA"));
			B = new Float(req.getParameter("valorB"));
		}catch(Exception e){
			resp.getWriter().print("<h3>Los valores ingresados no son incorrectos</h3>");
			resp.getWriter().print("<br/><button onclick='window.history.back()'>Regresar</button>");
			return;
		}
		if(operacion.equals("S")){//Suma
			resp.getWriter().print("<h3>El valor "+A+" + "+B+" = "+(A+B)+"</h3>");
		}else if(operacion.equals("R")){//Resta
			resp.getWriter().print("<h3>El valor "+A+" - "+B+" = "+(A-B)+"</h3>");
		}else if(operacion.equals("M")){//Multiplicacion
			resp.getWriter().print("<h3>El valor "+A+" * "+B+" = "+(A*B)+"</h3>");
		}else if(operacion.equals("D")){//Division
			if(B==0)
				resp.getWriter().print("<h3>No puedes dividir entre cero =P</h3>");
			else
				resp.getWriter().print("<h3>El valor "+A+" / "+B+" = "+(A/B)+"</h3>");
		}
		resp.getWriter().print("<br/><button onclick='window.history.back()'>Regresar</button>");
		resp.getWriter().print("</html></body>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	

}
