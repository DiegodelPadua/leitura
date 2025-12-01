package br.dev.diego.leitura;

import br.dev.diego.leitura.model.Contato;
import br.dev.diego.leitura.model.repository.ContatoRepository;

import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;

public class LeituraEscrita {
    public static void main(String[] args) throws IOException {

        System.out.println("Leitura Escrita");
        Scanner leitor = new Scanner(System.in);
        Contato contato = new Contato();
        System.out.println("Digite o nome do contato: ");
        contato.nome = leitor.nextLine();
        System.out.println("Digite o email do contato: ");
        contato.email = leitor.nextLine();
        System.out.println("Digite o telefone do contato: ");
        contato.telefone = leitor.nextLine();
        contato.id = UUID.randomUUID().toString();

        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.contato = contato;
        contatoRepository.gravar();
        contatoRepository.exibirContatos();

    }

}
