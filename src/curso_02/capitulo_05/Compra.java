package curso_02.capitulo_05;

public class Compra implements Comparable<Compra> {
    private String nome;
    private double valor;

    public Compra(){}

    public Compra(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Compra outraCompra){
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }

}
