public class Functions {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String nome = "Joey";
        saudacao(nome);
        int resultado = soma(2,10);
        System.out.println(resultado);
    }

    public static void saudacao(String variavel){
        System.out.println("Hello "+variavel+"!");
        System.out.printf("Hello %s!%n",variavel);
    }

    public static int soma(int pri, int seg) {
        return pri + seg;
    }
}
