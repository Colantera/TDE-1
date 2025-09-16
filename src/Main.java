public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        Livro l1 = new Livro("Java Básico", "Autor A", 2020, "12345", 2);
        Livro l2 = new Livro("POO em Prática", "Autor B", 2022, "67890", 1);

        b.cadastrarLivro(l1);
        b.cadastrarLivro(l2);

        Usuario u1 = new Aluno("Pedro", "A001");
        Usuario u2 = new Professor("Maria", "P001");

        b.cadastrarUsuario(u1);
        b.cadastrarUsuario(u2);

        b.listarLivros();

        b.emprestarLivro(u1, l1);
        b.emprestarLivro(u2, l2);

        b.listarEmprestimos();
        b.listarLivros();
    }
}
