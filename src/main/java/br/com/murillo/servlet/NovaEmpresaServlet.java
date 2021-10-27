package br.com.murillo.servlet;

import javax.script.ScriptContext;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out = resp.getWriter();
        Empresa empresa = new Empresa();
        Banco banco = new Banco();

        empresa.setNome(req.getParameter("nome"));
        Date dataAbertura = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura = sdf.parse(req.getParameter("data"));
        }catch(ParseException e){
            throw new ServletException(e);
        }
        empresa.setDataAbertura(dataAbertura);
        banco.adiciona(empresa);

        req.setAttribute("empresa", empresa.getNome());
        resp.sendRedirect("listaEmpresas");
        System.out.println(req);
        System.out.println(resp);
    }



}
