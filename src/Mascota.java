public class Mascota {

    //Atributos
    private String alias;//Obligatorio y longitud mayor o igual a 3.
    private ColorPelo colorPelo;//Obligatorio tipo Enum (ColorPelo.java).
    private double peso;//Obligatorio y mayor que 0.

    //Apartado a.i
    //Constructor 1
    public Mascota(String alias) {
        //Usamos los Mutadores en el constructor para controlar los datos que entran.
        setAlias(alias);
        setPeso((Math.random() * 100) + 0.01);//Obtenemos un numero al azar de 0.01 hasta 100.01 con "(Math.random()*100)+0.01"
        //Para asignar un ColorPelo al azar vamos a crear otro metodo en esta misma clase llamado ColorPeloRandom()
        //aparte debido a que es de tipo ENUMERADO.
        setColorPelo(colorPeloRandom());
    }

    //Apartado a.ii
    //Constructor 2
    public Mascota(String alias, ColorPelo colorPelo, double peso){
        //Usamos los Mutadores en el constructor para controlar los datos que entran.
        setAlias(alias);
        setPeso(peso);
        setColorPelo(colorPelo);
    }

    //Apartado c.
    //Metodo toString() debe devolver un String con toda la informacion de la Mascota
    public String toString(){
        //Usaremos la utilidad de la clase String.format para generar el String de manera mas comoda.
        return String.format("Alias: %s, Color de pelo: %s, peso: %.2f", getAlias(),getColorPelo().toString(), getPeso());
    }

    //Otra manera de hacer el metodo toString de una manera mas sencilla pero menos eficiente es:
    public String toStringAlternativo(){
        return "Alias: " + getAlias() + ", Color de pelo: " + getColorPelo().toString() +", peso: " + getPeso();
    }

    //Accesor del atributo alias. Devuelve un String almacenado en el atributo alias de cada mascota.
    public String getAlias() {
        return alias;
    }

    //Mutador del atributo alias, donde se modifica el String almacenado en el atributo alias de cada mascota.
    //Tambien se controla que la informacion intorducida sea valida segun el enunciado.
    public void setAlias(String alias) {
        //Comprobacion "OBLIGATORIO".
        assert alias != null : "El alias no puede ser nulo/null.";//Controlamos que el alias no sea nulo.
        assert !(alias.isEmpty()) : "El alias no puede ser una cadena(String) vacio.";//Controlamos que el alias no este vacio.
        assert !(alias.isBlank()) : "El alias no pueden ser espacios en blanco.";//Controlamos que el alias no sean espacios en blanco.
        //Comprobacion "LONGITUD MINIMA DE 3".
        assert alias.length() >= 3 : "El alias debe contener al menos 3 caracteres.";
        this.alias = alias.toUpperCase();//Almacenamos el alias en mayusculas porque lo pide en el enunciado
    }

    //Accesor del atributo colorPelo. Devuelve el ColorPelo almacenado en el atributo colorPelo de cada mascota.
    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    //Mutador del atributo colorPelo, donde se modifica el ColorPelo almacenado en el atributo colorPelo de cada mascota.
    //Tambien se controla que la informacion intorducida sea valida segun el enunciado.
    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    //Accesor del atributo peso. Devuelve el double almacenado en el atributo double de cada mascota.
    public double getPeso() {
        return peso;
    }

    //Mutador del atributo peso, donde se modifica el double almacenado en el atributo peso de cada mascota.
    //Tambien se controla que la informacion intorducida sea valida segun el enunciado.
    public void setPeso(double peso) {
        assert peso > 0 : "El peso no puede ser menor o igual que 0";
        this.peso = peso;
    }

    //En este caso el metodo va a ser privado porque no queremos que se use fuera de la clase Mascota.
    private ColorPelo colorPeloRandom() {
        //Al no saber como funcionan los arrays todavia lo haremos de una manera mas tosca.
        //Al saber que solo hay 4 colores (Azul, Negro, Blanco y Rojo).
        //Sacaremos un numero al azar del 0 al 3 y cada uno corresponde con un color.
        int numeroRandom = (int) (Math.random() * 4);//usamos (int) para que Java trunque el resultado de Math.random()*4 ES OBLIGATORIO PONERLO, SI NO DA ERROR.
        //Ahora examinamos todos los valores posibles de numeroRandom.
        if (numeroRandom == 0)//Si numeroRandom ha cogido el valor de 0
            return ColorPelo.AZUL;//Devolvemos el valor de AZUL (Especificado en la clase Enum ColorPelo.java)
        if (numeroRandom == 1)//Si numeroRandom ha cogido el valor de 1
            return ColorPelo.BLANCO;//Devolvemos el valor de BLANCO (Especificado en la clase Enum ColorPelo.java)
        if (numeroRandom == 2)//Si numeroRandom ha cogido el valor de 2
            return ColorPelo.NEGRO;//Devolvemos el valor de NEGRO (Especificado en la clase Enum ColorPelo.java)
        //Por logica si numeroRandom solo puede valer si el programa se ejecuta hasta esta linea, de lo contrario ya habria ejecutado algun return.
        //Asi que no usaremos otro if, ya que se llega a este punto por descarte, es decir, va a ser 3 seguro.
        return ColorPelo.ROJO;//Devolvemos el valor de ROJO (Especificado en la clase Enum ColorPelo.java)
    }
}
