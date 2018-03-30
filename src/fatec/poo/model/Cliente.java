
package fatec.poo.model;

/**
 *
 * @author Felipe, Thiago e Marcos
 */
public class Cliente extends Pessoa {
    private double limiteCred;
    private double limiteDisp;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }
    
    @Override
     public void addPedido(Pedido pedido){
        pedidos.add(pedido);
        pedido.setCliente(this);
    }
}