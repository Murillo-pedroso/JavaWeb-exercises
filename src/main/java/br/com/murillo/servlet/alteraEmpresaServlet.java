package br.com.murillo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@WebServlet("/alteraEmpresa")
public class alteraEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Banco banco = new Banco();

        Date dataAbertura = null;

        Integer id = Integer.valueOf(req.getParameter("id"));
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(req.getParameter("data"));
        }catch(ParseException e){
            throw new ServletException(e);
        }
        Empresa empresa = banco.buscaEmpresa(id);
        empresa.setNome(req.getParameter("nome"));
        empresa.setDataAbertura(dataAbertura);
        resp.sendRedirect("listaEmpresas");
    }



}
