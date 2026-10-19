package com.jiuwufen.sdk.api;

import com.jiuwufen.sdk.JiuWuFenClient;
import com.jiuwufen.sdk.exception.ApiException;
import com.jiuwufen.sdk.model.assignblame.AssignBlameListRequest;
import com.jiuwufen.sdk.model.assignblame.AssignBlameListResponse;

/**
 * 数码判责 API
 */
public class AssignBlameApi {

    /**
     * 数码判责单信息查询接口路径。
     * <p>
     * 注意：平台端点为 {@code assignBlameLst}（缺少 "i"）
     */
    private static final String ASSIGN_BLAME_LIST_PATH = "/api_tob/assignBlameLst/v1.0";

    private final JiuWuFenClient client;

    public AssignBlameApi(JiuWuFenClient client) {
        this.client = client;
    }

    /**
     * 数码判责单信息查询 (AssignBlameLst)
     *
     * @param request 查询请求（起止时间、分页参数）
     * @return 判责单列表及总数
     */
    public AssignBlameListResponse assignBlameList(AssignBlameListRequest request) throws ApiException {
        return client.execute(ASSIGN_BLAME_LIST_PATH, request, AssignBlameListResponse.class);
    }
}
