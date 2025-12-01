package br.dev.diego.leitura;

import br.dev.diego.leitura.model.repository.ContatoRepository;

import java.io.IOException;

public class LeituraEscrita {
    public static void main(String[] args) throws IOException {

        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.gravar();

    }

}
