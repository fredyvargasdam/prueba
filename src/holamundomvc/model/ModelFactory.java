/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.model;

/**
 * Esta clase es una factoria para crear objetos de el modelo.
 * @author Endika Ubierna Lopez
 */
public class ModelFactory{
     public Model getModel(){
        return new ModelImplementation();
    }
}
