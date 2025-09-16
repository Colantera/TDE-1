public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;
    private int quantidade;

    public Livro(String titulo, String autor, int ano, String isbn, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        this.quantidade = quantidade;
    }

    public boolean isDisponivel() {
        return quantidade > 0;
    }

    public void emprestar() {
        if (isDisponivel()) {
            quantidade--;
        }
    }

    public void devolver() {
        quantidade++;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor + ", " + ano + ") - Disponível: " + quantidade;
    }
}
