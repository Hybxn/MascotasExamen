public class Principal {

    //Esta constante se usara en el apartado d.
    private static final double PESOMINIMO = 3.50;
    //Como el enunciado no especifica el valor de este atributo y es una constante, le damos el que nos de la gana.
    //En mi caso he elegido 3.50

    //Metodo main, ES OBLIGATORIO EN TODA CLASE PRINCIPAL, se usa para que Java ejecute el programa con las instrucciones dentro del metodo.
    public static void main(String[] args) {
        //Vamos a usar este metodo para comprobar que nuestro programa funciones.

        //Vamos a crear dos Mascotas, una con el metodo generar y otra con el constructor del apartado a.ii.
        Mascota mascota1 = generar("Cristiano Ronaldo");//Mascota creada con el metodo generar(String alias)
        Mascota mascota2 = new Mascota("Nico", ColorPelo.BLANCO, 3);//Mascota creada con el constructor del apartado a.ii

        //Primero vamos a comprobar que funciona el metodo toString en la mascota1, se puede hacer de dos formas.
        //FORMA 1
        System.out.println(mascota1.toString());
        //FORMA 2
        System.out.println(mascota1);
        //Ambas formas dan el mismo resultado.

        //Ahora comprobaremos si funciona el metodo controlPeso(Mascota mascota).
        controlPeso(mascota2);

    }

    //Apartado b.
    //Metodo generar que recibe un String como alias y nos crea solo una mascota (APARTADO b.)
    //Truquito extra, los metodos en la clase Principal siempre van a ser static ;)
    public static Mascota generar(String alias){
        return new Mascota(alias);
        //Con esta instruccion devolvemos una Mascota generada con nuestro contructor relaizado en el apartado a.i
        //El cual crea una Mascota con un alias en concreto y le asigna un peso y color aleatorios.
    }

    //Apartado d.
    //En este metodo nos da la libertad de ponerle el nombre que queramos, en mi caso se llamara controlPeso()
    //Debe recibir una Mascota como parametro y usar la constante PESOMINIMO ya declarada en la linea 4 de esta clase.
    public static void controlPeso(Mascota mascota){
        System.out.println(mascota.toString());//Tambien funciona si escribimos System.out.println(mascota);
        //Comprobamos si el peso de la mascota esta por debajo de nuesta constante PESOMINIMO
        if (mascota.getPeso() < PESOMINIMO)//TRADUCCION: Si el peso de la mascota es menor que peso minimo...
            System.out.printf("MASCOTA CON BAJO PESO (<%.2f)", PESOMINIMO);
        //Otra manera de escribir la linea anterior es: System.out.println("MASCOTA CON BAJO PESO (" + PESOMINIMO + ").");
    }

}
