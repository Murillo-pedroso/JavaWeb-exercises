package br.com.murillo.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
   private static List<Empresa> lista = new ArrayList<>();
   private static Integer id = 0;
    static{

        Empresa empresa = new Empresa();
        empresa.setNome("Fast");
        empresa.setId(id++);
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Google");
        empresa2.setId(id++);

        lista.add(empresa);
        lista.add(empresa2);
    }
    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.id++);
        Banco.lista.add(empresa);
    }

    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }

    public void removeEmpresa(Integer id) {
        Iterator<Empresa> it = lista.iterator();
        while(it.hasNext()){
            Empresa emp = it.next();
            if(emp.getId() == id){
                it.remove();
            }
        }


    }

    public Empresa buscaEmpresa(Integer id) {

        for (Empresa empresa:lista) {
        if(empresa.getId()==id){
            return empresa;
        }
        }
        return null;
    }
}
