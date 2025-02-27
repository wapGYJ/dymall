package com.wapgyj.productservice.grpc;



import com.wapgyj.common.proto.ProductCatalogServiceGrpc;

import com.wapgyj.common.proto.ProductProto;
import com.wapgyj.productservice.model.Product;
import com.wapgyj.productservice.service.IProductService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class ProductGrpcService extends ProductCatalogServiceGrpc.ProductCatalogServiceImplBase {

    private final IProductService productService;

    public ProductGrpcService(IProductService productService) {
        this.productService = productService;
    }

    @Override
    public void listProducts(ProductProto.ListProductsReq request, StreamObserver<ProductProto.ListProductsResp> responseObserver) {
       //获取请求参数
        int page = request.getPage();
        long pageSize = request.getPageSize();
        String categoryName = request.getCategoryName();
        //调用service
        List<Product> products = productService.listProducts(page, pageSize, categoryName);
        // 构建 ListProductsResp
        ProductProto.ListProductsResp.Builder responseBuilder = ProductProto.ListProductsResp.newBuilder();

        // 将 Product 转换为 ProductProto.Product 并加入到 ListProductsResp
        for (Product product : products) {
            ProductProto.Product.Builder productBuilder = ProductProto.Product.newBuilder()
                    .setId(product.getId())
                    .setName(product.getName())
                    .setPrice(product.getPrice())
                    .setDescription(product.getDescription())
                    .setPicture(product.getPicture())
                    .setStock(product.getStock())
                    .addCategories(product.getCategories().toString());

            responseBuilder.addProducts(productBuilder.build());
        }

        // 发送响应
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getProduct(ProductProto.GetProductReq request, StreamObserver<ProductProto.GetProductResp> responseObserver) {
        int id = request.getId();
        Product product = productService.getById(id);

        ProductProto.GetProductResp.Builder builder = ProductProto.GetProductResp.newBuilder();

        if (product != null) {
            ProductProto.Product.Builder productBuilder = ProductProto.Product.newBuilder()
                    .setId(product.getId())
                    .setName(product.getName())
                    .setPrice(product.getPrice())
                    .setDescription(product.getDescription())
                    .setPicture(product.getPicture())
                    .setStock(product.getStock())
                    .addCategories(product.getCategories().toString());

            builder.setProduct(productBuilder.build());
        }
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();

    }

    @Override
    public void searchProducts(ProductProto.SearchProductsReq request, StreamObserver<ProductProto.SearchProductsResp> responseObserver) {
        String query = request.getQuery();

        ProductProto.SearchProductsResp.Builder builder = ProductProto.SearchProductsResp.newBuilder();
        for (Product product : productService.searchProducts(query)) {
            ProductProto.Product.Builder productBuilder = ProductProto.Product.newBuilder();
            productBuilder.setId(product.getId())
                    .setName(product.getName())
                    .setPrice(product.getPrice())
                    .setDescription(product.getDescription())
                    .setPicture(product.getPicture())
                    .setStock(product.getStock())
                    .addCategories(product.getCategories().toString());

            builder.addResults(productBuilder.build());
        }
       responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }
}
