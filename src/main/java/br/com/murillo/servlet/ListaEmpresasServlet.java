package br.com.murillo.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
    @Override
    protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Empresa> listaEmpresas = banco.getEmpresas();
        request.setAttribute("empresas",listaEmpresas);


        RequestDispatcher rd = request.getRequestDispatcher(("/listaEmpresa.jsp"));
        rd.forward(request,response);

    }


}
