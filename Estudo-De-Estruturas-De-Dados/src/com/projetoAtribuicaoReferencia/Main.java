package com.projetoAtribuicaoReferencia;

public class Main {
    public static void main(String[] args){
        int intA = 1;
        int intB = intA;

        System.out.println(intA +" " + intB);

        intA = 2;

        System.out.println(intA +" " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println(objA +" " + objB);

        objA.setNum(22);


        System.out.println(objA +" " + objB);
    }
}
