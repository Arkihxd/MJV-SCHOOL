package com.mjv.agualuz.notification.model;

import java.time.LocalDateTime;

public class Contrato {
	private Cadastro cliente;
	private String servico;
	private Double valor;
	private LocalDateTime dataHora;
	private Long numeroProtocolo;
	
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	
}
