package Dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import domain.Product;
import utils.DataSourceUtils;

public class ProductDao {

	public List<Product> findAll() throws SQLException {
		
		//����queryrunner
		
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		//��дsql
		String sql = "select * from product";
		//ִ��sql
		
		return qr.query(sql, new BeanListHandler<Product>(Product.class));
	}
	
}
