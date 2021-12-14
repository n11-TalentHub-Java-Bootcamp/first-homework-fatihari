package com.fatihari.homework1.dao;

import java.math.BigDecimal;
import java.util.List;

import com.fatihari.homework1.dto.ProductDetailDTO;
import com.fatihari.homework1.entity.Product;

public interface IProductDAO 
{
	public List<Product> findAll();
	public Product findById(Long productId);
	public List<Product> findAllProductListByPrice(BigDecimal priceGe, BigDecimal priceLe);
	public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe);
	public List<Product> findAllProductByCategoryRefractive(Long refractive);
	public List<ProductDetailDTO> findAllProductDetailDtoByCategoryRefractive(Long refractive);
}
