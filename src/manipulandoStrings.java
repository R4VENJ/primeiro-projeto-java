import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class manipulandoStrings {
    public static void main(String[] args) {
        String nome = "Joey Melo";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        String nomeOutro = "joey Melo";
        System.out.println(nome.equals(nomeOutro));
        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek());
        System.out.println(hoje.getDayOfMonth());
        System.out.println(hoje.getDayOfYear());
        Locale brasil = new Locale("pt", "br");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom Dia";
        } else if (agora.getHour() >=12 && agora.getHour() <=18) {
            saudacao = "Boa Tarde";
        } else if (agora.getHour() >=18 && agora.getHour() <24) {
            saudacao = "Boa Noite";
        } else {
            saudacao = "Olá! ";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana,saudacao.toUpperCase());
        }
    }

