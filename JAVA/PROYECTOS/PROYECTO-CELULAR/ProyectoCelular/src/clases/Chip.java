
package clases;

public class Chip {
    private String empresa;
    private String numero;

    public Chip(String empresa, String numero) {
        this.empresa = empresa;
        this.numero  = numero;
    }

    public Chip() {
    }
    
    //encapsulamiento

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
