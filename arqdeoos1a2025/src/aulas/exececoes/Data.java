//Exceções nao verificadas nao sao necessarias try catch(tratamento)
/*Verificadas voce é obrigado a lidar com ela, tem duas opçoes para isso:
 1º abre try catch
 2° postergar o problema usando "throws Exception". Boa pratica de programação é tratar todas as exceções em um lugar so


*/
package aulas.exececoes;

public class Data {
    private int dia, mes, ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31){
            this.dia = dia;
        }else{
            throw new ErroNaoVerificado("O dia deve estar entre 1 e 31.");
        }
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else{
            throw new ErroVerificado("O mes deve estar entre 1 e 12");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0){
            this.ano = ano;
        }else{
            throw new ErroNaoVerificado("O ano tem que ser positivo.");
        }
    }
    
}
