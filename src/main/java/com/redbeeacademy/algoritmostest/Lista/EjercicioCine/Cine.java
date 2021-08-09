package com.redbeeacademy.algoritmostest.Lista.EjercicioCine;

import java.util.List;
import java.util.Objects;

/*
Un cine de un pueblo nos pide que generemos una aplicacion para controlar las personas de una cola.
La edad de las personas de la cola se generan aleatoriamente entre 5 y 60 años (edad minima 5 - maxímo 60).
La capacidad de la sala es de 50 personas.
Deberemos mostrar:

1) la cantidad total recaudada
2) cuantas personas entraron por cada rango de edad
3) promedio de edad por cada estreno

Precios por edad
entre 5 y 10 años ->  $100
entre 11 y 17 años -> $150
de 18 en adelante -> $200

Tenemos la clase Persona, donde vamos a usarla para modelar edad, y las propiedades que crean convenientes
 */


public class Cine {

    public static double cantidadTotalRecaudada(List<Persona> personas) {
        double cantidadTotal = 0;
        for (Persona persona : personas) {
            if (persona.getEdad() >= 5 && persona.getEdad() <= 10) {
                cantidadTotal += 100;
            } else if (persona.getEdad() > 10 && persona.getEdad() < 18) {
                cantidadTotal += 150;
            } else {
                cantidadTotal += 200;
            }
        }
        return cantidadTotal;
    }



    public static Integer cantidadPersonas(List<Persona> personas) {
        Integer cantidadPersonasAdultas = 0;
        Integer cantidadPersonasAdolescentes = 0;
        Integer cantidadPersonasMenores = 0;
        for (Persona persona : personas){
            if (persona != null){
                if (persona.getEdad() >= 5 && persona.getEdad() <= 10){
                    cantidadPersonasMenores++;
                }else if (persona.getEdad() > 10 && persona.getEdad() < 18){
                    cantidadPersonasAdolescentes++;
                }else{
                    cantidadPersonasAdultas++;
                }
            }
        }
        int cantidadPersonas = cantidadPersonasMenores + cantidadPersonasAdolescentes + cantidadPersonasAdultas;
        return cantidadPersonas;
    }

    public static double promedioEdad(List<Persona> personas) {
        double promedio = 0;
        Integer contador = 0;

        for (Persona persona : personas){
            if (persona != null){
                promedio += persona.getEdad();
                contador += 1;
            }
        }
        promedio /= contador;
        return promedio;
    }
}
