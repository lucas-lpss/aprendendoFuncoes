package com.functions;

public class BooleansFuncoes {
    static boolean conjuncao(boolean valorUm, boolean valorDois){
        if(valorUm && valorDois)
            return true;
        else return false;
    }

    boolean disjuncao(boolean valorUm, boolean valorDois){
        if(valorUm || valorDois)
            return true;
        else return false;
    }
}
