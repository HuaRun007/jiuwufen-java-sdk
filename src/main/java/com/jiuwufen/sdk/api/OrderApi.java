package com.jiuwufen.sdk.api;

import com.google.gson.reflect.TypeToken;
import com.jiuwufen.sdk.JiuWuFenClient;
import com.jiuwufen.sdk.exception.ApiException;
import com.jiuwufen.sdk.model.order.*;

import java.lang.reflect.Type;
import java.util.List;

/**
 * 订单管理 API
 */
public class OrderApi {

    private final JiuWuFenClient client;

    public OrderApi(JiuWuFenClient client) {
        this.client = client;
    }

    /**
     * 查询商品订单信息
     */
    public ConsignOrderInfoResponse getConsignOrderInfo(ConsignOrderInfoRequest request) throws ApiException {
        return getConsignOrderInfo(request, 0);
    }

    /** 查询商品订单信息，可指定本次 HTTP 调用的总超时（秒） */
    public ConsignOrderInfoResponse getConsignOrderInfo(ConsignOrderInfoRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/consignOrderInfo/v1.0", request, ConsignOrderInfoResponse.class, timeoutSeconds);
    }

    /**
     * 买家地址查询
     */
    public BuyerAddressResponse getBuyerAddress(BuyerAddressRequest request) throws ApiException {
        return getBuyerAddress(request, 0);
    }

    /** 买家地址查询，可指定本次 HTTP 调用的总超时（秒） */
    public BuyerAddressResponse getBuyerAddress(BuyerAddressRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/order/buyerAddress", request, BuyerAddressResponse.class, timeoutSeconds);
    }

    /**
     * 自送货订单明细查询
     */
    public ConsignBatchOrderListResponse getConsignBatchOrderList(ConsignBatchOrderListRequest request)
            throws ApiException {
        return getConsignBatchOrderList(request, 0);
    }

    /** 自送货订单明细查询，可指定本次 HTTP 调用的总超时（秒） */
    public ConsignBatchOrderListResponse getConsignBatchOrderList(ConsignBatchOrderListRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/consignBatchOrderList/v1.0", request, ConsignBatchOrderListResponse.class, timeoutSeconds);
    }

    /**
     * 获取订单列表（挂售）。接口 {@code data} 为数组，与 {@link HangSaleGetOrderListItem} 列表对应。
     */
    public List<HangSaleGetOrderListItem> getOrderList(GetOrderListRequest request) throws ApiException {
        return getOrderList(request, 0);
    }

    /** 获取订单列表（挂售），可指定本次 HTTP 调用的总超时（秒） */
    public List<HangSaleGetOrderListItem> getOrderList(GetOrderListRequest request, long timeoutSeconds)
            throws ApiException {
        Type dataType = TypeToken.getParameterized(List.class, HangSaleGetOrderListItem.class).getType();
        return client.execute("/api_tob/getOrderList/v1.0", request, dataType, timeoutSeconds);
    }
}
