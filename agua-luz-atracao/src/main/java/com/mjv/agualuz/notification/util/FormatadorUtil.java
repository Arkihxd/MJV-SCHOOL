package com.mjv.agualuz.notification.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;

public class FormatadorUtil {
	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0, 3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);
		
		String cpfFormatado = String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		
		return cpfFormatado;
	}
	
	public static String formatadorData(LocalDateTime data) {
		String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString();
		return dataFormatada;
	}
	
	public static String formatadorHora(LocalDateTime hora) {
		String horaFormatada = hora.format(DateTimeFormatter.ofPattern("HH:mm")).toString();
		return horaFormatada;
	}
	
	public static Contrato formatadorTxt(Contrato c) {
		
		Cadastro cad = c.getCliente();
		/*
		cad.setCpf((String.format("%011d", Long.valueOf(cad.getCpf().replaceAll("[\\D]", "")))));
		
		String nome = cad.getNome();
		if(nome.length() >= 30)
			cad.setNome((nome.substring(0, 30)));
		else 
			cad.setNome((String.format("%-30s", nome)));
		
		cad.setCelular((String.format("%011d", Long.valueOf(cad.getCelular().replaceAll("[\\D]", "")))));
		
		Endereco end = cad.getEndereco();
		
		String logradouro = end.getLogradouro().toUpperCase();
		if(logradouro.length() >= 20)
			end.setLogradouro((logradouro.substring(0, 20)));
		else 
			end.setLogradouro((String.format("%-20s", logradouro)));
		
		
		//end.setNumero((String.format("%-03s", end.getNumero())));
		
		String complemento = end.getComplemento().toUpperCase();
		if(complemento.length() >= 10)
			end.setComplemento((complemento.substring(0, 10)));
		else 
			end.setComplemento((String.format("%-10s", complemento)));
		
		String bairro = end.getBairro().toUpperCase();
		if(bairro.length() >= 15)
			end.setBairro((bairro.substring(0, 15)));
		else 
			end.setBairro((String.format("%-15s", bairro)));
		
		String cidade = end.getCidade().toUpperCase();
		if(cidade.length() >= 30)
			end.setCidade((cidade.substring(0, 30)));
		else 
			end.setCidade((String.format("%-30s", cidade)));
		
		//end.setEstado(end.getEstado().toUpperCase());
		
		
		end.setCep((String.format("%08d", Long.valueOf(end.getCep().replaceAll("[\\D]", "")))));
		
		cad.getPais().setSigla((cad.getPais().getSigla()));
		

		c.setNumeroProtocolo(Long.parseLong((String.format("%-03s", c.getNumeroProtocolo()))));
		
		
		String formatData = c.getDataHora().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		c.setDataHora(LocalDateTime.parse(formatData.replace("-", "")));
		
		String formatHora = c.getDataHora().format(DateTimeFormatter.ofPattern("HH:mm"));
		c.setDataHora(LocalDateTime.parse(formatData.replace("-", "")));
		
		
		c.getServico().setSigla((c.getServico().getSigla()));
		
		c.setValor(Double.parseDouble((String.format("%-03s", c.getValor()))));
		
		
		*/
		
		return c;
	}
	
	
	

}
