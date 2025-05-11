package aulas.regex;


public class Main {
    public static void main(String[] args) {
        //regex é uma expressao regular. Uma sequencia de caracteres, que tem simbolos e caracteres especiais que produzem padroes. 
        //servem pra verificar se outras cadeias seguem o mesmo padrao
        
        String str = "a"; // segue o padrao(true or false)
        String regex = "a"; // padrao
        System.out.println(str + " | " + regex + " | " + str.matches(regex));//matches ve se str segue o padrao de regex
       
        
        str = "aa";
        regex = "a";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));

        str = "aa";
        regex = "a\\+";//+ significa uma ou mais ocorrencias de um padrao anterior(mais de 1 "a"). \ é caracter special, pra imprimir use \\
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "abc";
        regex = "[a-z]*";//[] é intervalo. + vai de 1 a N. * vai de 0 a N.
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "abcW";
        regex = "[a-z]*";
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "abcW";
        regex = "[a-zA-Z]*";//testa de "a" a "z" e de "A" a "Z"
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "A324";
        regex = "A\\d+";// \d pega qlqr digito
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "55514-394";
        regex = "\\d{5}-\\d{3}";// {n} diz a quantidade de digitos
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "Tufy Elias";
        regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+";  // \s pega espacos
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "(16)98257-6874";
        regex = "(\\+\\d{1,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}"; // ? é 0 ou 1 vez.   \\ deixa tudo literal. 
        System.out.println(str + " | " + regex + " | " + str.matches(regex));
        
        str = "jnfsjjksd   sdsusud      aaaa";
        str = str.replaceAll("\\s{2,}S", " ");//o primeiro é o padrao procurado
        System.out.println(str);
        
        str = "jnfsj jksd   sdsusud      aaaa";
        String[] vetor = str.split("\\s+"); //a regex retorna cada uma das palavras
        for(String s : vetor){
            System.out.println(s);
        }
        
        
        
        
        
    }
}
