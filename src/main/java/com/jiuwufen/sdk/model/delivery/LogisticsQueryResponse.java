package com.jiuwufen.sdk.model.delivery;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import java.util.List;

/**
 * 物流轨迹查询结果，仅对应公共响应中的 data
 */
@Data
public class LogisticsQueryResponse {

    /** 物流节点列表 */
    @SerializedName("items")
    private List<Item> items;

    /** 单个物流节点的说明、操作时间和位置信息 */
    @Data
    public static class Item {

        /** 物流节点说明 */
        @SerializedName("desc")
        private String desc;

        /** 操作时间，保留平台返回的字符串格式 */
        @SerializedName("time")
        private String time;

        /** 位置信息，接口未定义内部字段，保留原始对象 */
        @SerializedName("location")
        private JsonObject location;
    }
}
