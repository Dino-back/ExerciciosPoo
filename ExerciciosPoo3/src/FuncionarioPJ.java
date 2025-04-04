public class FuncionarioPJ extends Funcionario{

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Salario final(PJ)", calcularSalario());
    }

    public FuncionarioPJ() {
    }

    public FuncionarioPJ(String nome, int matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }
}
