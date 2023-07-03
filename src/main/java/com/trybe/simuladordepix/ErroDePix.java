package com.trybe.simuladordepix;

/**
 * Abstract Class to send errors related by Pix.
 * */
public abstract class ErroDePix extends Exception {
  private static final long serialVersionUID = 1L;

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
