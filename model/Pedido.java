public class Pedido {

    private String id;
    private float valor;
    private String pagamento;
    private String endereco;
    private int quantidade;
    private String status;
    
    
    public Pedido(String id, float valor, String pagamento, String endereco, int quantidade, String status) {
        this.id = id;
        this.valor = valor;
        this.pagamento = pagamento;
        this.endereco = endereco;
        this.quantidade = quantidade;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getPagamento() {
        return pagamento;
    }
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}