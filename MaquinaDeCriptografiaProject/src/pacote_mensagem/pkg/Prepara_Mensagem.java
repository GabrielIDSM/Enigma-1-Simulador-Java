package pacote_mensagem.pkg;
public class Prepara_Mensagem implements Prepara_Mensagem_IN{
    //Não possui atributos
    //Não possui Getters e Setters
    //Métodos IN
    private boolean verifica(String mensagem){
        char[] c = mensagem.toCharArray();
        boolean rt = true;
        for(int i=0; i<c.length; i++){
            if(Character.isDigit(c[i])){
                rt = false;
                break;
            }
        }
        return rt;
    }
    @Override
    public String Preparamensagem(String mensagem){        
        boolean b = verifica(mensagem);
        if(b){
            mensagem = mensagem.toUpperCase();
            mensagem = mensagem.replace(" ", "0");
        }else{
            mensagem = null;
        }
        return mensagem;
    }
    //Métodos FIM
}
