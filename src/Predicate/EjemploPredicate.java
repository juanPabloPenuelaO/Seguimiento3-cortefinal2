package Predicate;

class EjemploPredicate {
    private String paciente;
    private String medico;
    private String departamento;
    private boolean disponible;

    public EjemploPredicate (String paciente, String medico, String departamento, boolean disponible) {
        this.paciente = paciente;
        this.medico = medico;
        this.departamento = departamento;
        this.disponible = disponible;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMedico() {
        return medico;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean isDisponible() {
        return disponible;
    }
}

