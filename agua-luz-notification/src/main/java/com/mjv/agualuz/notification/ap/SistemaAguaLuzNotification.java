package com.mjv.agualuz.notification.ap;

import java.time.LocalDateTime;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;
import com.mjv.agualuz.notification.service.GeradorMensagem;


public class SistemaAguaLuzNotification {
	public static void main(String[] args) {
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 0));
		contrato.setNumeroProtocolo(2022025687L);
		contrato.setServico("Água");
		contrato.setValor(127.33);
		
		Cadastro cliente = new Cadastro();
		cliente.setCpf("23476598727");
		cliente.setNome("Gleyson Sampaio");
		contrato.setCliente(cliente);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua das Marias, 243");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo / SP");
		endereco.setCep("27.310-657");
		cliente.setEndereco(endereco);
		
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerar(contrato);
	}
}
