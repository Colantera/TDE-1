import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Livro l) {
        livros.add(l);
    }

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void emprestarLivro(Usuario u, Livro l) {
        if (l.isDisponivel()) {
            Emprestimo e = new Emprestimo(u, l);
            emprestimos.add(e);
            System.out.println("Empréstimo realizado: " + e);
        } else {
            System.out.println("Livro indisponível.");
        }
    }

    public void listarLivros() {
        System.out.println("\nLivros cadastrados:");
        for (Livro l : livros) {
            System.out.println(l);
        }
    }

    public void listarEmprestimos() {
        System.out.println("\nEmpréstimos ativos:");
        for (Emprestimo e : emprestimos) {
            System.out.println(e);
        }
    }
}
