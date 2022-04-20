package com.mjv.openbanking;

import java.time.LocalDate;

public class GeradorArquivo {
	public static void main(String[] args) {
		Movimentacao mov = new Movimentacao();
		mov.setData(LocalDate.now());
		
		System.out.println(mov.getData());
	}
}
