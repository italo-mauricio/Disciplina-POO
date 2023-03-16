package AtividadesExtras.Aluno;

import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(scan.nextLine());
        System.out.print("Digite o número da matricula: ");
        aluno.setMatricula(scan.nextInt());
        scan.nextLine();
        System.out.print("Digite a idade do aluno: ");
        aluno.setIdade(scan.nextInt());
        scan.nextLine();
        System.out.print("Digite o curso do aluno: ");
        aluno.setCurso(scan.nextLine());
        System.out.print("Digite em qual período você esta: ");
        aluno.setPeriodo(scan.nextLine());



        for(int i = 0; i < aluno.getDisciplina().length; i++){
            System.out.println("Digite o nome da disciplina: " + i);
            aluno.setNomeDisciplinaPos(i, scan.nextLine());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++){
            System.out.println("Obtendo notas da disciplina " + aluno.getDisciplina()[i]);
            for(int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Digite a nota " + (j+1));
                aluno.setNotaPosIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();
        System.out.println(" -------------------------------------------- ");
        System.out.println(" -                Resultado                 - ");

        for (int i=0; i<aluno.getDisciplina().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina: " + aluno.getDisciplina()[i]);
                System.out.println("Aprovado!");
            }else if (aluno.verificarRecuperacao(i)){
                System.out.println("Disciplina: " + aluno.getDisciplina()[i]);
                System.out.println("Recuperação");
            }else{
                System.out.println("Disciplina: " + aluno.getDisciplina()[i]);
                System.out.println("Reprovado");
            }
        }
    }
}
