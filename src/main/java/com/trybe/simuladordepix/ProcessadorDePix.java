package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Class responsible for pix operation.
 **/
public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;
  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio
   * sem envolver as interações do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação
   *                     entre o aplicativo e o servidor na nuvem.
   */
  public void executarPix(int valor, String chave) throws ErroDePix, IOException {
    int chaveLength = chave.length();
    String chaveClean = chave.replaceAll("\\s", "");
    if (valor < 1) {
      throw new ErroValorNaoPositivo();
    }
    
    if (chaveLength == 0 || chaveClean.length() == 0) {
      throw new ErroChaveEmBranco();
    }

    Conexao connection = this.servidor.abrirConexao();

    try {
      String response = connection.enviarPix(valor, chave);
      
      switch (response) {
        case CodigosDeRetorno.SUCESSO:
          break;
        case CodigosDeRetorno.SALDO_INSUFICIENTE:
          throw new ErroSaldoInsuficiente();
        case CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA:
          throw new ErroChaveNaoEncontrada();
        default:
          throw new ErroInterno();
      }
    } finally {
      connection.close();
    }
  }
}
