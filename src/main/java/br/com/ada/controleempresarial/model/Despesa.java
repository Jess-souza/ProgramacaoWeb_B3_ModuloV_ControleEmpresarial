package br.com.ada.controleempresarial.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Despesa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fornecedor;
    private String categoria;
    @Column(unique = true)
    private String numeroNf;
    private Double valorNf;
    private LocalDate dataVencimento;
    private boolean pago;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(String numeroNf) {
        this.numeroNf = numeroNf;
    }

    public Double getValorNf() {
        return valorNf;
    }

    public void setValorNf(Double valorNf) {
        this.valorNf = valorNf;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
