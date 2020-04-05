package pacote_prepararotores.pkg;
//A classe deverá ter um método que pode receber uma String e um numero inteiro n
//e que deve retornar uma nova String, porém com os caracteres realocados n casas
//a direita
public class Prepara_Rotores implements Prepara_Rotores_IN {
    //Não conterá atributos
    //Não conterá getters
    //Não conterá setters
    //Métodos IN
    private boolean verifica(int n){
        boolean rt = true;
        if(n<0 || n>26) rt = false;
        return rt;
    }
    @Override
    public String Prepararotor(String S, int n){
        boolean rt = verifica(n);
        if(!rt) return null;
        String aux = ""; int i = 0; char c;
        if(n==0 || n==26){ 
            aux = S;
            return aux;
        }
        for(i=0; i<26; i++){
            if((n+i)<26){
                c = S.charAt((n+i));
                aux += c;
            }else{
                c = S.charAt((n+i-26));
                aux += c;
            }
        }
        return aux;
    }
    //Métodos FIM
}
