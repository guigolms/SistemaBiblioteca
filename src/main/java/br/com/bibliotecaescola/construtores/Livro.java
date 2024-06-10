package br.com.bibliotecaescola.construtores;

public class Livro {
    String editora;
    String autor;
    String gênero;
    String nome;

    public Livro(String nome, String gênero, String autor, String editora) {
        this.nome = nome;
        this.gênero = gênero;
        this.autor = autor;
        this.editora = editora;          
    } 

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return gênero;
    }

    public void setGenero(String gênero) {
        this.gênero = gênero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
}





