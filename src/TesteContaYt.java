public class TesteContaYt {
    public static void main(String[] args) {

        ContaBanco cliente1 = new ContaBanco(153209, "CC", "victor", 0, false);
        ContaBanco cliente2 = new ContaBanco(222222, "CP", "cibelle", 0, true);

        cliente1.abrirConta("CC");
        cliente2.abrirConta("CP");

        cliente1.depositar(600);
        cliente2.depositar(800);

        cliente2.sacar(100);
        cliente1.sacar(200);

        cliente1.fecharConta();

        cliente1.imprimirDetalhes();
        cliente2.imprimirDetalhes();
    }
}
