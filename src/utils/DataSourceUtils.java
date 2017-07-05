package utils;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {
	//��ȡ����Դ
	private  static ComboPooledDataSource ds=new ComboPooledDataSource();
	
	/**
	 * ��ȡ����Դ
	 * @return
	 */
	public static DataSource getDataSource(){
		return ds;
	}
	/**
	 * ��ȡ����
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	//�ͷ���Դ
	/**
	 * �ͷ�����
	 * @param conn ����
	 * */
	public static void closeConn(Connection conn)
	{
		if(conn!=null)
		{
			try{
				conn.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			conn=null;
		}
	}
	/**
	 * �ͷ�����
	 * @param st ����
	 * */
	public static void closeStatement(Statement st)
	{
		if(st!=null)
		{
			try{
				st.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			st=null;
		}
	}
	/**
	 * �ͷ�����
	 * param rs����� ����
	 * */
	public static void closeResultSet(ResultSet rs)
	{
		if(rs!=null)
		{
			try{
				rs.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			rs=null;
		}
	}
	
}
