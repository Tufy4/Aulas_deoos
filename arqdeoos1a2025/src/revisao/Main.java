
package revisao;

public class Main {
    public static void main(String[] args) {
        LivroFisico deitel = new LivroFisico("L1", "JAVA COMO PROGRAMAR", "Deitel", 8, 2010);
        
        Revista tvcg = new Revista("R1", "IEEE TVCG", "IEEE VIS", 1, 2020);
        
        Chave ch1 = new Chave("A1234");
        
        Emprestavel[] biblioteca = new Emprestavel[3];
        biblioteca[0] = deitel;
        biblioteca[1] = tvcg;
        biblioteca[2] = ch1;
        
        deitel.getAutores();
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        biblioteca[0].emprestar();
        
        for(int i = 0;i<biblioteca.length;i++){
            if(biblioteca[i].podeEmprestar()){
                System.out.println(biblioteca[i].getNomeObjeto());
            }
        }
        
    }
}
