package com.talissonmelo.entidades.exception;

public class RegraDeNegocioException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RegraDeNegocioException(String mensagem) {
		super(mensagem);
	}
}
