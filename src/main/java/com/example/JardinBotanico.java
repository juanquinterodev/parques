package com.example;

public class JardinBotanico implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("El horario del Jardín Botánico es de 9:00 a.m. a 5:00 p.m.");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "La entrada al Jardín Botánico es gratuita para niños menores de 12 años.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("La actividad principal del Jardín Botánico es la exhibición de una gran variedad de plantas y flores.");
    }

}
