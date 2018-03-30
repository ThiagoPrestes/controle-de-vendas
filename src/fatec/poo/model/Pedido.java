
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Felipe e Thiago e Marcos
 */
public class Pedido {
    private final int numero;
    private final String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itensPedidos;
    
    public Pedido(int numero, String dataEmissaoPedido) {
        this.numero = numero;
        this.dataEmissaoPedido = dataEmissaoPedido;
        itensPedidos = new ArrayList<ItemPedido>();
    }

    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDataPagto() {
        return dataPagto;
    }
    
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }

    public ArrayList<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }
    
    public void addItemPedido(ItemPedido itemPedido){
        itensPedidos.add(itemPedido);
        itemPedido.setPedido(this);
        cliente.setLimiteDisp(cliente.getLimiteDisp() - (itemPedido.getQtdeVendida() * itemPedido.getProduto().getPrecoUnit()));
    }
}