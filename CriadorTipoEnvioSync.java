package br.ifpi.especializacao.gof.padroes;

public class CriadorTipoEnvioSync implements CriadorTipoEnvio  {

	@Override
	public CriadorDeEmissor defineTipoEnvio() {
		CriadorDeEmissorSync criadorDeEmissor = new CriadorDeEmissorSync();
		return criadorDeEmissor;
	}

}
