
package aulas.colecoes;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)  {
        if(nome!=null){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("O nome não pode ser nulo");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade)  {
        if(idade>=0){
            this.idade = idade;
        }else{
            throw new IllegalArgumentException("A idade não pode ser menor que zero");
        }
        
    }
    
//    @Override 
    public String toString(){
        return "nome: "+nome+ "("+idade+")";
    }

    @Override
    public int compareTo(Pessoa t) {
       if(getIdade()==t.getIdade()){
           return 0;
       }else{
           if(getIdade()>t.getIdade()){
               return 1;
           }
           else{
               return -1;
           }
       }
    }
    
    
    
   
}
