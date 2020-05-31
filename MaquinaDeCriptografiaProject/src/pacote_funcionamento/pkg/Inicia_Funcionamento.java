package pacote_funcionamento.pkg;
import pacote_prepararotores.pkg.*;
/*
A Classe precisa apenas de 1 método público e 1 construtor
O Método publico deverá retornar a mensagem criptografada 
em forma de String
*/
public class Inicia_Funcionamento implements Inicia_Funcionamento_IN {
    //Atributos IN
    private char[][] Ref_b;
    private String mensagem;
    private String U0;
    private String U1;
    private String U2;
    private String U3;
    private int n_U2;
    private int n_U3;
    //FIM
    //Getters IN
    private char[][] getRef_b(){ return Ref_b; }
    private String getmensagem(){ return mensagem; }
    private String getU0(){ return U0; }
    private String getU1(){ return U1; }
    private String getU2(){ return U2; }
    private String getU3(){ return U3; }
    private int getn_U2(){ return n_U2; }
    private int getn_U3(){ return n_U3; }
    //FIM
    //Setters IN
    private void setRef_b(char[][] Ref_b){
        this.Ref_b = Ref_b;
    }
    private void setmensagem(String mensagem){
        this.mensagem = mensagem;
    }
    private void setU0(String U0){
        this.U0 = U0;
    }
    private void setU1(String U1){
        this.U1 = U1;
    }
    private void setU2(String U2){
        this.U2 = U2;
    }
    private void setU3(String U3){
        this.U3 = U3;
    }
    private void setn_U2(int n_U2){
        this.n_U2 = n_U2;
    }
    private void setn_U3(int n_U3){
        this.n_U3 = n_U3;
    }
    //FIM
    //Construtor IN
    public Inicia_Funcionamento(char[][] Ref_b, String U0, String U1, String U2, String U3, String mensagem, int n_U2, int n_U3){
        setRef_b(Ref_b);
        setmensagem(mensagem);
        setU0(U0);
        setU1(U1);
        setU2(U2);
        setU3(U3);
        setn_U2(n_U2);
        setn_U3(n_U3);
    }
    //FIM
//Métodos IN
    //Método de cifragem IN
    private char cifragem(char c, String R_origem, String R_destino){
        char aux;
        char[] aux_origem = R_origem.toCharArray();
        char[] aux_destino = R_destino.toCharArray();
        for(int i=0; i<26; i++){
            if(c == aux_origem[i]){
                c = aux_destino[i];
                break;
            }            
        }
        return c;
    }
    //FIM
    private char cifragem_ref(char c, char[][] Ref_b){
        char aux = ' ';
        for(int i=0; i<13; i++){
            if(Ref_b[i][0] == c) {
                aux = Ref_b[i][1];
                break;
            }
            if(Ref_b[i][1] == c) {
                aux = Ref_b[i][0];
                break;
            }
        }
        return aux;
    }
    @Override
    public String funcionamento(){
        Prepara_Rotores Prepara_rotor = new Prepara_Rotores();
        char aux_c;
        char [] caux_U1 = U1.toCharArray(); char [] caux_U2 = U2.toCharArray();
        String mensagem_final = "";
        char[] mensagem_aux = mensagem.toCharArray();
        for(int i=0; i<mensagem.length(); i++){
            if(mensagem_aux[i] == '0'){
                mensagem_final += " ";
            }else{
                aux_c = cifragem(mensagem_aux[i], U0, U1);
                aux_c = cifragem(aux_c, U0, U2);
                aux_c = cifragem(aux_c, U0, U3);
                aux_c = cifragem_ref(aux_c, Ref_b);
                aux_c = cifragem(aux_c, U3, U0);
                aux_c = cifragem(aux_c, U2, U0);
                aux_c = cifragem(aux_c, U1, U0);
                mensagem_final += aux_c;
                setU1(Prepara_rotor.Prepararotor(U1, 1));
                caux_U1 = U1.toCharArray();
                switch(n_U2){
                    case 1:
                        if(caux_U1[0] == 'R'){
                            setU2(Prepara_rotor.Prepararotor(U2, 1));
                            caux_U2 = U2.toCharArray();
                            switch(n_U3){
                                case 1:
                                    if(caux_U2[0] == 'R') {
                                    setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 2:
                                    if(caux_U2[0] == 'F') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 3:
                                    if (caux_U2[0] == 'W') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 4:
                                    if (caux_U2[0] == 'K') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 5:
                                    if (caux_U2[0] == 'A') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                            }
                        }
                        break;
                    case 2:
                        if(caux_U1[0] == 'F'){
                            setU2(Prepara_rotor.Prepararotor(U2, 1));
                            caux_U2 = U2.toCharArray();
                            switch(n_U3){
                                case 1:
                                    if(caux_U2[0] == 'R') {
                                    setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 2:
                                    if(caux_U2[0] == 'F') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 3:
                                    if (caux_U2[0] == 'W') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 4:
                                    if (caux_U2[0] == 'K') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 5:
                                    if (caux_U2[0] == 'A') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                            }
                        }
                        break;
                    case 3:
                        if(caux_U1[0] == 'W') {
                            setU2(Prepara_rotor.Prepararotor(U2, 1));
                            caux_U2 = U2.toCharArray();
                            switch(n_U3){
                                case 1:
                                    if(caux_U2[0] == 'R') {
                                    setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 2:
                                    if(caux_U2[0] == 'F') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 3:
                                    if (caux_U2[0] == 'W') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 4:
                                    if (caux_U2[0] == 'K') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 5:
                                    if (caux_U2[0] == 'A') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                            }
                        }
                        break;
                    case 4:
                        if(caux_U1[0] == 'K') {
                            setU2(Prepara_rotor.Prepararotor(U2, 1));
                            caux_U2 = U2.toCharArray();
                                                        switch(n_U3){
                                case 1:
                                    if(caux_U2[0] == 'R') {
                                    setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 2:
                                    if(caux_U2[0] == 'F') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 3:
                                    if (caux_U2[0] == 'W') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 4:
                                    if (caux_U2[0] == 'K') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 5:
                                    if (caux_U2[0] == 'A') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                            }
                        }
                        break;
                    case 5:
                        if(caux_U1[0] == 'A') {
                            setU2(Prepara_rotor.Prepararotor(U2, 1));
                            caux_U2 = U2.toCharArray();
                                                        switch(n_U3){
                                case 1:
                                    if(caux_U2[0] == 'R') {
                                    setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 2:
                                    if(caux_U2[0] == 'F') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 3:
                                    if (caux_U2[0] == 'W') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 4:
                                    if (caux_U2[0] == 'K') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                                case 5:
                                    if (caux_U2[0] == 'A') {
                                        setU3(Prepara_rotor.Prepararotor(U3, 1));
                                    }
                                    break;
                            }
                        }
                        break;                    
                }
            }  
        }
        return mensagem_final;
    }
//FIM    
}
