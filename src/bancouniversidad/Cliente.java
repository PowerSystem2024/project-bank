package bancouniversidad;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String telefono;
    private String direccion;
    private ArrayList<Cuenta> miscuentas;//El cliente va a tener varias cuentas en el 
    //mismo banco

    public Cliente() {
        miscuentas = new ArrayList<Cuenta>();
    }
    
    //con este metodo el Ciente puede agregar sus cuentas creadas
    //al array que va a almacenarlas en la memoria
    public void addCuenta(Cuenta c){
    miscuentas.add(c);
    }
      /**
     * @return the miscuentas
     */
    public ArrayList<Cuenta> getMiscuentas() {
        return miscuentas;
           }
    
    

    public Cliente(String nombre, String telefono, String direccion, ArrayList<Cuenta> miscuentas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.miscuentas = miscuentas;
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

  

    /**
     * @param miscuentas the miscuentas to set
     */
    public void setMiscuentas(ArrayList<Cuenta> miscuentas) {
        this.miscuentas = miscuentas;
    }
    
    

}
