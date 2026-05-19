package entities;

public class Imovel {

    private int id;
    private String endereco;
    private double valor;
    private String tipo;
    private boolean disponivel;
    private double area;

    public Imovel(int id, String endereco, double valor, String tipo, boolean disponivel, double area) {

        this.id = id;
        this.endereco = endereco;
        this.valor = valor;
        this.disponivel = disponivel;
        this.area = area;
        this.tipo = tipo;
        }

        public int getId() {
                return id;
        }
        public String getEndereco() {
            return endereco;
        }
        public double getValor() {
            return valor;
        }
        public String getTipo() {
            return tipo;
        }
        public boolean isDisponivel() {
            return disponivel;
        }
        public double getArea() {
            return area;
        }


        public void setValor(double valor){
            this.valor = valor;
        }
        public void setEndereco(String endereco){
            this.endereco = endereco;
        }
        public void setDisponivel(boolean disponivel){
            this.disponivel = disponivel;
        }
        public void setArea(double area){
            this.area = area;
        }

}