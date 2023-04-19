/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialteoria;

/**
 *
 * @author bauti
 */
public class ParcialTeoria 
{
    public static void main(String[] args) { }   
}

/*

Tipo de Variables Primitivas
- Enteros:
Byte (8 bits)
Short (16 bits)
Char (16 bits)
Int (32 bits)
Long (64 bits)
- Flotantes
Float (32 bits)
Double (64 bits)
- Boolean (????????????????)


-PascalCase o UpperCamelCase: Nombrando clases, cada palabra empieza con mayus, ej-> ClaseDelPrimero
-CamelCase: Para nombrar variables, la primera litra en minus y demas en mayus, ej-> int miVariableDos;
-VAR se puede usar dentro de metodos, fuera no.
-No se permite usar caracteres especiales para nombrar variables, ej-> int #variable;
\n -> Nueva Linea
\t -> Tabular
\b -> Retroceso
\` -> Comilla Simple
\" -> Comilla Doble

Ingresar Por Teclado
import java.util.Scanner;
Scanner consola = new Scanner(System.in);
var usuario = consola.nextLine();

-------------------------------------------------------------------------------------------------------------

Tipos de Datos en Java
Tipos Primitivos -> Enteros y Flotantes
Tipos Referenciados -> Clases / Interfaces / Arreglos

byte num = 120; -> Nos va a dar error porque va a tratar a "num" como int, java trata
a las variables sin coma como un entero. debemos forzar el casteo:
byte num= (byte)120;

Numeros Sin Coma: Por default son int de 32 bits
Numeros con Coma: Por default son double de 64 bits

Byte.MAX_VALUE -> da el maximo valor q admite byte
Byte.MIN_VALUE -> da el minimo valor q admite byte

Convertir un String en un int:
var edad=Integer.parseInt("20");
var valorPI=Double.parseDouble("3.1416");




Meterlo por consola:

var consola= new Scanner(System.in);
sout ("brindar valor");
var edad = Integer.parseInt(consola.nextLine());


------------------------------------------------------------------------------------------------

Operadores:

var a= 3;
var b= -a; Le va a asignar el opuesto de a, es decir -3


var a= 5;
var b= ++a;
Le va a asignar 6 a b y luego a a. Modifica ambos valores


var a=5;
var b= a++;
Le va a asignar 5 a a y luego le incrementa uno a a. Modifica solo a


Operadores de Igualdad:

var a=4;
var b=5; 
var c= (a==b);
La variable c va a imprimir "false" debido a que a es != a b
Tambien se puede hacer con strings, dar true o false.
Otra forma de hacerlo es la siguiente:
var cadena="Hola";
var cadena2="Chau";
sout(cadena.equals(cadena2)); -> va a dar "false"


Si uno de los dos es true "||", entonces se imprime lo primero
var vacaciones=false;
        var descanso=false;
        if(vacaciones||descanso) 
            System.out.println("Padre puede asistir");
        else
            System.out.println("no");

Cambiarle el valor a "true" y "false":
var resultado = (1>2) ? "es verdadero" : "es falso";
resultado(numero%2==0) ? "numero par" : "impar";


--------------------------------------------------------------------------------------------------------

Diferencias del switch con C, podemos poner 3 switches en la misma linea, ej:

var mes=4;
var estacion= " ";
switch(mes){
case 1: case 2: case 12:
estacion= "Verano";
break;
case 3: case 4: case 5:
estacion= " ";
break;


Palabra "continue":
for(var contador=0; contador<3 ; contador++)
{
    if (contador % 2!=0)
    continue; //se va a la siguinte interacion
}

continue inicio; ????????????????????????????? NO ENTIENDO

---------------------------------------------------------------------------------------------------


int [] enteros; -> decalarame un arreglo
enteros = new int[5]; -> reservamos memoria
enteros[2]=2;
Por default, si no les asignamos valores a las otras posiciones, su valor va a ser 0
sout(enteros) -> posicion de memoria de primer elemento del arreglo


Otra Sintaxis:
int entero[]={1,2,3,4};
Si intentamos de imprimir entero[5] nos va a tirar error, porque no existe


Un for mejorado para recorrer un arreglo se usa de la sig manera:

int [] num = {1,2,3};
for(var recorrer:num);
{
    soutv(recorrer);
}
Va a recorer el arreglo e ir imprimiendo


EJERCICIO DE ARREGLO E INGRESAR POR TECLADO

inicializar una matriz:
final int a=5; -> El pograma no va a poder cambiar el valor, por el final.
final int b=5;
int [][] matriz= new int [a][b];

----------------------------------------------------------------------------------------------------------------

Funciones

se declaran con static antres, ej:

static void cambiarValor(int a);

public class EjerFunciones 
{
    int i=3;
    static int atributo=2;
    
    public static void main(String[] args) {
        var a= 3;
        
        System.out.println("a = " + a); // variable local al metodo main
        System.out.println("i = " + new EjerFunciones().i); //atributo de instancia de clase (objeto)
        System.out.println("atributo = " + atributo); //atributo de la clase
    }
}


RECURSIVIDAD


static void funcion (int num)
{
    if(num==1)
    sout(num)
    else
    {
        funcion(num-1)
        sout(num)
    }
}


---------------------------------------------------------------------------------------------------------------

Funciones Integradas en Java

var cadena= "Holaa";
cadena.length() -> longitud de cadena
cadena.charAt(5) -> Brinda el 5to caracter de cadena
var cadena2=cadena.substring(0,4) -> crea una subcadena>>> "Hola"


Cambiar Numeros a Strings

int a=5, int b=10;
sout(a+b);
sout(String.valueOf(a) + Integer.toString(b))
String resultado= String.format("%d %d", a, b)


Numeros Random

import java.util.Random;
var aleatorio= new Random();
int val=aleatorio.nextInt(100+1);

Valor Absoluto
int a=-5;
var aAbs= Math.abs(a);

Redondeo
var num= 8.5;
var redondeado= Math.round(num)
var patron= "#"; //le saca el decimal
var decimalFormat=new DecimalFormat(patron)
var truncado= decimalFormat.format(numero)

-------------------------------------------------------------------------------------------------------------------------------------

POO Primer Power

- Java -> fuertemnte tipado
- Java trabaja preferentemente con clases y objetos
- Objeto: Toda variabel cuyo tipo de datos es una "clase"
- Clase: Estructura que agrupa datos mas la funcionalidad para manipularlos

Sintaxis de definicion de clase
<definicion de atributos>
<definicion de constructores>
<definicion de metodos>

Atributos definen estructura de datos de la clase, por omision son pubic.
Public: Se modifican desde afuera del objeto y accesible desde otras clases
Private: Unicamente se puede usar dentro de la clase. 
Protected: Es un intermedio, solo puede ser utilizado por la clase y sus clases hijas.
ej: clase Padre: Persona, Clase hija: empleado, empleador -> estos pueden ver los atributos y metodos.s

Crear un Objeto
Supongamos la clase Ejemplo:
Ejemplo e; -> Apuntador a objeto de esta clase
e = new Ejemplo(); -> Crea una clase (el operador new la crea)

Los objetos son punteros que inicialmente apuntan a una direccion de mem Null
En lo sig; declaramos un objeto e intentamos utilizarlo sin haberlo creado
Cuando ejecutemos nos va a dar NullPointerException (error)

Acceder atributos y metodos del objeto -> operador "."

Main es siempre declarado como static
Static en un metodo implica que no es necesario crear el objeto para llamar al metodo


Tipos de Constructores:

Supongamos class ejemplo{

public ejemplo(){} -> Este es el constructor vacio que se hace por defecto y que en caso de que se haga un constructor con objetos, este se borra.
public ejemplo(int dato1, String dato2) -> Este es el constructor con objetos
{
    this.dato1=dato1;
    this.dato2=dato2;
}
public void setDato1(int dato1)
{
    this.dato1=dato1;
}
public int getDato()
{
    return dato1;
} 

Si se inicializa un constructor y no el vacio, lo sig no va a funcionar poruq no existe un constructor q no reciba argumentos
ejemplo e= new ejemplo();

En caso de que los atributos sean de tipo private, no se podran inicializar valores de la siguiente manera:
e1 (es un objeto de la clase ejemplo)
e1.dato1=5; -> Esto no se va a poder hacer porque es private, se necesita el constructor con setters y getters
Por otro lado el constructor con objetos nos permite inicializar valores de la siguiente manera>
ejemplo e1;
e1 = new ejemplo(20,5); -> Siendo 20 dato1 y 5 dato2


Palabra reservada "this"
Se utiliza para denotar desde el interior de un objeto una referencia al propio objeto

Encapsulamiento -> Sirve para proteger los datos de los objetos
En caso que sea private un atributo, se acceden a los atributos desde afuera de la clase por un getter y se modifica con un setter

Herencia
-Directa o indirectamente, en java todas las clases heredan de una clase base llamada Objext
- Es transitiva: Si A hereda de B y B hereda de C, entonces A hereda de C

Metodo toString

Supongamos clase Fecha con tributos dia,mes,anio
System.out.println("Dia"+f1.dia);
System.out.println(f1);
Es normal pensar que la linea 325 imprime la fecha, pero en realidad imprime
la direccion de memoria del estilo -> libro.cap14.fechas.fecha@232g0
Esto pasa debido a que el programa lee System.out.println(f1.toString);
Por lo tanto debemos sobreescribir el metodo que es heredado de object

Sobreescritura de toString:
public String toString()
{
 return dia+"/"+mes+"/"+anio;
}
 Ahora cuando imprimamos lo de la linea 325, el programa imprimira la fecha

Metodo Equals
Este metodo que es heredado de Object, permite determinar si una cadena
es igual a otra comparando caracter por caracter, pero en nuestro caso nosotros
queremos que compare fechas no cadenas, por lo tanto sobreescribiremos el metodo
public boolean equals(Object o)
{
    Fecha otra= (Fecha)o;
    return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio)
}


Sobrecarga de metodos
Un metodo es sobrecargado cuando admite recibir mas de un tipo de combinacion de argumentos
Esto se hace reescribiendo el metodo tantas veces como se quiera

Es decir, cuando inicializamos varios constructores, estamos sobrecargando el constructor
Sobrecargar -> Escribirlo mas de una vez con diferentes parametros
Sobreescribir -> Programamos un metodo que es heredado de clase padre, hay quee respetar
cantidad y tipo de parametros porqe sino lo estariamos sobrecargando

 Encapsulamiento
Se habla de "exponer" y "ocultar" porque hay metodos y atributos declarados como  public
para que estos sean visibles desde cualquier otra clase, pero hay otros que no necesariamente
tienen que ser vistos, por lo tanto los ponemos como private, encapsulandlos. Lo cual ahorrara
confusion innecesaria
 

----------------A PARTIR DE ACA NO VIMOS EN CLASE-------------------------------------------------------------
Paquetes: Fisicamente son directorios o carpetas
Permiten tener varias clases con el mismo nombre debido a que estas estan guardadas en diferenes paquetes.
La primera linea de cada clase debe ser: package <nombre paquete>
Package Root: Carpeta que es la base de las carpetas que constituyen los paquetes, todo deriva de aqui

API (Application Programming Interface)
API: Conjunto de paquetes que estan disponibles para utilizar en nuestros programas
API: Conjunto de paquetes cuyas clases son funcionalmente homogeneas
Ejemplo: java.next es parte del API de networking y java.sql es parte del API de base de datos.

Importar clases de otros Paquetes:
Nuestras clases pueden usar clases de otros paquetes importandolas de la sig manera:
import java.util.Scanner lo cual nos permite usar la clase Scanner
java.lang es un paquete que se importa solo y contiene String,Integer,Object,System,etc.

Herencia y Polimorfismo
Con la clase Fecha trabajada anteriormente, supongamos que no tenemos acceso a esta pero queremos modificar
un metodo, toString. Esto debido a que queremos hacer que se exprese con mas detalle la fecha
a la hora de llamar a toString. Por lo tanto sobreescribimos el toString en una nueva clase
llamada FechaDetallada.

import tema5.fecha (nombrepaquete.nombreclase)
public class FechaDetallada extends Fecha
{
    -----------------
}

Para decir que una clase hereda de otra, decimos que la "extiende"
Los constructores no se heredan.


Polimorfismo: Habilidad de un objeto de realizar una accion de diferentes maneras,
utilizando metodos iguales que se implementen de forma distinta en varias clases
Sobrecargar -> Polimorfismo estatco
Sobreescribir -> Polimorfismo dinamico

Paradigma -> Conjunto de principios usados para resolver problemas
Estructurado> Basado en estructuras decontrol (si/entonces/si no/etc), los programas son mas faciles de entender
Funcional> Se basa en funciones, codigo usa funciones pequeñas. Promueve reutilizacion
Orientado a Obj> Programas trabahan con base en unidades llamdas objetos

Ventajas POO:
> Facilita creacion y mantenimiento del sistema
> Promueve reutilizacion, hay similitudes entre objetos
Ejemplo de reutilizacion, si se crea un codigo que detecte el click de un mouse,
este puede ser reutilizado cada vez que queramos crear un boton a clickear, pero con 
caracteristicas particulares.
> Mejora desarrollo de software a gran escala


*/
