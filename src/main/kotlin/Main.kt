import java.lang.Exception
import java.lang.NullPointerException

// Constantes
// En Kotlin all es objeto
const val PI = 3.1416

fun main(args: Array<String>) {
  println("Hello World!")
  // Variable
  var money: Int = 10
  money = 5
  // Variable de solo lectura
  val firstName = "Guillermo"
  val boolean: Boolean = true
  val numberLong: Long = 3L
  val numberDouble: Double = 2.7182
  val numberFloat: Float = 1.1f
  // Cadenas de texto
  val lastName = "Morales"
  // Agregar variable a una cadena de texto, usamos interpolación
  val fullName = "$firstName $lastName"
  if (firstName.isNotEmpty()) {
    println("YES")
  } else {
    println("NO")
  }
  // Solo en una línea.
  if (firstName.isNotEmpty()) println("YES") else println("NO")
  // Variable asignada condicional
  val m1: String = if (firstName.isNotEmpty()) {
    "ASDASDASD"
  } else if (firstName.isEmpty()) {
    "FGHFGHFGH"
  } else {
    "UIOUIOUIO"
  }
  val color = "Amarillo"
  when (color) {
    "Amarillo" -> {
      println("El amarillo es el color de la alegría")
    }

    "Rojo", "Carmesi" -> println("El rojo simboliza el calor")
    else -> println("Error. No tengo información del color")
  }
  val code = 200
  when (code) {
    in 20..299 -> println("Todo ha ido bien")
    in 400..500 -> println("Algo ha fallado")
    else -> println("Código desconocido, algo ha fallado")
  }
  val tallaDeZapato = 41
  val m2 = when (tallaDeZapato) {
    41, 43 -> "Tenemos disponible"
    42, 44 -> "Casi no nos quedan"
    45 -> "Lo siento no tenemos disponible"
    else -> "Estos zapatos solo vienen en tallas 41,42,43,44 y 45"
  }
  println(m1)
  println(m2)
  var count = 10
  while (count > 0) {
    println("El valor de contador es $count")
    count--
  }
  do {
    println("Generando num aleatorio...")
    val numAleatorio = (0..100).random()
    println("El numero generado es $numAleatorio")
  } while (numAleatorio > 50)
  val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa", "Durazno")
  for (fruta in listaDeFrutas) {
    println("Hoy voy a comerme una fruta llamada $fruta")
  }
  listaDeFrutas.forEach { fruta -> println("Hoy voy a comerme una fruta nueva llamada $fruta") }
  val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length }
  println(caracteresDeFruta)
  val listaFiltrada = caracteresDeFruta.filter { largoFruta -> largoFruta > 5 }
  println(listaFiltrada)
  val name: String? = null
  println(name?.length)
  // Evitar el !!
  try {
    //name!!.length
    throw NullPointerException("Referencia Nula")
  } catch (e: NullPointerException) {
    println("Ha ocurrido un error")
  } finally {
    println("Finalmente ha ocurrido un error... cerrando aplicación")
  }
  val primerValor = 10
  val segundoValor = 0
  val resultado: Int = try {
    primerValor / segundoValor
  } catch (exception: Exception) {
    0
  }
  println(resultado)
  // Siempre nos aseguraremos de que se devuelve un valor por defecto.
  val nameTwo: String? = null
  // Operador elvis ?:
  // Nos aseguramos de que siempre devuelva un valor por defecto.
  val caracteresDeNameTwo: Int = nameTwo?.length ?: 0
  println(caracteresDeNameTwo)
  // Try adding program arguments via Run/Debug configuration.
  // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
  println("Program arguments: ${args.joinToString()}")
  // Listas inmutables
  val listaDeFrutasInmutable = listOf<String>("Pera", "Sandia", "Naranja")
  println(listaDeFrutasInmutable)
  // Listas mutables
  val listaVacia = mutableListOf<String>()
  println(listaVacia)
  listaVacia.add("Agregando el elemento a la lista vacia")
  val valorUsandoGet = listaVacia.get(0)
  println(valorUsandoGet)
  // Operador indexado
  val valorUsandoOperador = listaVacia[0]
  println(valorUsandoOperador)
  val firstValue = listaDeFrutasInmutable.first()
  println(firstValue)
  // En caso de que la lista este vacía
  val primerValorPosiblementeNull: String? = listaDeFrutasInmutable.firstOrNull()
  println(primerValorPosiblementeNull)
  listaVacia.removeAt(0)
  println(listaVacia)
  listaVacia.add("Enrique")
  // Remueve de la lista dependiendo de las condiciones.
  listaVacia.removeIf { caracteres -> caracteres.length > 3 }
  val myArray = arrayOf(1, 2, 3, 4, 5, 6)
  // Nos devuelve el código.
  println("Nuestro array $myArray")
  println("Array como lista ${myArray.toList()}")
  val numerosDeLoteria = listOf(11, 12, 43, 56, 78, 66)
  val numerosSorted = numerosDeLoteria.sorted()
  println(numerosSorted)
  val numerosSortedDescending = numerosDeLoteria.sortedDescending()
  // Los números menores a la condición se iran ordenando al final de la lista.
  val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
  val numerosAleatorios = numerosDeLoteria.shuffled()
  val numerosEnReversa = numerosDeLoteria.reversed()
  // Siempre devolverá la ultima linea del MAP
  val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de lotería es $numero" }
  val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
  val listaDeStringDeNumeros = numerosDeLoteria.filter { num -> num > 50 }.map { num -> "numero: $num" }
  // MAPS: ELEMENTOS DE CLAVE VALOR, ESTRUCTURA DE DATOS.
  // MAPS MUTABLES E INMUTABLES
  // MAPAS INMUTABLES
  val edadSuperHeroes = mapOf(
    "IronMan" to 35,
    "SuperMan" to 1000,
    "SpiderMan" to 23,
    "Capitan America" to 99
  )
  val listaDeCompraConPrecio = mutableMapOf(
    "Jabon" to 2000
  )
  listaDeCompraConPrecio.put("Fideos", 3000)
  listaDeCompraConPrecio["Sandia"] = 4000
  val obtenerListaDeCompra = listaDeCompraConPrecio["Sandia"]
  println(obtenerListaDeCompra)
  listaDeCompraConPrecio.remove("Fideos")
  listaDeCompraConPrecio.remove("Sandia")
  println(listaDeCompraConPrecio.keys)
  println(listaDeCompraConPrecio.values)
  // SET INMUTABLES
  // No va a tener duplicados.
  val vocalesRepetidas = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
  println(vocalesRepetidas)
  val numerosFavoritos = mutableSetOf(1, 2, 3, 4, 5)
  println(numerosFavoritos)
  numerosFavoritos.add(5)
  numerosFavoritos.add(5)
  println(numerosFavoritos)
  // Se elimina el valor directamente que se desea eliminar.
  numerosFavoritos.remove(5)
  // Los valores nullables pueden ser tratados con TRY CATCH, o validaciones.
  val valorDelSet: Int? = numerosFavoritos.firstOrNull { numero -> numero > 2 }
  println(valorDelSet)
  // Funciones y funciones de extensión
  fun randomCase(frase: String): String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) {
      frase.uppercase()
    } else {
      frase.lowercase()
    }
  }

  val fraseAleatoria = "En platzi nunca paramos de aprender"
  val fraseOrdenadaAleatoriamente = randomCase(fraseAleatoria)
  println(fraseOrdenadaAleatoriamente)
  fun imprimeFrase(frase: String): Unit {
    println("Tu frase es : $frase")
  }

  // Funciones de extension
  // Similares a uppercase() y lowercase()
  fun String.obtenerFecha(): String {
    return this
  }

  val fecha = "23122023".obtenerFecha()

  // Parámetros nombrados
  // Valores por defecto.
  fun imprimeNombre(nombre: String, segundoNombre: String = "", apellido: String) {
    println("Mi nombre es $nombre $segundoNombre y mi apellido es $apellido")
  }

  fun myFun(nombre: String, apellido: String): String = nombre + apellido
  imprimeNombre(nombre = "Guillermo", apellido = "Morales")
  // Funciones anónimas
  // El it hace referencia al valor de entrada.
  // Mejor usar un valor explícito.
  val myLambda: (String) -> Int = {
    it.length
  }
  val lambdaEjecutada = myLambda("GUILLERMO MORALES ESPINOZA")
  println(lambdaEjecutada)
  val saludos = listOf("Hello", "Hola", "Ciao")
  val longitudDeSaludos = saludos.map(myLambda)

  // FUNCIONES DE ORDEN SUPERIOR
  // Se va a encargar de ejecutar la LAMBDA
  fun superFuncion(valorInicial: String, block: (String) -> Int): Int {
    return block(valorInicial)
  }

  val largoDelValorInicial = superFuncion("Hola!", block = { valor -> valor.length })
  fun functionInception(nombre: String): () -> String {
    return {
      "Hola desde la lambda $nombre"
    }
  }

  val lambda: () -> String = functionInception("Guillermo")
  val valorLambda: String = lambda()
  println(valorLambda)
  // LET
  var edad: String? = null
  edad?.let { valor -> println("La edad no es nula es $valor") }
  edad = "31"
  edad?.let { valor -> println("La edad no es nula es $valor") }
  // WITH
  // Ayuda a acceder a las propiedades de la variable
  val colores = listOf("Azul", "Amarillo", "Rojo")
  with(colores) {
    println("Nuestros colores son $this")
    println("Esta lista tiene una cantidad de colores de $size")
  }
  // RUN
  // Realizar operaciones en una variable y devolver esa aplicacion.
  val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9").run {
    removeIf { movil -> movil.contains("Google") }
  }
  println(moviles)
  // APPLY
  val movilesApply = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9").apply {
    removeIf { movil -> movil.contains("Google") }
  }
  val coloresList: MutableList<String>? = mutableListOf("Amarillo", "Azul", "Rojo")
  colores.apply {
    println("Nuestros colores son $this")
    println("La cantidad de colores es $size")
  }
  // ALSO
  val movilesAlso = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9").also { lista ->
    println("El valor original de la lista es $lista")
  }.asReversed()
}