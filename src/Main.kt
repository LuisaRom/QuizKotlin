import java.util.Scanner

fun main() {

    val producto = mutableListOf<Producto>()
    val scanner = Scanner(System.`in`)

    while (true){

        println("\n TIENDA")
        println("1. Crear Producto")
        println("2. Vender Producto")
        println("3. Reponer Stock")
        println("4. Aplicar Descuento")
        println("5. Informacion Productos")
        println("6. Aumentar Precio")
        println("7. Calcular Total Inventario")
        println("8. Eliminar Producto Por Codigo")
        println("9. Salir")
        println("Seleccione una Opcion:")

        when (scanner.nextInt()) {
            1 -> {
                print("Ingrese código del producto: ")
                val codigo = scanner.next()
                print("Ingrese nombre del producto: ")
                val nombre = scanner.next()
                print("Ingrese precio del producto: ")
                val precio = scanner.nextDouble()
                print("Ingrese cantidad del producto: ")
                val stock = scanner.nextInt()
                producto.add(Producto(codigo, nombre, precio, stock))
                println("Producto agregado correctamente.")
            }
            2 -> {
                print("Ingrese código del producto a vender: ")
                val codigo = scanner.next()
                val producto = producto.find { it.codigo == codigo }
                if (producto != null) {
                    print("Ingrese cantidad a vender: ")
                    val cantidad = scanner.nextInt()
                    producto.vender(cantidad)
                } else {
                    println("Producto no encontrado.")
                }
            }
            3 -> {
                print("Ingrese código del producto a ingresar: ")
                val codigo = scanner.next()
                val producto = producto.find { it.codigo == codigo }
                if (producto != null) {
                    print("Ingrese cantidad a ingresar: ")
                    val cantidad = scanner.nextInt()
                    producto.reponerStock(cantidad)
                } else {
                    println("Producto no encontrado.")
                }
            }
            4 -> {
                print("Ingrese código del producto para aplicar descuento: ")
                val codigo = scanner.next()
                val producto = producto.find { it.codigo == codigo }
                if (producto != null) {
                    producto.aplicarDescuento()
                } else {
                    println("Producto no encontrado.")
                }
            }
            5 -> {
                if (producto.isEmpty()) {
                    println("No hay productos en inventario.")
                } else {
                    producto.forEach { it.mostrarInformacion() }
                }
            }
            6 -> {
                print("Ingrese código del producto para aumentar el precio: ")
                val codigo = scanner.next()
                val producto = producto.find { it.codigo == codigo }
                if (producto != null) {
                    producto.aumentarPrecio()
                } else {
                    println("Producto no encontrado.")
                }
            }
            7 -> {
                var totalInventario = 0.0
                producto.forEach { totalInventario += it.calcularValorTotalInventario() }
                println("El valor total del inventario es: $totalInventario")
            }
            8 -> {
                print("Ingrese código del producto a eliminar: ")
                val codigo = scanner.next()
                val eliminar = producto.removeIf { it.codigo == codigo }
                if (eliminar) {
                    println("Producto eliminado correctamente.")
                } else {
                    println("Producto no encontrado.")
                }
            }
            9 -> {
                println("Saliendo del sistema")
                break
            }
            else -> println("Opción no válida")
        }
    }
}