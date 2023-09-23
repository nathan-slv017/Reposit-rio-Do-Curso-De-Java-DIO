package com.projetoNo;

import java.lang.reflect.Array;

public class Main {


    public static void main(String[] args) {

        No<String> no1 = new No("Primeiro No");
        No<String> no2 = new No("Segundo No");
        No<String> no3 = new No("Terceiro No");
        No<String> no4 = new No("Quarto No");

        No[] todosOsNos = {no1, no2, no3, no4};

        int quantidadeDeNos = todosOsNos.length;

        for (int i = 0; i < quantidadeDeNos -1; i ++){
            todosOsNos[i].setProximoNo(todosOsNos[i + 1]);
        }

            for (int i = 0; i < quantidadeDeNos ; i++){
                System.out.println(todosOsNos[i].toString());
            }
        for (int i = 0; i < quantidadeDeNos -1; i++){
            System.out.println(todosOsNos[i].getProximoNo());
        }
    }

}
