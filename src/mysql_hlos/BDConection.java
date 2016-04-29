
package mysql_hlos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConection 
{
    static String bd="EjemploDB";
    static String login="root";
    static String password="";
    static String url="jbdc:mysql://localhost/"+ bd;
    Connection coneccion=null;
    
    public BDConection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            coneccion=DriverManager.getConnection(url, login,password);
            if (coneccion!=null)
            {
                System.out.println("Conección con la BD exitosa");
            }
        } catch(SQLException e)
        {
            System.out.println("Error "+e.getMessage());
        }catch(ClassNotFoundException e )
        {
            System.out.println("Error "+e.getMessage());
        }catch(Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }        
    }
    
    public Connection getConnection()
    {
        return coneccion;
    }
    
    public void  desconectar()
    {
        coneccion=null;
    }
}
