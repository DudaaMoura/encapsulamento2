public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setNome("Duda");
        System.out.println(p.getNome());

        p.setIdade(16);
        System.out.println(p.getIdade());

        p.setCpf(null);
        System.out.println(p.getCpf());

        p.setCelular(null);
        System.out.println(p.getCelular());



    }
}
