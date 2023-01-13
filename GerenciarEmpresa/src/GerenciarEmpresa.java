import java.util.Scanner;

public class GerenciarEmpresa {
    public Empresa ee;
    public GerenciarEmpresa(){
        ee = new Empresa();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        GerenciarEmpresa ge = new GerenciarEmpresa();
        do {
            System.out.println("Digite 1 para Cadastrar Empresa");
            System.out.println("Digite 2 para Adicionar Funcionario");
            System.out.println("Digite 3 para Remover Funcionario");
            System.out.println("Digite 4 para Consultar");
            System.out.println("Digite 5 para sair");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    ge.execCadastrar();
                    break;
                case 2:
                    ge.execAddfunc();
                    break;
                case 3:
                    ge.execRemovfunc();
                    break;
                case 4:
                    ge.execConsultar();
                    break;
                case 5:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }while(opc!=5);

    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da empresa: ");
        ee.setNome(sc.nextLine());
        System.out.println("Digite o CNPJ da empresa: ");
        ee.setCnpj(sc.nextLine());
        System.out.println("Digite o numero de funcionarios: ");
        ee.setNumfuncionarios(Integer.parseInt(sc.nextLine()));
        System.out.println("Cliente cadastrado com sucesso");

    }

    public void execRemovfunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de funcionarios");
        if(ee.removfunc(Integer.parseInt(sc.nextLine())) == 1){
            System.out.println("Funcionarios removidos com sucesso");
        }else {
            System.out.println("Numero de funcionarios insuficiente");
        }
    }

    public void execAddfunc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de funcionarios");
        ee.addfunc(Integer.parseInt(sc.nextLine()));

    }

    public void execConsultar(){
        ee.imprimir();

    }


}