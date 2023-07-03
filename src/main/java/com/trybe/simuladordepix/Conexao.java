package com.trybe.simuladordepix;

import java.io.Closeable;
import java.io.IOException;

/**
 * Interface to represent connection with db.
 * */
public interface Conexao extends Closeable {

  String enviarPix(int valor, String chave) throws IOException;
}
