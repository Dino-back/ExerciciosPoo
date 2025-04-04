public abstract class Funcionario implements IFuncionario {

    protected String nome;
    protected int matricula;
    protected double salarioBase;


    @Override
    public void exibirDados() {
        System.out.println("Nome: "+getNome());
        System.out.println("Matricula; "+getMatricula());
    }

    public Funcionario() {
    }
    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
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
