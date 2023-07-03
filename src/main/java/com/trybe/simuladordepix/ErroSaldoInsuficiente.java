package com.trybe.simuladordepix;

/**
 * Class invalid empty key error.
 **/
public class ErroSaldoInsuficiente extends ErroDePix {
  private static final long serialVersionUID = 1L;
  private static String message = Mensagens.SALDO_INSUFICIENTE;

  public ErroSaldoInsuficiente() {
    super(message);
  }
}
