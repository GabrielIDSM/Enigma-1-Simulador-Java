//Classe principal do programa Enigma 1
package pacoteprincipal.pkg1;

import pacote_rotores.pkg.*;
import pacote_prepararotores.pkg.*;
import pacote_mensagem.pkg.*;
import pacote_funcionamento.pkg.*;
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
    //Limpar o buffer do Scanner
        input  = input.reset();
    //Criando Variáveis IN
        String U1, U2, U3; //--> Rotores que serão usados
        int R_n1, R_n2, R_n3; //--> Numero dos rotores 1 a 5
        int R_ch1, R_ch2, R_ch3; //--> Chave dos rotores 0 a 26
    //FIM
    //Instanciando o objeto rotores IN
        Classe_Rotores Rotores = new Classe_Rotores();
        String U0 = Rotores.define_rotor_usado(0); // U0 = R0 --> Padrão 
        char[][] Ref_b = Rotores.define_refletor();
    //FIM
    //Instanciando o objeto Prepara IN
        Prepara_Rotores Prepara = new Prepara_Rotores();
    //FIM
    //Instanciando o objeto Prepara_mensagem IN
        Prepara_Mensagem Pre_Men = new Prepara_Mensagem();
    //FIM
//Input imaginário dos rotores a serem usados IN          
        U1 = Rotores.define_rotor_usado(1); // U1 = R1
        U2 = Rotores.define_rotor_usado(2); // U2 = R2
        U3 = Rotores.define_rotor_usado(3); // U3 = R3
//FIM
//Input imaginário das chaves a serem utilizadas IN
        U1 = Prepara.Prepararotor(U1, 0);
        U2 = Prepara.Prepararotor(U2, 1);
        U3 = Prepara.Prepararotor(U3, 26);
//FIM
//Input imaginário da mensagem IN
        String mensagem = "Quero criptografar essa mensagem";
        mensagem = Pre_Men.Preparamensagem(mensagem);
//FIM 
//Chamada do último método IN
        funcionamento(Ref_b, U0, U1, U2, U3, mensagem);
//FIM
    }
    public static void funcionamento(char[][] Ref_b, String U0, String U1, String U2, String U3, String mensagem){
//        Inicia_Funcionamento Funcionamento_1 = new Inicia_Funcionamento(Ref_b, U0, U1, U2, U3, mensagem);
//        String mensagem_final = Funcionamento_1.funcionamento();
//        System.out.println(mensagem_final);
    }
}
//        String teste = input.nextLine();
//        input  = input.reset(); --> limpar buffer