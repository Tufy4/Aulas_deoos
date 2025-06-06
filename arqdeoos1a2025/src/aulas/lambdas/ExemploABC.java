package aulas.lambdas;


public class ExemploABC {
    public static void main(String[] args) {
        
        //pode ter mais instruções, separadas por ;
        //QUANDO SE TEM UMA INSTRUÇÃO SÓ, PODE SE OMITIR O {}, SE ABRIR E FECHAR HÁ DE TER O RETURN
        InterfaceFuncionalA objA = 
                (int x, int y) -> {
                    System.out.println("x + y = ");
                    return x+y;
                };
        
        System.out.println(objA.metodoA(2, 5));
        
        objA = (x, y) -> x * y;
        
        System.out.println(objA.metodoA(2, 5));
          
        System.out.println("-----------");
        
        InterfaceFuncionalB objB = (x) -> {
                System.out.println("x = " + x);
            };
        
        objB.metodoB(5);
        
        
        InterfaceFuncionalC objC = () ->
                System.out.println("Welcome to lambdas");
        
        
        objC.metodoC();
        
                
        System.out.println("-----------");
        
        C obj = new C();
        obj.metodo(objC);
        
        //para a definição de uma lambda dentro de chamada de metodo nao é preciso do ; final
        obj.metodo( () -> System.out.println("Bem vindo ao Lambdas!!"));//Expressao lambda para a criacao de metodo anonimo
        
        obj.metodo(new InterfaceFuncionalC() {
            public void metodoC(){
                System.out.println("Essa chamada vem de uma classe anonima!!");
            }
        
        });//criacao de uma classe anonima que implementa a interface 'InterfaceFuncionalC'
        
        
    }
        

}
        
    

