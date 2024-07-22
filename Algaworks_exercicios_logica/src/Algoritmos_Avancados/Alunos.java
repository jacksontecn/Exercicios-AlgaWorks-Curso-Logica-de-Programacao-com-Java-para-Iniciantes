package Algoritmos_Avancados;

public class Alunos {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean vemDepois(Alunos alunos){
        if (alunos == null){
            return false;
        }
        return getNome().compareTo(alunos.getNome()) > 0;
    }

}
