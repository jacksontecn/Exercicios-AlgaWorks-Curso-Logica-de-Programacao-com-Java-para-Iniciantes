package Algoritmos_Avancados;

public class AlgoritimosAvançados {
    public static void main(String[] args) {
        ListarAlunos lista = new ListarAlunos();

        Alunos aluno1 = new Alunos();
        aluno1.setNome("João");
        lista.adicionar(aluno1);

        Alunos aluno2 = new Alunos();
        aluno2.setNome("Maria");
        lista.adicionar(aluno2);

        Alunos aluno3 = new Alunos();
        aluno3.setNome("Alexandre");
        lista.adicionar(aluno3);

        Alunos aluno4 = new Alunos();
        aluno4.setNome("Normandes");
        lista.adicionar(aluno4);

        Alunos aluno5 = new Alunos();
        aluno5.setNome("Thiago");
        lista.adicionar(aluno5);

        Alunos aluno6 = new Alunos();
        aluno6.setNome("Gabriel");
        lista.adicionar(null);

        iterar(lista);

        lista.ordenar();

        iterar(lista);

        lista.remover(aluno3);

        iterar(lista);

    }

    static void iterar(ListarAlunos listaAlunos) {

        for (int i = 0; i < listaAlunos.tamanho(); i++) {
            Alunos a = listaAlunos.obter(i);
            if (a != null){
                System.out.println("Aluno: " + a.getNome());
            }else {
                System.out.println("Aluno sem nome");
            }
        }

        System.out.println("-------------------------------");

    }
}
