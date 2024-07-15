package com.joyeria.controller;
import lombok.extern.slf4j.Slf4j;
import com.joyeria.service.ProductoService;
import com.joyeria.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author salas
 */

/*Se espera que no se agregen productos desde la pagina principal sino desde
la base de datos, por ende solo se muestran funciones de listado.

//CategoriaController no es necesario, ya que este controller cumple su funcion.
*/
@Controller
@Slf4j
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String inicio(@RequestParam(name = "categoria", required = false, defaultValue = "-1")int categoria, Model model) {
        var productos = productoService.getProductos(categoria);
        var categorias= categoriaService.getCategorias();
        model.addAttribute("productos", productos);
        model.addAttribute("categorias",categorias);
        model.addAttribute("totalProductos", productos.size());
        return "/producto/listado";
    }
    
    //Nota para programador de interfaz
    /*Con tal de poder listar los productos y las categorias se debe ingresar
    un form en el html que retorne el valor de id de la categoria, esto con el fin de filtrar.
    
    para ello se debe utilizar un codigo como el siguiente(refactorizacion puede ser necesaria):
    
     <form th:action="@{/productos/listado}" method="get">
        <label for="categoria">Seleccionar Categoría:</label>
        <select name="categoria" id="categoria">
            <option value="-1">Todas las categorías</option>
           
            <!--Esta seccion actualiza automaticamente los valores de la lista y muestra las categorias disponibles
            <option th:each="categoria : ${categorias}" th:value="${categoria.idCategoria}" th:text="${categoria.nombreCategoria}"></option>
        </select>
        <button type="submit">Filtrar</button>
    </form>

    */
}
