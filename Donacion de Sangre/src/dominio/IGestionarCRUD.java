/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author danni
 */

public interface IGestionarCRUD {

    /**
     * Método que permite crear un nuevo Objeto de cualquier clase.
     *
     * @param c1 Es el nuevo Objeto que se va a crear
     *
     * @return Un mensaje para alertar al usuario
     */
    public void crear(Donante c1);

    /**
     * Método que permite modificar el estado de un Objeto
     *
     * @param c1 El Objeto a ser cambiado
     * @param id El id del Objeto a ser cambiado
     *
     * @return Un mensaje para alertar al usuario
     */
    public void actualizar(Donante c1, Integer id);

    /**
     * Método que permite eliminar un Objeto
     *

     * @param nom El id del Objeto a ser eliminado
     *
     * @return Un mensaje para alertar al usuario
     */
    public void borrar(String nom);

    /**
     * Método que permite buscar un Objeto
     *
     * @param id El id del Objeto que se está buscando
     *
     * @return El Objeto encontrado, si el objeto no existe, retorna null
     */
    public String buscarPorId(Integer id);

    /**
     * Método que permita listar un Conjunto de Objetos
     *
     * @return La lista de Objetos almacenados
     */
    // public List listar();

















}
