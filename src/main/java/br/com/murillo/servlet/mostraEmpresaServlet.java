package br.com.murillo.servlet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/mostraEmpresa")
public class mostraEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String paramId =  req.getParameter("id");
        Integer id = Integer.valueOf(paramId);
        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresa(id);
        req.setAttribute("empresa",empresa);
        RequestDispatcher rd = req.getRequestDispatcher("/formAlteraEmpresa.jsp");
        rd.forward(req,resp);

    }



}
