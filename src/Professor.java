public class Professor extends Usuario {
    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public int prazoDevolucao() {
        return 14; // 14 dias
    }
}
