public class FuncionarioCLT extends Funcionario{

    @Override
    public double calcularSalario() {
        return getSalarioBase()*1.2;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Salario final(CLT) %.2f",calcularSalario());
    }
    public FuncionarioCLT() {
    }
    public FuncionarioCLT(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

}
