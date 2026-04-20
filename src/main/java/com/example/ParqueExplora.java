package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public void mostrarHorario() {
        System.out.println("El horario del Parque Explora es de 9:00 a.m. a 6:00 p.m.");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "La entrada al Parque Explora es gratuita para niños menores de 5 años.";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("La actividad principal del Parque Explora es la exhibición de ciencia y tecnología interactiva.");
    }

}
