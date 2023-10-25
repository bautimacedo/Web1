package figuras;
public class Triangulo extends FiguraGeometrica {
    // La constante se usa para BASE y ALTURA
    private static final Integer MAX_ALTURA = 1000;
    // El numero de serie del primer objeto es 1
    // No se puede repetir el numero para dos triangulos
    private static Integer nroSerie = 0;
    private Integer base;
    private Integer altura;

    /**
     * Constructor que utiliza el mismo valor de la base
     * para la altura.
     * Debe generar el ID con la forma
     *    "TrianguloX"
     * siendo X el numero de serie correspondiente.
     * Configurarlo con setId() de la superclase.
     */
    public Triangulo (Integer base) {
        this.base=base;
        this.altura=base;
        String id = "Triangulo"+nroSerie;
        nroSerie++;
        setId(id);
    }

    /**
     * Constructor que recibe los valores de la base
     * y de la altura.
     * Debe generar el ID con la forma
     *    "TrianguloX"
     * siendo X el numero de serie correspondiente.
     * Configurarlo con setId() de la superclase.
     */
    public Triangulo (Integer base, Integer altura) {
        this.base=base;
        this.altura=altura;
        String id = "Triangulo"+nroSerie;
        nroSerie++;
        setId(id);
    }

    /**
     * Calcula el perimetro de la figura.
     * @return El perimetro.
     */
    public Double getPerimetro () {
        if(base==altura)
        {
            return (double)base*3;
        }
        else
        {
            double tercerlado = Math.sqrt(base*base+altura*altura);
            return base+altura+tercerlado;
        }   
    }

    /**
     * Calcula la superficie de la figura.
     * @return La superficie.
     */
    public Double getSuperficie () {
        
        return base*altura/2.0;
    }

    public Integer getBase() {
        return base;
    }

    /**
     * Configura la base controlando que sea mayor que cero
     * y menor que MAX_ALTURA.
     * @param altura La base a configurar.
     */
    public void setBase(Integer base) {
        if(base>0 && base<MAX_ALTURA)
            this.base=base;
            else{
                    System.out.println("Numero Invalido, el numero debe estar entre 1 y 1000");
                    }
    }

    public Integer getAltura() {
        return altura;
    }

    /**
     * Configura la altura controlando que sea mayor que cero
     * y menor que MAX_ALTURA.
     * @param altura La altura a configurar.
     */
    public void setAltura(Integer altura) {
         if(altura>0 && altura<MAX_ALTURA)
            this.altura=altura;
            else{
                    System.out.println("Numero Invalido, el numero debe estar entre 1 y 1000");
                    }
    }

    /**
     * Compara el triangulo con cualquie otra figura geometrica
     * devolviendo -1, 0 o 1 segun sea menor, igual o mayor.
     * La comparacion se hace primero por superficie y luego por ID
     * de los objetos. En ambos casos en el orden natural.
     * @return El entero indicando la comparacion.
     */
    @Override
    public int compareTo(FiguraGeometrica f) {
        if(getSuperficie()>f.getSuperficie())
            return 1;
        else if(getSuperficie()<f.getSuperficie())
            return -1;
        else 
        {
            return getId().compareTo(f.getId());
        }
    }

    /**
     * Genera un numero unico para cada objeto creado.
     * @return El numero de serie a usar.
     */
    private Integer getNroSerie() {
        return nroSerie;
    }

    /**
     * Devuelve lo reportado en el toString() de la superclase
     * y le agrega la base y altura del triangulo con el formato
     *   " ++ Altura=x, Base=y"
     * siendo x e y los valores de los campos.
     * @return El texto asociado.
     */
    @Override
    public String toString() {
        return super.toString()+"    Altura: "+getAltura()+"   Base: "+getBase();
    }

}
