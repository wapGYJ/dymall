package com.wapgyj.productservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wapgyj.productservice.model.Product;
import com.wapgyj.productservice.mapper.ProductMapper;
import com.wapgyj.productservice.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-02
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {
    @Override
    public List<Product> listProducts(int page, long pageSize, String category) {


       //创建分页对象
        Page<Product> productPage = new Page<Product>(page, pageSize).
                addOrder(new OrderItem().setColumn("id").setAsc(true));
        // 构建查询条件
        QueryWrapper<Product> queryWrapper = new QueryWrapper<Product>().like("categories", category);

        //查询
        Page<Product> pageAfter = this.page(productPage, queryWrapper);

        return pageAfter.getRecords();

    }


    @Override
    public List<Product> searchProducts(String query) {

      if (query==null){return null;}
        QueryWrapper<Product> queryWrapper = new QueryWrapper<Product>().like("name", query).or().
                like("description", query).or().like("categories", query);


        return this.list(queryWrapper);
    }
}




