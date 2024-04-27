public class Vendedor extends Usuario {
    /*Estou criando a classe modelo do vendedor */
    private int numerovendas;
    private float faturamento;

    //método construtor
    public Vendedor(String nome, String cpf, String email, String senha){
        super(nome, cpf, email, senha);
        this.numerovendas = 0; //todo vendedor assimm que criar a conta tem 0 vendas
        this.faturamento=0; //todo vendedor assimm que criar a conta tem 0 reais de faturamentos
        //ou seja assim que eu criar uma conta já devo informar esses dados do vendedor
    }
    public int getNumerovendas() {
        return numerovendas;
    }

    public void setNumerovendas(int numerovendas) {
        this.numerovendas = numerovendas;
    }
    public float getFaturamento() {
        return faturamento;
    }
    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }

}
