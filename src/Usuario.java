public class Usuario {
    protected String nome;
    protected String matricula;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public int prazoDevolucao() {
        System.out.println("ERRO: O tipo de usuário não foi definido!");
        return 0;
    }
}