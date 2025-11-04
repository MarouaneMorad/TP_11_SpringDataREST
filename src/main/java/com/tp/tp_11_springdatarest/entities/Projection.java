package com.tp.tp_11_springdatarest.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde", types = Compte.class)
interface CompteProjection1 {
    double getSolde();
}

@Projection(name = "mobile", types = Compte.class)
interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}