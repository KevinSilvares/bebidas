public class Bebida {
    
    private String nombreBebida;
    private int litrosBebida;
    private boolean bebidaCaliente;
    
    public Bebida(String nombreDeBebida, int litrosDeBebida){
        nombreBebida = nombreDeBebida;
        litrosBebida = litrosDeBebida;
        bebidaCaliente = true;
    }
    
    public String getNombreBebida(){
        return nombreBebida;
    }
    
    public int getLitrosBebida(){
        return litrosBebida;
    }
    
    public boolean getBebidaCaliente(){
        return bebidaCaliente;
    }
    
    public void setNombreBebida(String nombreDeBebida){
        nombreBebida = nombreDeBebida;
    }
    
    public void anadirBebida(int litrosAnadidos){
        litrosBebida = litrosBebida + litrosAnadidos;
    }
    
    public boolean tipoBebida(){
        if (bebidaCaliente == true) {
            bebidaCaliente = false;
        }
        else if(bebidaCaliente == false) {
            bebidaCaliente = true;
        }
        return bebidaCaliente;
    }
}