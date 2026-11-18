package com.jiuwufen.sdk.api;

import com.jiuwufen.sdk.JiuWuFenClient;
import com.jiuwufen.sdk.exception.ApiException;
import com.jiuwufen.sdk.model.inventory.*;

/**
 * 库存管理 API
 */
public class InventoryApi {

    private final JiuWuFenClient client;

    public InventoryApi(JiuWuFenClient client) {
        this.client = client;
    }

    /**
     * 库存同步
     */
    public InventorySyncResponse syncInventory(InventorySyncRequest request) throws ApiException {
        return syncInventory(request, 0);
    }

    /** 库存同步，可指定本次 HTTP 调用的总超时（秒） */
    public InventorySyncResponse syncInventory(InventorySyncRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/inventory/sync/v1.0", request, InventorySyncResponse.class, timeoutSeconds);
    }

    /**
     * 库存查询
     */
    public InventoryListResponse getInventoryList(InventoryListRequest request) throws ApiException {
        return getInventoryList(request, 0);
    }

    /** 库存查询，可指定本次 HTTP 调用的总超时（秒） */
    public InventoryListResponse getInventoryList(InventoryListRequest request, long timeoutSeconds)
            throws ApiException {
        return client.execute("/api_tob/inventory/list/v1.0", request, InventoryListResponse.class, timeoutSeconds);
    }

    /**
     * 同步库存（上下架）
     */
    public UpdateStockResponse updateStock(UpdateStockRequest request) throws ApiException {
        return updateStock(request, 0);
    }

    /** 同步库存（上下架），可指定本次 HTTP 调用的总超时（秒） */
    public UpdateStockResponse updateStock(UpdateStockRequest request, long timeoutSeconds) throws ApiException {
        return client.execute("/api_tob/updateStock/v1.0", request, UpdateStockResponse.class, timeoutSeconds);
    }
}
