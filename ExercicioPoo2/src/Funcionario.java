public abstract class Funcionario implements IFuncionario {

    private String nome;

    private int matricula;

    private double salarioBase;


    @Override
    public void exibirDados() {
        System.out.println("Nome: "+ getNome());
        System.out.println("Matricula: "+ getMatricula());
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
