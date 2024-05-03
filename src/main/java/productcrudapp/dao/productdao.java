package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.product;

@Component
public class productdao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void createProduct(product product) {
		this.hibernateTemplate.save(product);
	}
	
//	get all products
	public List<product> getproducts() {
		List<product> products=this.hibernateTemplate.loadAll(product.class);
		return products;
	}
	
//delete the single product
	@Transactional
	public void deleteproducts(int pid) {
	 product p=this.hibernateTemplate.load(product.class,pid);
		this.hibernateTemplate.delete(p);
	}
	
	//get the single product
		public product getproduct(int pid) {
		 return this.hibernateTemplate.get(product.class,pid);
		}
}
