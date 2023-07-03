package com.trybe.simuladordepix;

/**
 * Class internal error.
 **/
public class ErroInterno extends ErroDePix {
  private static final long serialVersionUID = 1L;
  private static String message = Mensagens.ERRO_INTERNO;

  public ErroInterno() {
    super(message);
  }
}
