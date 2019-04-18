/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.claseprofe.pojo.service;

import com.mycompany.claseprofe.pojo.controller.MateriaController;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author stevenpc
 */

@Stateless
@Path("materia") 
public class MateriaService {
    
 /*   MateriaController mt = new MateriaController();

 @GET
 @Produces(MediaType.APPLICATION_JSON)
 public Response retornMaterias(){
     
   return Response.ok(mt.getListaMateria()).build();
    }
    */
}

