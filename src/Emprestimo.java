public class Emprestimo {
    private Usuario usuario;
    private Livro livro;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        livro.emprestar();
    }

    public void devolverLivro() {
        livro.devolver();
    }

    @Override
    public String toString() {
        return usuario + " pegou \"" + livro.getTitulo() + "\" por " + usuario.prazoDevolucao() + " dias.";
    }
}
