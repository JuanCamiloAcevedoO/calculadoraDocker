/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.puj.aes.servicesImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author USUARIO1
 */
@Path("/calculator")
public class CalculadoraService {

    @GET
    @Path("/add" + "{numeros:(/?(-?[0-9]+)*|(-?[0-9]+).[0-9]+)*}")
    public String add(@PathParam("numeros") String numeros) {
        String[] arreglo = numeros.split("/");
        String retorno = "";
        if (arreglo.length <= 0) {
            retorno = "No hay parametros";
        } else if (arreglo.length == 2) {
            retorno = arreglo[1].equals("") ? "No hay parametros" : "El resultado es: " + arreglo[1];
        } else {
            try {
                Double suma = 0.0;
                for (int i = 1; i < arreglo.length; i++) {
                    if (i == 1) {
                        suma = Double.valueOf(arreglo[1]) + Double.valueOf(arreglo[2]);
                        i++;
                    } else {
                        suma = suma + Double.valueOf(arreglo[i]);
                    }
                }
                retorno = "El resultado es: " + suma;
            } catch (Exception e) {
                retorno = "Error al ejecutar la operación";
            }
        }
        return retorno;
    }

    @GET
    @Path("/subs" + "{numeros:(/?(-?[0-9]+)*|(-?[0-9]+).[0-9]+)*}")
    public String subs(@PathParam("numeros") String numeros) {
        String[] arreglo = numeros.split("/");
        String retorno = "";
        if (arreglo.length <= 0) {
            retorno = "No hay parametros";
        } else if (arreglo.length == 2) {
            retorno = arreglo[1].equals("") ? "No hay parametros" : "El resultado es: " + arreglo[1];
        } else {
            try {
                Double resta = 0.0;
                for (int i = 1; i < arreglo.length; i++) {
                    if (i == 1) {
                        resta = Double.valueOf(arreglo[1]) - Double.valueOf(arreglo[2]);
                        i++;
                    } else {
                        resta = resta - Double.valueOf(arreglo[i]);
                    }
                }
                retorno = "El resultado es: " + resta;
            } catch (Exception e) {
                retorno = "Error al ejecutar la operación";
            }
        }
        return retorno;
    }

    @GET
    @Path("/mult" + "{numeros:(/?(-?[0-9]+)*|(-?[0-9]+).[0-9]+)*}")
    public String mult(@PathParam("numeros") String numeros) {
        String[] arreglo = numeros.split("/");
        String retorno = "";
        if (arreglo.length <= 0) {
            retorno = "No hay parametros";
        } else if (arreglo.length == 2) {
            retorno = arreglo[1].equals("") ? "No hay parametros" : "El resultado es: " + arreglo[1];
        } else {
            try {
                Double mult = 0.0;
                for (int i = 1; i < arreglo.length; i++) {
                    if (i == 1) {
                        mult = Double.valueOf(arreglo[1]) * Double.valueOf(arreglo[2]);
                        i++;
                    } else {
                        mult = mult * Double.valueOf(arreglo[i]);
                    }
                }
                retorno = "El resultado es: " + mult;
            } catch (Exception e) {
                retorno = "Error al ejecutar la operación";
            }
        }
        return retorno;
    }

    @GET
    @Path("/div" + "{numeros:(/?(-?[0-9]+)*|(-?[0-9]+).[0-9]+)*}")
    public String div(@PathParam("numeros") String numeros) {
        String[] arreglo = numeros.split("/");
        String retorno = "";
        if (arreglo.length <= 0) {
            retorno = "No hay parametros";
        } else if (arreglo.length == 2) {
            retorno = arreglo[1].equals("") ? "No hay parametros" : "El resultado es: " + arreglo[1];
        } else {
            try {
                Double div = 0.0;
                for (int i = 1; i < arreglo.length; i++) {
                    if (i == 1) {
                        div = Double.valueOf(arreglo[1]) / Double.valueOf(arreglo[2]);
                        i++;
                    } else {
                        div = div / Double.valueOf(arreglo[i]);
                    }
                }
                retorno = "El resultado es: " + div;
            } catch (Exception e) {
                retorno = "Error al ejecutar la operación";
            }
        }
        return retorno;
    }
}
