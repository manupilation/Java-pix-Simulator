package com.trybe.simuladordepix;

/**
 * Class miss key error.
 **/
public class ErroChaveNaoEncontrada extends ErroDePix {
  private static final long serialVersionUID = 1L;
  private static String message = Mensagens.CHAVE_NAO_ENCONTRADA;

  public ErroChaveNaoEncontrada() {
    super(message);
  }
}
