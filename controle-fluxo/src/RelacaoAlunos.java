public class RelacaoAlunos {
    public static void main(String[] args) {
        String alunos[] = {"felipe", "jonas", "julia", "marcos"};
        int i;

        for(i=0; i<alunos.length; i++){
            System.out.println("O aluno no índice " + i + " é " + alunos[i]);
        }

        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
