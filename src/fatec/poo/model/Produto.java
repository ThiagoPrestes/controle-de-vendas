
package fatec.poo.model;

/**
 *
 * @authors Felipe e Thiago e Marcos
 */
public class Produto {
    private final int codigo;
    private final String descricao;
    private int qtdeDisponivel;
    private double precoUnit;
    private int estoqueMin;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto(int codigo, String descricao, int qtdeDisponivel, double precoUnit, int estoqueMin) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdeDisponivel = qtdeDisponivel;
        this.precoUnit = precoUnit;
        this.estoqueMin = estoqueMin;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }
    
    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }
    
    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
