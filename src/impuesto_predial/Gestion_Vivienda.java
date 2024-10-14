
package impuesto_predial;

import java.util.ArrayList;
import java.util.List;

public class Gestion_Vivienda {
   private List<Vivienda> viviendas;

    public Gestion_Vivienda() {
        viviendas = new ArrayList<>();
    }

    public void registrarVivienda(String matricula, String direccion, String nombrePropietario, String apellidoPropietario, String barrio) {
        Vivienda nuevaVivienda = new Vivienda(matricula, direccion, nombrePropietario, apellidoPropietario, barrio);
        viviendas.add(nuevaVivienda);
    }

    public Vivienda buscarPorMatricula(String matricula) {
        for (int i = 0; i < viviendas.size(); i++) {
            if (viviendas.get(i).getNumeroMatricula().equals(matricula)) {
                return viviendas.get(i);
            }
        }
        return null;
    }

    public List<Vivienda> buscarPorApellido(String apellido) {
        List<Vivienda> resultado = new ArrayList<>();
        for (int i = 0; i < viviendas.size(); i++) {
            if (viviendas.get(i).getApellidoPropietario().equalsIgnoreCase(apellido)) {
                resultado.add(viviendas.get(i));
            }
        }
        return resultado;
    }

    public String[] obtenerMatriculas() {
        String[] matriculas = new String[viviendas.size()];
        for (int i = 0; i < viviendas.size(); i++) {
            matriculas[i] = viviendas.get(i).getNumeroMatricula();
        }
        return matriculas;
    }

    public void ordenarBurbuja(String[] matriculas) {
        int n = matriculas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (matriculas[j].compareTo(matriculas[j + 1]) > 0) {
                    String temp = matriculas[j];
                    matriculas[j] = matriculas[j + 1];
                    matriculas[j + 1] = temp;
                }
            }
        }
    }

    public void ordenarInsercion(String[] matriculas) {
        int n = matriculas.length;
        for (int i = 1; i < n; i++) {
            String key = matriculas[i];
            int j = i - 1;
            while (j >= 0 && matriculas[j].compareTo(key) > 0) {
                matriculas[j + 1] = matriculas[j];
                j--;
            }
            matriculas[j + 1] = key;
        }
    }

    public boolean busquedaBinaria(String[] matriculas, String matriculaBuscada) {
        int izquierda = 0;
        int derecha = matriculas.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (matriculas[medio].equals(matriculaBuscada)) {
                return true;
            }

            if (matriculas[medio].compareTo(matriculaBuscada) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return false;
    }
}

    

