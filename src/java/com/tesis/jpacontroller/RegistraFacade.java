/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tesis.jpacontroller;

import com.tesis.jpa.Registra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorge
 */
@Stateless
public class RegistraFacade extends AbstractFacade<Registra> {
    @PersistenceContext(unitName = "capacityssoftPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistraFacade() {
        super(Registra.class);
    }
    
}
