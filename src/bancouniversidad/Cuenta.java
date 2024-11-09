package bancouniversidad;
import java.util.ArrayList;

public class Cuenta {
     String tipoCuenta;
     Double montoinicial;
    ArrayList<Movimiento> mismovimientos;

    public Cuenta() {
        mismovimientos = new ArrayList<Movimiento>();
    }
    
    public void addmovimiento(Movimiento m){
     mismovimientos.add(m);
    }
        
    public Cuenta(String tipoCuenta, Double montoinicial, ArrayList<Movimiento> mismovimientos) {
        this.tipoCuenta = tipoCuenta;
        this.montoinicial = montoinicial;
        this.mismovimientos = mismovimientos;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Double getMontoinicial() {
        return montoinicial;
    }

    public void setMontoinicial(Double montoinicial) {
        this.montoinicial = montoinicial;
    }

    public ArrayList<Movimiento> getMismovimientos() {
        return mismovimientos;
    }

    public void setMismovimientos(ArrayList<Movimiento> mismovimientos) {
        this.mismovimientos = mismovimientos;
    }
    
    
    
}
