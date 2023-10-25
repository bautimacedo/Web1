package figuras;

public class Posicion implements Comparable<Posicion> {
    private Integer x;
    private Integer y;

    /**
     * Calcula la distancia entre la posicion y el origen (0,0).
     * @return La distancia al origen.
     */
    public Double distanciaAlOrigen () {
        // TODO - Implementar el metodo
        return Math.sqrt(getX()*getX() + getY()*getY());
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * Devuelve la posicion como un par ordenado, sin espacios en blanco.
     * @return El par ordenado.
     */
    public String toString() {
        return getX()+","+getY();
    }

    /**
     * Compara la posicion con cualquier otra posicion
     * devolviendo -1, 0 o 1 segun sea menor, igual o mayor la distancia al origen.0
     * @return El entero indicando la comparacion.
     */
    @Override
    public int compareTo(Posicion otro) 
    {
        if(distanciaAlOrigen()>otro.distanciaAlOrigen())
        {
            return 1;
        }
        else if(distanciaAlOrigen()<otro.distanciaAlOrigen())
        {
            return -1;
        }
        else  
            return 0;
       
   
    }
}
// throw new IllegalStateException();