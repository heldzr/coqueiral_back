import java.util.ArrayList;

public class Cliente extends Usuario{
    private String idCliente;
    private ArrayList<String> pedidos = new ArrayList<String>();

    public Cliente(String nome, String cpf, String email, String senha) {
        super(nome, cpf, email, senha);
    }
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public ArrayList<String> getPedidos() {
        return pedidos;
    }
    public void setPedidos(ArrayList<String> pedidos) {
        this.pedidos = pedidos;
    }
}
