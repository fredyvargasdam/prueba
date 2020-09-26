/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc;

import holamundomvc.controller.Controller;
import holamundomvc.model.ModelFactory;
import holamundomvc.view.ViewFactory;

/**
 * Esta es la clase aplicación para el proyecto HolaMundoMVC.
 * @author 2dam
 */
public class Application {

    /**
     * Esta clase va a pedir objetos de la vista y el modelo a las factorias respectivas.
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        ModelFactory miModelo = new ModelFactory();
        ViewFactory miVista = new ViewFactory();
       
        Controller miControlador;
        miControlador = new Controller();
        
        miControlador.run(miVista.getView(),miModelo.getModel());
        
    }
    
}
