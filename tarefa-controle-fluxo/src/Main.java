import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá!! Insira o nome do(a) aluno(a) por favor: ");
        String nomeAluno = sc.next();

        System.out.println("Agora insira as notas do(a) Aluno(a) " + nomeAluno);

        Integer nota1 = sc.nextInt();
        Integer nota2 = sc.nextInt();
        Integer nota3 = sc.nextInt();
        Integer nota4 = sc.nextInt();

        Integer somaNotas = nota1 + nota2 + nota3 + nota4;
        Integer media = somaNotas / 4;

        if (media >= 7) {
            System.out.println("A média do Aluno(a) " + nomeAluno + " é de " + media + " pontos!!! Ele(a) está aprovado(a)!!!");
        } else if (media >= 5) {
            System.out.println("A média do Aluno(a) " + nomeAluno + " é de " + media + " pontos!!! Ele(a) está em recuperação!!!");
        } else {
            System.out.println("A média do Aluno(a) " + nomeAluno + " é de " + media + " pontos!!! Ele(a) está reprovado(a)!!!");
        }
        sc.close();
    }
}