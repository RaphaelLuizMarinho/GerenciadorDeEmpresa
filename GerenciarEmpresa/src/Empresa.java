public class Empresa {
    private String nome;
    private String cnpj;
    private int numfuncionarios;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public int getNumfuncionarios() {
        return numfuncionarios;
    }
    public void setNumfuncionarios(int numfuncionarios) {
        this.numfuncionarios = numfuncionarios;
    }

    public void addfunc(int num){
        if(num > 0) {
            numfuncionarios+= num;
            System.out.println("Funcionarios adicionado com sucesso");
        }

    }
    public int removfunc(int num) {
        if(num > 0) {
            numfuncionarios-= num;
            System.out.println("Funcionarios removidos com sucesso");
            return 1;
        }else {
            return 0;
        }
    }

    public void imprimir(){
        System.out.println(" O nome da empresa é: " + nome);
        System.out.println("O CNPJ da empresa é: " + cnpj);
        System.out.println("O numero de funcionarios da empresa é: " + numfuncionarios);
    }

}
