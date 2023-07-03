package com.trybe.simuladordepix;

/**
 * Class invalid blank key error.
 **/
public class ErroChaveEmBranco extends ErroDePix {
  private static final long serialVersionUID = 1L;
  private static String message = Mensagens.CHAVE_EM_BRANCO;

  public ErroChaveEmBranco() {
    super(message);
  }
}
