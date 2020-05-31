//Classe com os rotores
package pacote_rotores.pkg;

import pacote_rotores.pkg.Classes_Rotores_IN;

public class Classe_Rotores implements Classes_Rotores_IN {
    //Atributos: constantes com os rotores
    private final String R0 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String R1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
    private final String R2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
    private final String R3 = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
    private final String R4 = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
    private final String R5 = "VZBRGITYUPSDNHLXAWMJQOFECK";
    private final char[][] Ref = {{'Y', 'R'},{'U', 'H'},{'Q', 'S'},{'L', 'D'},{'P', 'X'},{'N', 'G'},{'O', 'K'},{'M', 'I'}, {'E', 'B'},{'F', 'Z'},{'C', 'W'},{'V', 'J'},{'A', 'T'}};
    //Getters
    private String getR0(){
        return R0;
    }
    private String getR1(){
        return R1;
    }
    private String getR2(){
        return R2;
    }
    private String getR3(){
        return R3;
    }
    private String getR4(){
        return R4;
    }
    private String getR5(){
        return R5;
    }
    private char[][] getRef(){
        return Ref;
    }
    //Setters não podem ser definidos pois são constantes
    //Métodos IN
    @Override
    public String define_rotor_usado(int n){
        String aux;
        switch (n) {
            case 0:
                aux = getR0();
                break;
            case 1:
                aux = getR1();
                break;
            case 2:
                aux = getR2();
                break;
            case 3:
                aux = getR3();
                break;
            case 4:
                aux = getR4();
                break;
            case 5:
                aux = getR1();
                break;
            default:
                aux = null;
                break;
        }
        return aux;
    }
    @Override
    public char[][] define_refletor(){
        return Ref;
    }
    //Métodos FIM
}
