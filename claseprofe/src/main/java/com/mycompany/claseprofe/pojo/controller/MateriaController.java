/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseprofe.pojo.controller;

import com.mycompany.claseprofe.Materia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stevenpc
 */
public class MateriaController {
    
  private List<Materia> listaMateria;
    public MateriaController()
    {
        listaMateria = new ArrayList<>();
        listaMateria.add(new Materia(1, "matematicas"));
        listaMateria.add(new Materia(2, "español"));
        listaMateria.add(new Materia(3, "sociales"));
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }
}
