package com.trybe.simuladordepix;

/**
 * Class to throw no positive value pix.
 **/
public class ErroValorNaoPositivo extends ErroDePix {
  private static final long serialVersionUID = 1L;
  private static String message = Mensagens.SALDO_INSUFICIENTE;


  public ErroValorNaoPositivo() {
    super(message);
  }
}
