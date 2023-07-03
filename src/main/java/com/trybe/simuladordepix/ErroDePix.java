package com.trybe.simuladordepix;

/**
 * Abstract Class to send errors related by Pix.
 * */
public abstract class ErroDePix extends Exception {

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
