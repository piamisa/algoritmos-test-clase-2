package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Lista {

    public static List<Integer> guardarEnLista(Integer numero) {
        List<Integer> lista = new ArrayList<>();
        if (numero != null) {
            lista.add(numero);
        } else {
            lista.add(0);
        }
        return lista;
    }

    public static List<Integer> intercambiar(List<Integer> lista) {
        lista = new ArrayList<>(lista);

        if (lista.size() < 4)
            return lista;

        lista.removeIf(Objects::isNull);

        Integer auxValorPos2 = lista.get(2);
        lista.add(2, lista.get(4));
        lista.remove(3);
        lista.add(4, auxValorPos2);
        lista.remove(5);
        return lista;

    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero) {
        lista = new ArrayList<>(lista);

        lista.removeIf(Objects::isNull);
        lista.add(0, numero);
        return lista;
    }

    public static Double promedioLista(List<Integer> lista) {
        lista = new ArrayList<>(lista);

        lista.removeIf(Objects::isNull);

        Double suma = 0.0;
        for (int num : lista){
            suma += num;
        }
        Double promedio = suma / lista.size();
        return promedio;

    }

    public static List<Integer> eliminarMaximo(List<Integer> lista) {
        lista = new ArrayList<>(lista);

        lista.removeIf(Objects::isNull);

        Integer max = 0;
        for (int num : lista){
            if (num > max)
                max = num;
        }
        Integer quitarMax = lista.remove(lista.indexOf(max));
        return lista;

    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b) {
        List<Integer> list1 = new ArrayList<>(a);
        List<Integer> list2 = new ArrayList<>(b);
        List<Integer> listRep = new ArrayList<>();

        list1.removeIf(Objects::isNull);
        list2.removeIf(Objects::isNull);

        for (Integer i = 0; i < a.size(); i++){
            for (Integer j = 0; j < b.size(); j++){
                if (a.get(i) == b.get(j)){
                    listRep.add(a.get(i));
                }
            }
        }
        return listRep;

    }

}
