package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("El horario del Museo de Antioquia es de 10:00 a.m. a 6:00 p.m.");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "La entrada al Museo de Antioquia es gratuita para niños menores de 12 años.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("La actividad principal del Museo de Antioquia es la exhibición de arte y cultura antioqueña.");
    }

}
