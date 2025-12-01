package Paquete;

public class Prueba {
    // [día][0]=día del año (1..360), [día][1]=0 disponible, 1 ocupado
    private int[][] diasOcupados = new int[360][2];

    public Prueba() {
        // Inicializa los días
        for (int i = 0; i < 360; i++) {
            diasOcupados[i][0] = i + 1; // Día del año
            diasOcupados[i][1] = 0;     // Disponible
        }
    }

    // Marca los días como ocupados para una reservación
    public boolean reservar(int diaInicio, int diaFin) {
        if (validarDisponibilidad(diaInicio, diaFin)) {
            for (int i = diaInicio - 1; i < diaFin; i++) {
                diasOcupados[i][1] = 1;
            }
            return true;
        }
        return false;
    }

    // Valida si todos los días del rango están disponibles
    public boolean validarDisponibilidad(int diaInicio, int diaFin) {
        for (int i = diaInicio - 1; i < diaFin; i++) {
            if (diasOcupados[i][1] == 1) {
                return false;
            }
        }
        return true;
    }

    // Libera los días (por ejemplo, al cancelar una reservación)
    public void liberar(int diaInicio, int diaFin) {
        for (int i = diaInicio - 1; i < diaFin; i++) {
            diasOcupados[i][1] = 0;
        }
    }
}
