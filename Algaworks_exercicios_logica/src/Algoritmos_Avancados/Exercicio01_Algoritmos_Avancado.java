package Algoritmos_Avancados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercicio01_Algoritmos_Avancado {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\Jackson\\Documents\\arquivos\\lista-de-nomes.txt");

        List<String> nomes = Files.readAllLines(arquivo);

        ListarAlunos listaAlunos = new ListarAlunos();

        for (int i = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);

            Alunos aluno = new Alunos();
            aluno.setNome(nome);

            listaAlunos.adicionar(aluno);
        }

        listaAlunos.ordenar();

        List<String> nomesOrdenados = new ArrayList<String>();
        for (int i = 0; i < listaAlunos.tamanho(); i++) {
            Alunos aluno = listaAlunos.obter(i);
            nomesOrdenados.add(aluno.getNome());
        }

        Path novoArquivo = Paths.get("C:\\Users\\Jackson\\Documents\\arquivos\\lista-de-nomes.txt");
        Files.write(novoArquivo, nomesOrdenados);

    }
}

