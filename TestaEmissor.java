package br.ifpi.especializacao.gof.padroes.Tes;

public class TestaEmissor {
	
	   private static CriadorDeEmissor criadorDeEmissor;
	   private static Emissor emissor;
	   private static CriadorTipoEnvioAsync envioAssync = new CriadorTipoEnvioAsync();
	   private static CriadorTipoEnvioSync envioSync = new CriadorTipoEnvioSync();
	   
	
 public static void main(String[] args) {
	
	   criadorDeEmissor = envioAssync.defineTipoEnvio();
	   emissor = criadorDeEmissor.criar(0);
	   emissor.enviar("Compra realizada com cartão!");
	   
	   criadorDeEmissor = envioAssync.defineTipoEnvio();
	   emissor = criadorDeEmissor.criar(1);
	   emissor.enviar("Compra realizada com cartão!");
	   
	   criadorDeEmissor = envioSync.defineTipoEnvio();
	   emissor = criadorDeEmissor.criar(2);
	   emissor.enviar("Compra realizada com cartão!");
	 
 }
}
