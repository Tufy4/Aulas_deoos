package aulas.excecoes;

public class Data {
    
    private int dia,mes,ano;// criação dos atributos da classe

    
    
    public int getDia() { //metodo get para pegar o valor do atributo dia
        return dia;
    }

    public void setDia(int dia) { // metodo set para alterar o valor do atributo dia
        if(dia>=1 && dia<= 31){//verifica se o valor de dia, esta no intervalo aceito
           this.dia = dia; //caso esteja é modificado o valor dia
        }else{
            throw new ErroNaoVerificado("O dia deve estar entre 1 e 31");//caso não, é jogado um erro
        }
        
    }

    public int getMes() {//metodo get para pegar o valor do atributo mes
        return mes;
    }

    public void setMes(int mes)throws Exception{ //metodo set para alterar o valor do atributo mes
        if(mes>=1 && mes<=12){  //verifica se o atributo mes está no intervalo aceito
            this.mes = mes;//caso esteja o atributo é modificado
        }else{
            throw new ErroVerificado("O mes deve estar entre 1 e 12.");
            //caso nao esteja é jogado um erro
        }
    }

    public int getAno() {
        return ano;
        //return o valor do atributo ano
    }

    public void setAno(int ano) {
        if(ano>0){//verifica se ano esta no intervalo de tempo denifido
            this.ano = ano;//caso esteja é alterado o valor do atributo ano
        }else{
            throw new ErroNaoVerificado("O ano tem que ser positivo");
            //caso não esteja, é jogado um erro
        }
    }
    
    
    
}
