package Desafio06.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pedido implements Faturavel{

    private Long id;
    private LocalDate dataPedido;
    private Pedido pedido;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<PedidoItens> pedidosItens;

    public Pedido(Long id, LocalDate dataPedido, Pedido pedido, Cliente cliente, Vendedor vendedor, List<PedidoItens> pedidosItens) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.pedido = pedido;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.pedidosItens = pedidosItens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<PedidoItens> getPedidosItens() {
        return pedidosItens;
    }

    public void setPedidosItens(List<PedidoItens> pedidosItens) {
        this.pedidosItens = pedidosItens;
    }

    @Override
    public LocalDate getDataFatura() {
        return getDataPedido();
    }

    @Override
    public BigDecimal getValorTotalFaturamento() {
        BigDecimal total = BigDecimal.ZERO;
        pedidosItens.forEach(item -> item.getValorTotal());
        return total;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public Vendedor getVendedor() {
        return vendedor;
    }
}
