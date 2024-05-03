package productcrudapp.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.productdao;
import productcrudapp.model.product;

@Controller
public class maincontroller {
	@Autowired
    private productdao productDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<product> products=productDao.getproducts();
		m.addAttribute("product", products);
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addproduct(Model m) {
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}
	
//	handle add product form
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute product product,HttpServletRequest request) {
		System.out.println(product);
		this.productDao.createProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
//
	@RequestMapping(value="delete/{productId}")
	public RedirectView deleteproduct(@PathVariable("productId") int productid,HttpServletRequest request) {
		this.productDao.deleteproducts(productid);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
