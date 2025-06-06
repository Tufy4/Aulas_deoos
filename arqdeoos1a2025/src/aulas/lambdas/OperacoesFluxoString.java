package aulas.lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class OperacoesFluxoString {
    public static void main(String[] args) {
        String strings[] = {"VERMELHO", "laranja", "amarelo", "verde", "Azul", "VIOLETA"};
        
        System.out.println(Arrays.asList(strings));
        
        List<String> lista;
        
        lista = Arrays.stream(strings)
                .map((x) -> x.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println(lista);
        
        lista = Arrays.stream(strings)
                .filter((x) -> x.compareToIgnoreCase("m") < 0)
                .collect(Collectors.toList());
        
        
        
        
    }
}
