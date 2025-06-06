package aulas.lambdas;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class OperacoesFluxoEmpregado {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        
        
        empregados.add( new Empregado("Tufy", 1500.00, "CP"));
        empregados.add( new Empregado("Mario", 1250.00, "TI"));
        empregados.add( new Empregado("Beatriz", 2000.00, "TI"));
        
        empregados.stream()
                .filter((x) -> x.getSalario() >= 1100 && x.getSalario() <= 1750)
                .sorted()
                .forEach((x) -> System.out.println(x));
        
        
        List<Empregado> lista;
        
        lista = empregados.stream()
                .sorted(Comparator.comparing((x) -> x.getNome()))
                .collect(Collectors.toList());
        
        System.out.println(lista);
                
                
    }
}
