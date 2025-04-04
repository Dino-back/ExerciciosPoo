public class FuncionarioPJ extends Funcionario{

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Salario final(PJ) %.2f",calcularSalario());
    }
}
