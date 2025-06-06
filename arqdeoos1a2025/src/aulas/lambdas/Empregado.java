package aulas.lambdas;


public class Empregado implements Comparable<Empregado>{
    private String nome;
    private double salario;
    private String departamento;

    public Empregado(String nome, double salario, String departamento) {
        setNome(nome);
        setDepartamento(departamento);
        setSalario(salario);
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        }else{
            throw new IllegalArgumentException("O nome não pode ser nulo!");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
         if(salario > 0){
            this.salario = salario;
        }else{
            throw new IllegalArgumentException("O salario deve ser positivo");
        }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if(departamento != null){
            this.departamento = departamento;
        }else{
            throw new IllegalArgumentException("O departamento não pode ser nulo!");
        }
    }

    @Override
    public int compareTo(Empregado t) {
        if(getSalario() == t.getSalario()){
            return 0;
        }else{
            if(getSalario() > t.getSalario()){
                return 1;
            }else{
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "Empregado:" + "nome=" + getNome() + ", salario=" + getSalario() + ", departamento=" + getDepartamento() + '\n';
    }
    
    
    
    
    
}
