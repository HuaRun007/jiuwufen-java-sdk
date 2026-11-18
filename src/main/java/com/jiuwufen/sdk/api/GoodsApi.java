package com.jiuwufen.sdk.api;

import com.jiuwufen.sdk.JiuWuFenClient;
import com.jiuwufen.sdk.exception.ApiException;
import com.jiuwufen.sdk.model.goods.*;

/**
 * 商品管理 API
 * 
 * @author 95分开放平台团队
 * @version 1.0.0
 */
public class GoodsApi {

    private final JiuWuFenClient client;

    public GoodsApi(JiuWuFenClient client) {
        this.client = client;
    }

    /**
     * 查询SKU列表（绑定关系）
     */
    public MerchantSkuListResponse getMerchantSkuList(MerchantSkuListRequest request) throws ApiException {
        return getMerchantSkuList(request, 0);
    }

    /** 查询SKU列表（绑定关系），可指定本次 HTTP 调用的总超时（秒） */
    public MerchantSkuListResponse getMerchantSkuList(MerchantSkuListRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/merchantSkuList/v1.0", request, MerchantSkuListResponse.class, timeoutSeconds);
    }

    /**
     * 查询SKU列表（通用）
     */
    public SkuListResponse getSkuList(SkuListRequest request) throws ApiException {
        return getSkuList(request, 0);
    }

    /** 查询SKU列表（通用），可指定本次 HTTP 调用的总超时（秒） */
    public SkuListResponse getSkuList(SkuListRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/skuList/v1.0", request, SkuListResponse.class, timeoutSeconds);
    }

    /**
     * 新增商品
     */
    public AddOrderGoodsResponse addOrderGoods(AddOrderGoodsRequest request) throws ApiException {
        return addOrderGoods(request, 0);
    }

    /** 新增商品，可指定本次 HTTP 调用的总超时（秒） */
    public AddOrderGoodsResponse addOrderGoods(AddOrderGoodsRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/addOrderGoods/v1.0", request, AddOrderGoodsResponse.class, timeoutSeconds);
    }

    /**
     * 查询商品状态信息
     */
    public GoodsInfoResponse getGoodsInfo(GoodsInfoRequest request) throws ApiException {
        return getGoodsInfo(request, 0);
    }

    /** 查询商品状态信息，可指定本次 HTTP 调用的总超时（秒） */
    public GoodsInfoResponse getGoodsInfo(GoodsInfoRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/goodsInfo/v1.0", request, GoodsInfoResponse.class, timeoutSeconds);
    }

    /**
     * 改价
     */
    public UpdatePriceResponse updatePrice(UpdatePriceRequest request) throws ApiException {
        return updatePrice(request, 0);
    }

    /** 改价，可指定本次 HTTP 调用的总超时（秒） */
    public UpdatePriceResponse updatePrice(UpdatePriceRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/updatePrice/v1.0", request, UpdatePriceResponse.class, timeoutSeconds);
    }

    /**
     * 下架商品
     */
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws ApiException {
        return cancelOrder(request, 0);
    }

    /** 下架商品，可指定本次 HTTP 调用的总超时（秒） */
    public CancelOrderResponse cancelOrder(CancelOrderRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/cancelOrder/v1.0", request, CancelOrderResponse.class, timeoutSeconds);
    }

    /**
     * 卖家议价
     */
    public UpdateSellerBargainResponse updateSellerBargain(UpdateSellerBargainRequest request) throws ApiException {
        return updateSellerBargain(request, 0);
    }

    /** 卖家议价，可指定本次 HTTP 调用的总超时（秒） */
    public UpdateSellerBargainResponse updateSellerBargain(UpdateSellerBargainRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/updateSellerBargain/v1.0", request, UpdateSellerBargainResponse.class, timeoutSeconds);
    }

    /**
     * 卖家接受还价
     */
    public BargainSuccessResponse bargainSuccess(BargainSuccessRequest request) throws ApiException {
        return bargainSuccess(request, 0);
    }

    /** 卖家接受还价，可指定本次 HTTP 调用的总超时（秒） */
    public BargainSuccessResponse bargainSuccess(BargainSuccessRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/bargainSuccess/v1.0", request, BargainSuccessResponse.class, timeoutSeconds);
    }

    /**
     * 获取类目属性
     */
    public QueryPropertiesResponse queryProperties(QueryPropertiesRequest request) throws ApiException {
        return queryProperties(request, 0);
    }

    /** 获取类目属性，可指定本次 HTTP 调用的总超时（秒） */
    public QueryPropertiesResponse queryProperties(QueryPropertiesRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/query_properties/v1.0", request, QueryPropertiesResponse.class, timeoutSeconds);
    }

    /**
     * 可鉴品牌查询
     */
    public GetBrandIdentifyAbilityResponse getBrandIdentifyAbility(GetBrandIdentifyAbilityRequest request)
            throws ApiException {
        return getBrandIdentifyAbility(request, 0);
    }

    /** 可鉴品牌查询，可指定本次 HTTP 调用的总超时（秒） */
    public GetBrandIdentifyAbilityResponse getBrandIdentifyAbility(GetBrandIdentifyAbilityRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/get_brand_identify_ability/v1.0", request,
                GetBrandIdentifyAbilityResponse.class, timeoutSeconds);
    }

    /**
     * 复制订单上架
     */
    public CopyOnSaleResponse copyOnSale(CopyOnSaleRequest request) throws ApiException {
        return copyOnSale(request, 0);
    }

    /** 复制订单上架，可指定本次 HTTP 调用的总超时（秒） */
    public CopyOnSaleResponse copyOnSale(CopyOnSaleRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/copyOnSale/v1.0", request, CopyOnSaleResponse.class, timeoutSeconds);
    }

    /**
     * 订单参考价查询
     */
    public ReferencePriceResponse getReferencePrice(ReferencePriceRequest request) throws ApiException {
        return getReferencePrice(request, 0);
    }

    /** 订单参考价查询，可指定本次 HTTP 调用的总超时（秒） */
    public ReferencePriceResponse getReferencePrice(ReferencePriceRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/referencePrice/v1.0", request, ReferencePriceResponse.class, timeoutSeconds);
    }
}
