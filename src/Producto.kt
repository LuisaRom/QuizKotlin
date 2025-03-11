import java.util.*

class Producto {

    var codigo: String = ""
    var nombre: String = ""
    var precio: Double = 0.0
    var cantidad: Int = 0


    constructor()
    constructor(codigo: String, nombre: String, precio: Double, cantidad: Int) {
        this.codigo = codigo
        this.nombre = nombre
        this.precio = precio
        this.cantidad = cantidad
    }

    override fun toString(): String {
        return "Producto(codigo='$codigo', nombre='$nombre', precio=$precio, cantidad=$cantidad)"
    }

    fun crearProducto(scanner: Scanner, productos: MutableList<Producto>) {
        print("Ingrese código del producto: ")
        if (productos.any { it.codigo == codigo }) {
            println("Ya existe un producto con ese código.")
            return
        }
        print("Ingrese nombre del producto: ")
        print("Ingrese precio del producto: ")
        print("Ingrese cantidad en stock: ")
        productos.add(Producto(codigo, nombre, precio, cantidad))
        println("Producto agregado correctamente.")
    }

    fun vender(cantidad: Int) {
        if (cantidad <= cantidad) {
            this.cantidad -= cantidad
            println("Producto Vendido")
        } else {
            println("Producto Agotado")
        }
    }

    fun reponerStock(cantidad: Int) {
        this.cantidad += cantidad
        println("Producto Agregado. Stock actual: $cantidad")
    }

    fun aplicarDescuento() {
        precio -= precio * 0.02
        println("Descuento del 2%. Nuevo precio: $precio")
    }

    fun mostrarInformacion() {
        println("Código: $codigo | Nombre: $nombre | Precio: $precio | Stock: $cantidad")
    }

    fun aumentarPrecio() {
        precio += precio * 0.06
        println("Se aumentó el precio en un 6%. Nuevo precio: $precio")
    }

    fun calcularValorTotalInventario(): Double {
        val total = cantidad * precio
        println("El valor total en inventario de $nombre es: $total")
        return total
    }

    fun eliminar(scanner: Scanner, productos: MutableList<Producto>) {
        println("Ingresar Codigo Producto:")
        val eliminar = productos.removeIf { it.codigo == codigo }
        if (eliminar) {
            println("Prodcuto Eliminado")
        } else {
            println("Producto no encontrado")
        }
    }
}

