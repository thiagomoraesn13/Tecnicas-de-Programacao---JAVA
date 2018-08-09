package fila;
import java.sql.*;

public class PrincipalDAO extends BancoDeDados {
    //Listar os pacientes
    public void listapacientes() {
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM dados");
            while (rs.next()) {
                System.out.println("Nome " + rs.getString(1) + "\nCPF " + rs.getString(2) + "\n RG "
                        + rs.getString(3) + "\n Endereço " + rs.getString(4) + "\n Numero" + rs.getString(5)
                        + "\n Telefone " + rs.getString(6) + "\n Prioridade " + rs.getString(7));
            }
        }catch (SQLException e){
        }
    }
    public boolean adiciona_pacientes(Pessoas p) {
        //adicionar os pacientes
        try {
            Statement st = conexao.createStatement();
            st.executeUpdate("INSERT INTO dados VALUES('"+p.getNome()+"', "+"'"+p.getCpf()+
                    "', "+"'"+p.getRg()+"', "+"'"+p.getEndereco()+"', "+"'"+p.getNumero()+"', " +"'"+p.getTelefone()+"', '"+p.getPri()+"')" );                                       
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
    public boolean marcar(Medico m) {
        //marcar uma consulta
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select *from dados");
            while (rs.next()) {
                if (rs.getString(2).equals(m.getPacintes_cpf())) {
                    st.executeUpdate("insert into exames values ('"+m.getMedico()+"',"
                            +"'"+m.getArea()+"',"+"'"+ m.getPacintes_cpf()+"',"+"'"+ m.getData()+"', '" +m.getHorario()+"')");             
                            return true;
                }
            }
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
     public void lista_medicos() {
         ///listar os pacientes que marcaram uma consulta
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM exames");
            while (rs.next()) {
                System.out.println("Medido " + rs.getString(1) + "\nArea " + rs.getString(2) + "\n Pacientes_CPF "
                        + rs.getString(3) + "\n Data " + rs.getString(4) + "\n Horario" + rs.getString(5));
            }
        } catch (SQLException e) {
        }
    }
     public String lista(String cpf) {
        //retorna dados de um paciente dado um cpf como entrada
        String recebe = "";
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM exames");
            while (rs.next()) {
                if(cpf.equals(rs.getString(3))){
                recebe =recebe+" Medico :"+ " "+ rs.getString(1)+"\n"+" Área: "+
                        rs.getString(2)+" " +"\n CPF_PACIENTE: "+rs.getString(3)+" " +
                       "\n Data :"+ rs.getString(4)+""+"\n Horário: "+rs.getString(5);
                   return recebe;
                  }
            }
        } catch (SQLException e) {
        }
       return recebe;
    }
}
