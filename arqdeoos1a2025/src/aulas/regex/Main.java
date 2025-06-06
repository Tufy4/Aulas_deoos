package aulas.regex;

public class Main {
    public static void main(String[] args) {
        
       String str="a";//segue o padrao (true ou false)
       String regex="a";//padrao
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
        
        str="aa";
        regex="a";
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        str="aa";
        regex="a+"; // o "+" simboliza que o padrão regex no caso que é o "a" pode repetir
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
        
        str="aaaa+";
        regex="a\\+"; // o "+" simboliza que o padrão regex no caso que é o "a" pode repetir e ter 1 ou mais ocorrencia
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
        
        str="abc";
        regex="[a-z]*"; // O "*" representa que pode ter 0 ou mais ocorrencias
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
        
         str="abcWs";
        regex="A\\d"; 
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
         str="A25756465";
        regex="A\\d"; 
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
         str="55514-444";
        regex="\\d{5}-\\d{3}"; // \d para qualquer digito
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
        str="Miguel Batista";
        regex="[A-Z][a-z]+\\s[A-Z][a-z]+"; // \d para qualquer digito
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
        
        
        str="+55(16)99725-5329";  
        regex="(\\+\\d{1,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}";  
       
        System.out.println(str+" | "+regex + " | "+str.matches(regex));
       
       
        str="dsadsda          dsadasdsadad           assas";
        str = str.replaceAll("\\s{2,}", " ");
        System.out.println(str);
        
        str="dsadsadasd sadsadasda             ad asdsad ds       asds";
        String[] vetor = str.split("\\s{1,}");
        
        for(String s:vetor){
            System.out.println(s);
        }
        
    }
}
