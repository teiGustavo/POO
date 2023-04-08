import java.sql.*;

public class ConexaoMysql 
{
    //IP, PORTA E NOME BD
    public static String URL = "jdbc:mysql://localhost:3306/convenio";

    public static String USER = "root";
    public static String PASSWORD = "root";
    
    //OBJS DE CONEXÃO
    private Connection dbconn = null;
    private Statement sqlmgr = null;
    private ResultSet resultsql = null;

    public void openDB() 
    {
        try {
            dbconn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.printf("%nCONECTADO COM SUCESSO EM: %s%n", URL);
            sqlmgr = dbconn.createStatement();
        } catch (Exception Error) {
            System.out.printf("%nERRO NA CONEXÃO: %s%n", Error.getMessage());
        }
    }

    public void closeDB() throws SQLException 
    {
        sqlmgr.close();
        dbconn.close();
    }

    public ConexaoMysql() 
    {
        this.openDB();
    }

    //RETORNA O NÚMERO DE REGISTROS AFETADOS OU -1 CASO ERRO 
    public int executaQuery(String sql) 
    {
        try {
            return sqlmgr.executeUpdate(sql);
        } catch (Exception Error) {
            System.out.printf("%nERRO NA CONEXÃO: %s%n", Error.getMessage());
        }

        return -1;
    }

    public ResultSet select(String sql) 
    {
        try {
            resultsql = sqlmgr.executeQuery(sql);
        } catch (Exception Error) {
            System.out.printf("%nERRO NA CONEXÃO: %s%n", Error.getMessage());
        }

        return resultsql;
    }

    public void teste()
    {
        try {
            String sql = "SELECT cod_adm, nome, telefone, cpf, senha FROM administrador";
            ResultSet rst = this.select(sql); 

            while (rst.next()) {
                int id = rst.getInt("cod_adm");
                String nome = rst.getString("nome");
                String telefone = rst.getString("telefone");
                String cpf = rst.getString("cpf");
                String senha = rst.getString("senha");

                System.out.printf("%nID: %d%nNOME: %s%nTELEFONE: %s%nCPF: %s%nSENHA: %s%n", id, nome, telefone, cpf, senha);
            }
        } catch (Exception Error) {
            System.out.printf("%nERRO NA CONEXÃO: %s%n", Error.getMessage());
        }
    }
}
