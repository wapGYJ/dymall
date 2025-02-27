package com.wapgyj.productservice.service;

import com.wapgyj.productservice.model.Product;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-02
 */
public interface IProductService extends IService<Product> {
    List<Product> listProducts(int page, long pageSize, String category);

    List<Product> searchProducts(String query);
}
