package com.cjpm.gestorcoches.services;

import com.cjpm.gestorcoches.entities.CocheCombustion;
import com.cjpm.gestorcoches.factory.CocheFactoryImp;

import java.util.List;
import java.util.Optional;

import static com.cjpm.gestorcoches.factory.CocheType.COCHE_COMBUSTION;

public class CocheCombustionServiceImp implements ICocheCombustionService{

    //Atributo
    private CocheFactoryImp cocheFactory = new CocheFactoryImp();

    //Constructor
    public CocheCombustionServiceImp() {
    }

    public CocheCombustionServiceImp(CocheFactoryImp cocheFactory) {
        this.cocheFactory = cocheFactory;
    }

    //Getters y Setters
    public CocheFactoryImp getCocheFactory() {
        return cocheFactory;
    }

    public void setCocheFactory(CocheFactoryImp cocheFactory) {
        this.cocheFactory = cocheFactory;
    }


    //Funciones
        //Crear coche
    public CocheCombustion saveCocheCombustion() {
        return (CocheCombustion) cocheFactory.creadorAutomovil(COCHE_COMBUSTION);
    }


        // Mostrar todos los coches de Combustión
    @Override
    public List<CocheCombustion> findAllCocheCombustion() {
        return null;
    }

        // Obtener determinado coche de combustión
    @Override
    public Optional<CocheCombustion> findCocheCombustionById(Long id) {
        return null;
    }


}
