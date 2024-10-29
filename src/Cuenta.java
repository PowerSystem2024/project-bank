

import java.util.ArrayList;

public class Cuenta {
   String tipoCuenta;
   double montoinicial;
   ArrayList<Movimiento> mismovimientos;

    public Cuenta() {
        mismovimientos=new ArrayList<Movimiento>();
    }

    public void addMovimiento(Movimiento m){
        mismovimientos.add(m);
    }
    public ArrayList<Movimiento> getMismovimientos() {
        return mismovimientos;
    }

    public void setMismovimientos(ArrayList<Movimiento> mismovimientos) {
        this.mismovimientos = mismovimientos;
    }

    
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getMontoinicial() {
        return montoinicial;
    }

    public void setMontoinicial(double montoinicial) {
        this.montoinicial = montoinicial;
    }
    

}
