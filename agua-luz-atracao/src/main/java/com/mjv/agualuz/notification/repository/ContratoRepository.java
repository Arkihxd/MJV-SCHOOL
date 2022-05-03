package com.mjv.agualuz.notification.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.model.Pais;
import com.mjv.agualuz.notification.model.Servico;
import com.mjv.agualuz.notification.model.TipoNotificacao;

public class ContratoRepository {
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	public Contrato pegarUnicoContrato() {
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
		contrato.setNumeroProtocolo(2022025687L);
		
		contrato.setServico(Servico.AGUA);
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		
		cliente.setCpf("23476598727");
		cliente.setNome("Gleyson Sampaio");
		cliente.setRg("87897");
		cliente.setPais(Pais.BRASIL);
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Bloco C");
		return contrato;
	}
	
	public List<Contrato> listar() {
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 5, 7, 16, 0));
		contrato.setNumeroProtocolo(2022025687L);
		
		contrato.setServico(Servico.AGUA);
		contrato.setTipoNotificacao(TipoNotificacao.SMS);
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		
		
		cliente.setCpf("003.848.650-65");
		cliente.setNome("Gleyson Sampaio Zappersom Zaplaskjdqw");
		cliente.setRg("87897");
		cliente.setPais(Pais.BRASIL);
		cliente.setCelular("(41) 987878-5454");
		
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Bloco C");

		contratos.add(contrato);
		return contratos;
	}
}
