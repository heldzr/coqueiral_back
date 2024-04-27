public class Promocao {

    private int idPromocao;
    private String descricao;
    private String cod_Desconto;
    private String data_Validade;

    public Promocao(int idPromocao, String descricao, String cod_Desconto, String data_Validade) {
        this.idPromocao = idPromocao;
        this.descricao = descricao;
        this.cod_Desconto = cod_Desconto;
        this.data_Validade = data_Validade;
    }

   
    public int getIdPromocao() {
        return idPromocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCod_Desconto() {
        return cod_Desconto;
    }

    public String getData_Validade() {
        return data_Validade;
    }


    public void setIdPromocao(int idPromocao) {
        this.idPromocao = idPromocao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCod_Desconto(String cod_Desconto) {
        this.cod_Desconto = cod_Desconto;
    }

    public void setData_Validade(String data_Validade) {
        this.data_Validade = data_Validade;
    }
}
