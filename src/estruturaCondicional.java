public class estruturaCondicional {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int nota = 180;
        String graduacao;
        if (nota >= 70 && nota <=100) {
            graduacao = ("A");
        } else if (nota >=60 && nota <70){
            graduacao = ("B");
        } else if (nota >=50 && nota <60) {
            graduacao = ("C");
        } else if (nota <50) {
            graduacao = ("D");
        } else {
            graduacao = "";
        }
        switch(graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
                System.out.println("Aluno de Recuperação");
                break;
            case "D":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Nota inválida");
        }
    }
}
