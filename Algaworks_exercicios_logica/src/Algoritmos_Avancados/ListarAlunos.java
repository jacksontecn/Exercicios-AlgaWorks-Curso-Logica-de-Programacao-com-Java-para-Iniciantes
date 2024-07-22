package Algoritmos_Avancados;

public class ListarAlunos {

    private final int QUANTIDADE_ALUNOS = 5;

    private Alunos [] lista = new Alunos[QUANTIDADE_ALUNOS];

    private int tamanhoLista = 0;

    public Alunos obter(int indice){
        return lista[indice];
    }

    public int tamanho(){
        return tamanhoLista;
    }

    public void adicionar(Alunos aluno){
        if (tamanhoLista == lista.length){
            Alunos[] novaLista = new Alunos[QUANTIDADE_ALUNOS + lista.length];

            for (int i = 0; i < lista.length; i++){
                novaLista[i] = lista[i];
            }
            lista = novaLista;
        }
        lista[tamanhoLista] = aluno;
        tamanhoLista++;
    }

    public void remover(Alunos alunos){
        for (int i = 0; i < tamanhoLista; i++){
            Alunos aluno = lista[i];
            if (aluno != null && aluno.equals(alunos)){
                remover(i);
                break;
            }else if (aluno == null && alunos == null){
                remover(i);
                break;
            }
        }
    }

    private void remover(int indice){
        int indiceInicial = indice + 1;
        for (int i = indiceInicial; i < tamanhoLista; i++){
            lista[i - 1] = lista[i];
        }
        tamanhoLista --;
        lista[tamanhoLista] = null;
    }

    public void ordenar(){
        for (int i = 0 ; i < tamanhoLista; i++){
            Alunos alunoPosicaoBase = lista[i];
            int indiceBase = i;

            while (indiceBase > 0){
                int indiceDepois = indiceBase -1;
                Alunos alunoAnterior = lista[indiceDepois];

                if (alunoAnterior.vemDepois(alunoPosicaoBase)){
                    lista[indiceBase] = lista[indiceDepois];

                    indiceBase --;
                }else {
                    break;
                }
            }
            lista[indiceBase] = alunoPosicaoBase;
        }
    }

}
