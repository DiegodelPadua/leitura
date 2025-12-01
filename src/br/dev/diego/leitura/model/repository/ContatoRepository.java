package br.dev.diego.leitura.model.repository;

import br.dev.diego.leitura.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    public Contato contato;
    private Path arquivo = Paths.get("/Users/sn1094808/arquivos/dados.csv");
    public void gravar() throws IOException {
        try {
            Files.writeString(arquivo, contato.separarDadosContato(), StandardOpenOption.APPEND);
        }catch (IOException erro){
            erro.printStackTrace();

        }

    }

    public void exibirContatos(){
        try {
            List<String> linhas = Files.readAllLines(arquivo);

            for(String linha : linhas){
                String[] linhaContato = linha.split(",");
                System.out.println("Nome: " + linhaContato[1]);
                System.out.println("Email: " + linhaContato[2]);
                System.out.println("Telefone: " + linhaContato[3]);
                System.out.println("-------------------------------");
            }
            System.out.println("FIM");
//            int contador = 0;
//
//            while(contador < linhas.size()){
//                System.out.println(linhas.get(contador));
//                contador++;
//                System.out.println("FIM");
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}


