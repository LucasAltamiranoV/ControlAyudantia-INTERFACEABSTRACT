/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Pokedex extends Inventario{

    public Pokedex() {
    }

    public Pokedex(int Capacidad) {
        super(Capacidad);
    }

    
    public void ElegirPokemon(){
    
        int idTeclado;
        boolean seEncuentra = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("POR FAVOR INTRODUZCA EL ID DE SU POKEMON");
        
        idTeclado = entrada.nextInt();
        
        /*for(int i = 0; i<ArregloPokemones.size(); i++){
            if(ArregloPokemones.get(i).getIdPokemon() == idTeclado){
                seEncuentra = true;
                System.out.println("SU POKEMON SE HA ENCONTRADO");
            }
        }*/
        
        if(seEncuentra == false)
            System.out.println("NO POSEE ESE POKEMON");
        
    
        //Deje expresado como lo haria con un arreglo de pokemones
    }

    @Override
    public void Ordenar() {
        //ORDENAR POKEMONS
    }

    @Override
    public void Guardar() {
        //GUARDAR POKEMONS
    }

    @Override
    public void Eliminar() {
        //SACAR POKEMON
    }
    
    
    
    
}
