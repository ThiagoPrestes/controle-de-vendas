
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Felipe, Thiago e Marcos
 */
public abstract class Pessoa {
    private final String cpf;
    private final String nome;
    private String endereco;
    private String cidade;
    private String cep;
    private String uf;
    private String ddd;
    private String telefone;
    protected ArrayList<Pedido> pedidos;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        pedidos = new ArrayList<Pedido>();
    }

    public Pessoa(String cpf, String nome, String endereco, String cidade, String cep, String uf, String ddd, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.ddd = ddd;
        this.telefone = telefone;
        pedidos = new ArrayList<Pedido>();
    }
    
    

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String Endereco) {
        this.endereco = Endereco;
    }

    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String Cidade) {
        this.cidade = Cidade;
    }

    public String getCep() {
        return cep;
    }
    
    public void setCep(String Cep) {
        this.cep = Cep;
    }

    public String getUf() {
        return uf;
    }
    
    public void setUf(String Uf) {
        this.uf = Uf;
    }

    public String getDdd() {
        return ddd;
    }
    
    public void setDdd(String Ddd) {
        this.ddd = Ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String Telefone) {
        this.telefone = Telefone;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
    
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
}