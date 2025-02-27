package com.wapgyj.cartservice.grpc;

import com.wapgyj.cartservice.model.CartItems;
import com.wapgyj.cartservice.service.ICartService;
import com.wapgyj.common.proto.CartProto;
import com.wapgyj.common.proto.CartServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;



@GrpcService
public class CartGrpcService extends CartServiceGrpc.CartServiceImplBase {

    private final ICartService cartService;

    public CartGrpcService(ICartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public void addItem(CartProto.AddItemReq request, StreamObserver<CartProto.AddItemResp> responseObserver) {
        int productId = request.getItem().getProductId();
        int quantity = request.getItem().getQuantity();
        int userId = request.getUserId();
        boolean b = cartService.addItem(userId, productId, quantity);

        CartProto.AddItemResp build = CartProto.AddItemResp.newBuilder().build();

        responseObserver.onNext(build);
        responseObserver.onCompleted();

    }

    @Override
    public void getCart(CartProto.GetCartReq request, StreamObserver<CartProto.GetCartResp> responseObserver) {
        int userId = request.getUserId();

        CartProto.GetCartResp.Builder builder = CartProto.GetCartResp.newBuilder();
        CartProto.Cart.Builder cartBuilder = CartProto.Cart.newBuilder();
        for (CartItems cartItem : cartService.getCartItems(userId)) {

            CartProto.CartItem.Builder cartItemBuilder = CartProto.CartItem.newBuilder()
                    .setProductId(cartItem.getProductId())
                    .setQuantity(cartItem.getQuantity());
            cartBuilder.addItems(cartItemBuilder.build());
        }
        builder.setCart(cartBuilder.build());

        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void emptyCart(CartProto.EmptyCartReq request, StreamObserver<CartProto.EmptyCartResp> responseObserver) {
        int userId = request.getUserId();

        boolean b = cartService.emptyCart(userId);

        CartProto.EmptyCartResp build = CartProto.EmptyCartResp.newBuilder().build();

        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }
}
