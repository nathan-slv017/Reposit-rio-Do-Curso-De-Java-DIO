public class ExemploForArray {
    public static void main(String[] args) {

        String alunos[] = { "Nathan", "Paulo", "José" };

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("O indice do aluno é " + i + " e o nome do aluno é " + alunos[i]);

        }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

    }
}
