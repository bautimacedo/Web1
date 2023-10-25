
        
/*

ººººººººººººººArrayListsºººººººººººººº

ArrayList<tipo> nombre = new ArrayList<>();
nombre.add("hola");
System.out.println(fruits.contains("Durazno")); Devuelve un boolean

ºººººººººººººººHashMapºººººººººººººººººººººººººº

Inicializar
HashMap <String,Integer> Productos = new HashMap<>();
Productos.put(key,value);
Productos.put("Prod1", 5);
Productos.get("Prod1"); Esto nos devuelve el value
Productos.containsKey();
Productos.containsValue();
Productos.replace("Prod1", 10);


ººººººººººººººººººººººCasteoººººººººººººº


int a = (int) 0.5 
Castea el 0.5 a un entero, redondeando hacia abajo


ºººººººººººººººººInterfazºººººººººººººººººº

Interface InterEj
{
    void rellenar();
}

Una interfaz tiene metodos abstractos (no estan implementados)
Si llamamos a una interfaz debemos implementar todos los metodos abstractos

public class ClaseEjemplo implements InterEj
{
    void rellenar()
    {
        System.out.println("Rellenada");
    }            
}

Heredacion

Si interfaz A tiene los metodos 1,2,3
    Interfaz B hereda a Interfaz A pero no tiene contenido

Si una clase implementa la interfaz B, va a tener que implementar los metodos
de A porque B los tiene heredados

ººººººººººººººClase Abstractaºººººººººººººº

abstract class ClaseAbs
{
    public void ladrar();
    public void cagar()
    {
        System.out.println("Cague");
    }
}

Podemos ver que la clase abstracta tiene metodos abstractos y otros no
Si una clase hereda a esta clase, debe implementar todos aquellos que son abstracto
Dif entre Interfaz y Abs
- Interfaz : Los metodos son SI O SI abstractos
- Clase Abs: Puede tener metodos tanto abstractos como no


ºººººººººººººººººClases Internas/Anidadasºººººººººººººººººººººººº

class Afuera
{
    int a= 0 ;
        Class Interna
        {
            int b=5;
        {
}

Luego en otra clase iniciamos un main e inicializamos los objetos

Afuera hola = new Afuera(),
Afuera.Interna chau = hola.new Adentro();
Hola es intancia de la clase extern
Chau es intancia de la clase interna

ººººººººººººººººººººEncapsulamientoººººººººººººººººº

Permite gestionar la visibilidad de las variables, basicamente trata de poner
las variables en private y luego acceder a estas a traves de un set y get
El punto es abstraer las variables para facilitar las cosas al usuario
private int a=0;


ºººººººººººººººººEnumsºººººººººººººººººººººººººº

Es una lista de variables que no cambia que son guardadas
y accedidas como clases.
Una buena practica es hacer un archivo distinta para los enums

public enums Etiquetas
{
    HOLA,CHAU
}

luego en un main podemos acceder de la siguiente forma

public static void main(String[] args) 
{
    Etiquetas saludo = Etiquetas.HOLA;
    switch(Saludo)
    {      
    case HOLA:
            braeak;
    }

    if(saludo==saludo.HOLA)
    {

    }


}


ºººººººººººººººººExcepcionesºººººººººººººººººººººººººº

Explica como se rompio el programa
Incluye la linea y todo


ººººººººººººººººFinal Classesºººººººººººººººººººººººººº

Si una clase es final

final public class Final{}

Otra clase no pude heredar a esta

Clase A tiene un metodo final
Clase B hereda a A
La clase B no puede sobreescribir el metodo de A


ººººººººººººººººIteradoresºººººººººººººººººººººººººº

Es una herramienta que permite loopear a traves de una coleccion

Ej
 ArrayList<String> foods = new ArrayList<>();
 Iterator<String> it = new foods.iterator();
en "it" estamos guardando todos los elementos de foods
y luego este los recorre de forma escuencial

it.next(); -> Devuelve objetos de foods
it.hasNext(); Devuelve boolean para saber si tiene un prox elemento

ººººººººººººººººPolimorfismoºººººººººººººººººººººººººº

Significa muchas formas
Digamos que tenemos una clase A
Clase A tiene el metodo cantar
Clase B extiende a la clase A y sobreescribe el metodo cantar
Si en un main hacemos un objeto de la clase B y llamamos a cantar
el Objeto va a priorizar cantar de su propia clase antes qe la clase A
pero si borramos la sobreescritura, va a cantar como la clase A


ººººººººººººººººSobrecargaºººººººººººººººººººººººººº

Es escibir un mismo metodos de distintas formas donde se reciben distintos parametros
Por ejemplo en una clase tenemos un metodo que suma numeros 
El metodo se llama addNumbers y tenes tres metodos
1- Recibe ambos enteros
2- Recibe ambos flotantes
3- Recibe un entero y un flotante

En el main cuando llames al metodo, el programa se encarga de elegir cual usal
en funcion de los parametros que le estas brindando


ººººººººººººººººSobreescrituraººººººººººººººººººººººººº
Lo mismo q la explicacion del polimorfismo

ººººººººººººººººSuperººººººººººººººººººººººººº
Cuando tenemos dos clases y una hereda a la otra
cuando usamos algo en el main, al utilizar la palabra
"super" nos estamos referenciando a la clase padre

por ejemplo si tenemos
Clase A tiene metodo llamar();
Clase B hereda a A
en clase B queres intanciar algo en base a A
podes utilizar super.llamar();

*/

