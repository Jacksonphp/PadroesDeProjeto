package br.ifpi.especializacao.gof.padroes;

public class CriadorTipoEnvioAsync implements CriadorTipoEnvio {

	@Override
	public CriadorDeEmissor defineTipoEnvio() {
		CriadorDeEmissorAssync criadorDeEmissor = new CriadorDeEmissorAssync();
		return criadorDeEmissor;
	}

	

}
