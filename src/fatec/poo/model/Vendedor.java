
package fatec.poo.model;

/**
 *
 * @author Felipe, Thiago e Marcos
 */
public class Vendedor extends Pessoa {
    private double salarioBase;
    private double comissao;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    public Vendedor(String cpf, String nome, String endereco, String cidade, String cep, String uf, String ddd, String telefone, double salarioBase, double comissao) {
        super(cpf, nome, endereco, cidade, cep, uf, ddd, telefone);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }
    
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
     public void addPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.setVendedor(this);
    }
}
