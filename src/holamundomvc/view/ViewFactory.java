/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.view;

/**
 * Factoria de la vista.
 * @author Endika Ubierna Lopez
 */
public class ViewFactory{
    /**
     * Este metodo se encarga de crear una implementacion de la vista.
     * @return Devuelve la interfaz Vista. //Nunca retornar una clase siempre la interfaz.

     */
    public View getView(){
        //return new ViewImplementation();
        return new ViewVentana();
    }
}

