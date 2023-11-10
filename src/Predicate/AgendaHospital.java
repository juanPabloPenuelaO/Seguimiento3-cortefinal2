package Predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AgendaHospital {
    public static void main(String[] args) {
        List<EjemploPredicate> citas = new ArrayList<>();
        citas.add(new EjemploPredicate("juan", "Dr. Brayan", "Psicologia", true));
        citas.add(new EjemploPredicate("Pablo", "Dr. Diego", "Ginecología", false));
        citas.add(new EjemploPredicate("David", "Dr. Juanes", "Neurología", true));
        citas.add(new EjemploPredicate("Fernando", "Dr. Ana", "Cardiología", true));

        Predicate<EjemploPredicate> cardiologiaPredicate = cita -> cita.getDepartamento().equals("Cardiología")
                && cita.isDisponible();

        System.out.println("Citas disponibles en el departamento de Cardiología:");
        for (EjemploPredicate cita : citas) {
            if (cardiologiaPredicate.test(cita)) {
                System.out.println("Paciente: " + cita.getPaciente() + ", Médico: " + cita.getMedico());
            }
        }
    }
}

