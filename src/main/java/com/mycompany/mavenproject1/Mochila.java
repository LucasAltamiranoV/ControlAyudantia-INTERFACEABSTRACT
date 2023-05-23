/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Mochila extends Inventario{

    public Mochila() {
    }

    public Mochila(int Capacidad) {
        super(Capacidad);
    }
    
    
    public void UsarObjeto(){
    
        //Inventario inventario = new Inventario();
        String nombreTeclado;
        boolean noEsta = true;
        
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("INGRESE EL NOMBRE DEL OBJETO QUE DESEA UTILIZAR");
        
        nombreTeclado = entrada.next();
        
        /*for(int i = 0; i<ArregloInteractuables.size();i++){
            if(ArregloInteractuables.get(i).getNombreObjeto().equals(nombreTeclado)){
                noEsta = false;
                System.out.println("SE HA UTILIZADO EL OBJETO");

            }
        }*/
        
        //Aqui me daba un problema con el arreglo que se crea en Inventario (ArregloInteractuables)
        //Dice que es porque esta en privado, pero no creo que deba sacarle el private
        
        if(noEsta == true)
            System.out.println("USTED NO CUENTA CON ESE OBJETO");
    
    }

    @Override
    public void Ordenar() {
        
        //ORDENAR
    }

    @Override
    public void Guardar() {
        //GUARDAR
    }

    @Override
    public void Eliminar() {
        //ELIMINAR
    }
    
    
    
}
