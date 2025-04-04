import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Funcionario[] funcionarios = new Funcionario[2];
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ();

        funcionarios[0]= funcionarioCLT;
        funcionarios[1]= funcionarioPJ;

        System.out.println("NomeCLT: ");
        funcionarioCLT.setNome(scan.nextLine());
        System.out.println("MatriculaCLT: ");
        funcionarioCLT.setMatricula(scan.nextInt());
        System.out.println("SalarioCLT: ");
        funcionarioCLT.setSalarioBase(scan.nextDouble());


        System.out.println("-----------------------------------------------");


        System.out.println("NomePJ: ");
        scan.nextLine();
        funcionarioPJ.setNome(scan.nextLine());
        System.out.println("MatriculaPJ: ");
        funcionarioPJ.setMatricula(scan.nextInt());
        System.out.println("SalarioPJ: ");
        funcionarioPJ.setSalarioBase(scan.nextDouble());

        System.out.println("--------LISTA DE FUNCIONARIOS ------------");
        for (Funcionario f : funcionarios){
            f.exibirDados();
            System.out.println("\n---------------------------------------");
        }
    }
}