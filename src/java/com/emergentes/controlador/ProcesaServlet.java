


package com.emergentes.controlador;

import com.emergentes.modelo.Registro;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JHOMARA
 */
@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre =request.getParameter("nombre");
        String correo=request.getParameter("correo");
        String telefono =request.getParameter("telefono");
        
        Registro regi=new Registro();
         
        regi.setNombre(nombre);
        regi.setCorreo(correo);
        regi.setTelefono(telefono);
        
        request.setAttribute("miregi", regi);
        
        request.getRequestDispatcher("salida.jsp").forward(request, response);
        
       
    }

}
