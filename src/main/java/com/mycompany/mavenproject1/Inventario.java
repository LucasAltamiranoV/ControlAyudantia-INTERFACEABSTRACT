/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt t Capacidadto change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sala-2-11-PC06
 */
public class Inventario {
 
    private int Capacidad;
    private ArrayList <Interactuables> ArregloInteractuables = new ArrayList();

    public Inventario() {
    }

    public Inventario(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public ArrayList<Interactuables> getArregloInteractuables() {
        return ArregloInteractuables;
    }

    public void setArregloInteractuables(ArrayList<Interactuables> ArregloInteractuables) {
        this.ArregloInteractuables = ArregloInteractuables;
    }
    
    //CRUD -----------------------------------------------------------------------------------
 
    /*public Interactuables CrearDatos(){
        
        Interactuables interact = new Interactuables();
        int idObj;
        String nombreObj;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("POR FAVOR INTRDUZCA EL ID DEL OBJETO");
        idObj = entrada.nextInt();
        System.out.println("POR FAVOR INTRDUZCA EL ID DEL OBJETO");
        nombreObj = entrada.next();
        
        interact.setIdObjeto(idObj);
        interact.setNombreObjeto(nombreObj);
        
        
        
        return interact;
        
    }
    
    public void AgregarDatos(){
    
       int opcion;
       Scanner entrada = new Scanner(System.in);
       
       do{
           
           ArregloInteractuables.add(CrearDatos());
           
           System.out.println("PARA CONTINUAR AÑADIENDO POR FAVOR INGRESE 1, SINO CUALQUIER OTRO NUMERO PARA TERMINAR");
           opcion = entrada.nextInt();
           
       }while(opcion!= 1);
    
    }
    
    public void MostrarDatos(){
    
        for(int i = 0; i<ArregloInteractuables.size();i++){
            System.out.println(ArregloInteractuables.get(i).getIdObjeto());
            System.out.println(ArregloInteractuables.get(i).getNombreObjeto());
        
        }
    
    }
    
    public void EliminarDato(int idInterac){
    
        boolean NoSeElimino = true;
        for(int i = 0;i<ArregloInteractuables.size();i++){
            if(ArregloInteractuables.get(i).getIdObjeto() == idInterac){
                ArregloInteractuables.remove(i);
                NoSeElimino = false;
                System.out.println("EL OBJETO SE HA REMOVIDO CON EXITO");
            }
        }
        
        if(NoSeElimino == false)
            System.out.println("EL OBJETO INGRESADO NO EXISTE");
    
    }
    
    public void ModificarDatos(){
    
        int idTeclado;
        String nombreTeclado;
        int idAModificar;
        boolean noSeCambio = true;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("POR FAVOR INGRESE EL ID DEL OBJETO QUE DESEA MODIFICAR");
        
        idAModificar = entrada.nextInt();
        
        System.out.println("INGRESE UN NUEVO ID");
        idTeclado = entrada.nextInt();
        
        System.out.println("INGRESE UN NUEVO NOMBRE");
        nombreTeclado = entrada.next();
        
        for(int i = 0; i<ArregloInteractuables.size();i++){
            if(ArregloInteractuables.get(i).getIdObjeto() == idAModificar){
                ArregloInteractuables.get(i).setIdObjeto(idTeclado);
                ArregloInteractuables.get(i).setNombreObjeto(nombreTeclado);
                noSeCambio = false;
                System.out.println("NSE HA MODIFICADO EL OBJETO CON EXITO");
            }

        }
        
        if(noSeCambio == true)
            System.out.println("NO SE HA ENCONTRADO EL OBJETO CON ESE ID, POR LO TANTO NADA SE MODIFICO");
        
    
    
    
    
    }*/
}
