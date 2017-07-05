package service;

import java.sql.SQLException;
import java.util.List;

import Dao.ProductDao;
import domain.Product;

public class ProductService {

	public List<Product> findAll() throws SQLException {
		
		return new ProductDao().findAll();
	}

}
