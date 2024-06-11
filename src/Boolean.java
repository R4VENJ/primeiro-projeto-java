public class Boolean {
        public static void main(String[] args) {
            System.out.println("Hello World!");
            boolean resultado = false;
            System.out.println(resultado);
            boolean fimDeSemana = true;
            boolean fazendoSol = true;
            boolean vamosAPraia = fimDeSemana && fazendoSol;
            System.out.println(vamosAPraia);
            //Tabela Verdade
            // Operador AND = &&
            // Operador OR = ||

            System.out.println("Operador Ternário");
            String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
            System.out.println(mensagem);


    }
}
