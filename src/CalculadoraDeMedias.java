import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaTurma(alunos, scanner);

        System.out.print("Média da turma: " + media);
    }

    public static double calculaMediaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;

        for(String aluno : alunos) {
            System.out.print("Nota do aluno " + aluno + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
