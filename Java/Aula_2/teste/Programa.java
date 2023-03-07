package Aula_2.teste;

import Aula_2.classes.Metodos;

public class Programa {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        metodos.setValor(100);
        System.out.println("Valor: " + metodos.getValor());

        //Chamar o metodo somarValor
        metodos.somarValor();
        System.out.println("Valor apos chamada do metodo: " + metodos.getValor());
    }
}
