import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();


        while(true){
            System.out.println("\n------Menu-------");
            System.out.println("1 - Cadastrar CLT");
            System.out.println("2 - Cadastrar PJ");
            System.out.println("3 - Listar Funcionarios");
            System.out.println("0 - Encerrar programa");
            System.out.println("Escolha: ");
            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Cadastrar CLT");

                    System.out.println("Nome: ");
                    String nomeCLT = scan.nextLine();

                    System.out.println("Matricula: ");
                    int matriculaCLT = scan.nextInt();

                    System.out.println("Salario: ");
                    double salarioCLT = scan.nextDouble();
                    scan.nextLine();

                    FuncionarioCLT funcionarioCLT = new FuncionarioCLT(nomeCLT, matriculaCLT, salarioCLT);
                    lista.add(funcionarioCLT);

                    System.out.println("Funcionario Cadastrado");

                    break;

                case 2:
                    System.out.println("Cadastrar PJ");

                    System.out.println("Nome: ");
                    String nomePJ = scan.nextLine();

                    System.out.println("Matricula: ");
                    int matriculaPJ = scan.nextInt();

                    System.out.println("Salario: ");
                    double salarioPJ = scan.nextDouble();
                    scan.nextLine();

                    FuncionarioPJ funcionarioPJ = new FuncionarioPJ(nomePJ, matriculaPJ, salarioPJ);
                    lista.add(funcionarioPJ);

                    System.out.println("Funcionario Cadastrado");

                    break;

                case 3:
                    System.out.println("Lista de Funcionarios");

                    for (Funcionario f : lista){
                        f.exibirDados();
                        System.out.println("--------------------------------");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    return;

                default:
                    System.out.println("Opção invalida");

            }
        }
    }

}
