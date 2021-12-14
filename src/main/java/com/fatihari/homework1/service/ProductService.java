package com.fatihari.homework1.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatihari.homework1.dao.IProductDAO;
import com.fatihari.homework1.dao.ProductDAO;
import com.fatihari.homework1.dto.ProductDetailDTO;
import com.fatihari.homework1.entity.Product;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductDAO iProductDAO;
	
	@Autowired
	public ProductService() {
		this.iProductDAO = new ProductDAO();
	}
	
	@Override
	public List<Product> findAll() 
	{
		return this.iProductDAO.findAll();
	}

	@Override
	public Product findById(Long productId) {
		return this.iProductDAO.findById(productId);
	}

	@Override
	public List<Product> findAllProductListByPrice(BigDecimal priceGe, BigDecimal priceLe) 
	{	
		return this.iProductDAO.findAllProductListByPrice(priceGe, priceLe);
	}

	@Override
	public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe) 
	{
		return this.iProductDAO.findAllProductListByPriceBetween(priceGe, priceLe);
	}

	@Override
	public List<Product> findAllProductByCategoryRefractive(Long refractive) 
	{
		return this.iProductDAO.findAllProductByCategoryRefractive(refractive);
	}

	@Override
	public List<ProductDetailDTO> findAllProductDetailDtoByCategoryRefractive(Long refractive) {
		return this.iProductDAO.findAllProductDetailDtoByCategoryRefractive(refractive);
	}
}
