package com.mjv.openbanking;

import java.math.BigDecimal;
import java.time.LocalDate;

//Lombok cria automaticamente getters e setters
public class Movimentacao {	//Classe
	private LocalDate data;
	private BigDecimal valor;
	private String cpfCnpj;
	private String nomeCliente;
	private Boolean estornada;
	private TipoMovimentacao tipo;
	
	//Java beans - getters and setters
	//Get - retorna o valor do atributo do objeto
	//Set - define o valor do atributo do objeto
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Boolean getEstornada() {
		return estornada;
	}
	public void setEstornada(Boolean estornada) {
		this.estornada = estornada;
	}
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
	
}
