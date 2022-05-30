import br.com.dio.model.Gato;

class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Ronaldo");
        gato.setCor("Verde");
        gato.setIdade(2);

        System.out.println(gato);
       /* int a = 5;
        int b = 3;
        System.out.println("Hello World!" + (a+b));*/
    }
}
