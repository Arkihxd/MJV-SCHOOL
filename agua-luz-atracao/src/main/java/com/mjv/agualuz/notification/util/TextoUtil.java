package com.mjv.agualuz.notification.util;


public class TextoUtil {
	public static String removerCaracteresEspeciais(String texo) {
		return texo.replaceAll("\\D", "");
	}
	
	public static String completar(String textoOriginal, int tamanhoMaximo) {
		String formato = "%-" + tamanhoMaximo + "s";
		String textoFormatado = String.format(formato, textoOriginal);
		return textoFormatado;
	}
	
	public static String completarZeros(Number numero, int tamanhoMaximo) {
		String formato = "%0" + tamanhoMaximo + "d";
		String textoFormatado = String.format(formato, numero);
		return textoFormatado;
	}
	
	public static String cortar(String textoOriginal, int tamanhoMaximo) {
		String novoTexto = textoOriginal.substring(0, tamanhoMaximo);
		return novoTexto;
	}
	
	public static String ajustar(String textoOriginal, int tamanhoMaximo) {
		String textoAjustado = completar(textoOriginal, tamanhoMaximo);
		textoAjustado = cortar(textoAjustado, tamanhoMaximo);
		return textoAjustado;
	}

}
