package AtividadesExtras.Aluno;


import java.util.Scanner;

import static AtividadesExtras.Aluno.Aluno.calcularMedia;

public class AppAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int x = 0;   // apenas variáveis de controle para o for
        int y = 0;
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


        for (String disciplina : aluno.getDisciplina()) {
            System.out.println("Digite o nome da disciplina: " + x);
            aluno.setNomeDisciplinaPos(x, scan.nextLine());
            x++;
        }

        for (String disciplina : aluno.getDisciplina()) {
            System.out.println("Obtendo notas da disciplina " + disciplina);
            for (int j = 0; j < aluno.getNotasDisciplinas()[y].length; j++) {
                System.out.println("Digite a nota " + (j+1));
                aluno.setNotaPosIJ(y, j, scan.nextDouble());
            }
            y++;
        }


        aluno.mostrarInfo();
        System.out.println(" -------------------------------------------- ");
        System.out.println(" -                Resultado                 - ");

        for (int i=0; i<aluno.getDisciplina().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina: " + aluno.getDisciplina()[i]);
                System.out.println("Aprovado!");
                System.out.println("Media: " + calcularMedia(aluno.getNotasDisciplinas()[i]));

            }else if (aluno.verificarRecuperacao(i)){
                System.out.println("Disciplina: " + aluno.getDisciplina()[i]);
                System.out.println("Recuperação");
                System.out.println("Média: " + calcularMedia(aluno.getNotasDisciplinas()[i]));
            }else{
                System.out.println("Disciplina: " + aluno.getDisciplina()[i]);
                System.out.println("Reprovado");
                System.out.println("Média: " + calcularMedia(aluno.getNotasDisciplinas()[i]));
            }
        }
    }
}
