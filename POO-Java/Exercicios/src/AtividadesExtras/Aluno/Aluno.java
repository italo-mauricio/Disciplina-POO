package AtividadesExtras.Aluno;


public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplina;
    private double[][] notasDisciplinas;
    private int idade;
    private String periodo;

    public Aluno(){
        disciplina = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Aluno(String nome, int matricula, String curso, String[] disciplina,
                 double[][] notasDisciplinas, int idade, String periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.idade = idade;
        this.periodo = periodo;
        this.disciplina = new String[3];
        this.notasDisciplinas = new double[3][4];
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String[] disciplina) {
        this.disciplina = disciplina;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void mostrarInfo(){

        System.out.println("Universidade Federal do Rio Grande do Norte");
        System.out.println();
        System.out.println("================ Boletim UFRN ================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
        System.out.println();
        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da disciplina: " + disciplina[i]);
            for(int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice){

        double soma = 0;

        for(int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        if(media >= 5){
            return true;
        }
        return false;
    }

    public boolean verificarRecuperacao(int indice){

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        if(media >= 3){
            return true;
        }
        return false;
    }
}