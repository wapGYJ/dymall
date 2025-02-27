package com.wapgyj.productservice.controller;


import com.wapgyj.common.Result.Result;
import com.wapgyj.productservice.model.Product;
import com.wapgyj.productservice.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wapGYJ
 * @since 2025-02-02
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/list")
    public Result<List<Product>> list(@RequestParam("page") int page, @RequestParam("pageSize") long pageSize,
                                      @RequestParam("categoryName") String category) {
        return Result.success(productService.listProducts(page, pageSize, category));
    }

    @GetMapping("/{id}")
    public Result<Product> getProduct(@PathVariable("id") Integer id) {
        return Result.success(productService.getById(id));
    }


    @PostMapping("/search")
    public Result<List<Product>> searchProducts(String query) {
        return Result.success(productService.searchProducts(query));
    }
}
