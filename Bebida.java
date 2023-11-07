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
    
    public void estadoBebida(){
        String estadoBebidaCaliente = "";
        if (bebidaCaliente == true){
            estadoBebidaCaliente = "Sí";
        }
        else if (bebidaCaliente == false){
            estadoBebidaCaliente = "No";
        }
        System.out.println("Bebida: " + nombreBebida + "| Litros Disponibles: " + litrosBebida + "| ¿Está caliente la bebida? " + estadoBebidaCaliente);
    }
    
    public String getDetalles(){
        String estadoBebidaCaliente = "";
        String estadoDeBebida = "";
        if (bebidaCaliente == true){
            estadoBebidaCaliente = "Sí";
        }
        else if (bebidaCaliente == false){
            estadoBebidaCaliente = "No";
        }
        estadoDeBebida = "Bebida: " + nombreBebida + "| Litros Disponibles: " + litrosBebida + "| ¿Está caliente la bebida? " + estadoBebidaCaliente;
        return estadoDeBebida;
    }
}