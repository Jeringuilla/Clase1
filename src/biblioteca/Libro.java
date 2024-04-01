
package biblioteca;


public class Libro {
    
    private int isbn;
    public String titulo; 
    private Categoria categoria; //aquí he hecho un Enum
    public int precio;
    public int nPaginas;
    
    public static int contadorLibros; //este contador llevará la cuenta de libros creados
    
//PRIMER CONSTRUCTOR. Está vacío.
    public Libro() {
        
        
        contadorLibros++; //incrementamos el contador de libros al crear un objeto Libro
    }
    
    
    //SEGUNDO CONSTRUCTOR. Ahora tenemos sobrecarga de constructores y mayor flexibilidad en la creación de objetos.
    public Libro(int isbn, String titulo, Categoria categoria, int precio, int nPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
        this.precio = precio;
        this.nPaginas = nPaginas;
        
        contadorLibros++; //incrementamos el contador de libros al crear un objeto Libro
    }
    
    /* MÉTODOS SETTER - GETTER. Por no complicarme mucho solo he hecho private el ISBN y la Categoría, así que genero getters y setters para ambos.
                                En un programa real encapsularía todos los atributos para una mayor seguridad */
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    /* MÉTODO STATIC CONTADOR */
    
    public static int getContadorLibros() { //este método lo usaremos para ver cuántos libros tenemos en el catálogo
    return contadorLibros;
}
    
    public static void reducirContadorLibros(){ //este método lo usaremos para reducir en 1 el contador si eliminamos un libro
        contadorLibros--;
    }
    
    
    
}
