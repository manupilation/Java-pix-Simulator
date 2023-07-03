package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Interface that simulate the server.
 **/
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
