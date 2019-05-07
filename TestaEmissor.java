package br.ifpi.especializacao.gof.padroes;

public class TestaEmissor {
	
	   private static CriadorDeEmissor criadorDeEmissor;
	   private static Emissor emissor;
	   private static CriadorTipoEnvioAsync envioAssync = new CriadorTipoEnvioAsync();
	   private static CriadorTipoEnvioSync envioSync = new CriadorTipoEnvioSync();
	   
	
 public static void main(String[] args) {
	
	   criadorDeEmissor = envioAssync.defineTipoEnvio();
	   emissor = criadorDeEmissor.criar(CriadorDeEmissor.EMAIL);
	   emissor.enviar("Compra realizada com cartão!");
	   
	   criadorDeEmissor = envioAssync.defineTipoEnvio();
	   emissor = criadorDeEmissor.criar(CriadorDeEmissor.JMS);
	   emissor.enviar("Compra realizada com cartão!");
	   
	   criadorDeEmissor = envioSync.defineTipoEnvio();
	   emissor = criadorDeEmissor.criar(CriadorDeEmissor.SMS);
	   emissor.enviar("Compra realizada com cartão!");
	 
 }
}
