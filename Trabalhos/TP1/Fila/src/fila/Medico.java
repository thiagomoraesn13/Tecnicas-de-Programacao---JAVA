package fila;
//clase para Marcar uma consulta com cada medico especifico
public class Medico {
    private String medico;
    private String area;
    private String pacintes_cpf;
    private String data;
    private String horario;

    public Medico(String medico, String area, String pacintes_cpf, String data, String horario) {
        this.medico = medico;
        this.area = area;
        this.pacintes_cpf = pacintes_cpf;
        this.data = data;
        this.horario = horario;
    }
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public String getPacintes_cpf() {
        return pacintes_cpf;
    }
    public void setPacintes_cpf(String pacintes_cpf) {
        this.pacintes_cpf = pacintes_cpf;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
