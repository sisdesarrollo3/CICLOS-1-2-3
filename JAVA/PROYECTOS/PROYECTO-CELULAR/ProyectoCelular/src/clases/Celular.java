
package clases;

public class Celular {
    private String modelo;
    private int numeroChips;
    private Bateria bateria; //composicion
    private Chip [] chips;  //array para adicionar varios chipas - agregacion

    public Celular(String modelo, int numeroChips, Bateria bateria) {
        this.modelo = modelo;
        this.numeroChips = numeroChips;
        this.bateria = bateria;
        chips = new Chip[2];
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroChips() {
        return numeroChips;
    }

    public void setNumeroChips(int numeroChips) {
        this.numeroChips = numeroChips;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Chip[] getChips() {
        return chips;
    }

    public void setChips(Chip[] chips) {
        this.chips = chips;
    }  
        
    public void agregarChip(Chip nuevoChip) {
       this.chips[0] = nuevoChip;
    }
    
    public void mostrarDatos(){
        System.out.println("*** DATOS DEL CELULAR ***");
        System.out.println("MODELO: " + this.modelo);
        System.out.println("NUMERO CHIPS: " + this.numeroChips);
        System.out.println("MARCA BATERIA: " + this.bateria.getMarca());
        System.out.println("MILIAMPBERIOS: " + this.bateria.getMiliamperios());
        System.out.println("OPERADOR: " + this.chips[0].getEmpresa());
        System.out.println("NUMERO: " + this.chips[0].getNumero());
    }
    
}
