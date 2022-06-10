package CANTINA;

import java.util.Date;

public class Pedido {
    private Integer CodPedido;
    private String TipoDoPedido;
    private Double Preco;
    private Date DataDoPedido;

    public Integer getCodPedido() {
        return CodPedido;
    }

    public void setCodPedido(Integer codPedido) {
        CodPedido = codPedido;
    }

    public String getTipoDoPedido() {
        return TipoDoPedido;
    }

    public void setTipoDoPedido(String tipoDoPedido) {
        TipoDoPedido = tipoDoPedido;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }
}
