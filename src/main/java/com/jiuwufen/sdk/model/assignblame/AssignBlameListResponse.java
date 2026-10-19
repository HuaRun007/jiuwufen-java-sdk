package com.jiuwufen.sdk.model.assignblame;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * 数码判责单信息查询 (AssignBlameLst) 响应
 */
@Data
public class AssignBlameListResponse {

    /**
     * 判责列表数据
     */
    @SerializedName("list")
    private List<AssignBlameItem> list;

    /**
     * 总记录数
     */
    @SerializedName("total")
    private Integer total;

    /**
     * 判责详情
     */
    @Data
    public static class AssignBlameItem {

        /**
         * 判责单号
         */
        @SerializedName("assign_blame_number")
        private String assignBlameNumber;

        /**
         * 客退单号或后验单号
         */
        @SerializedName("order_number")
        private String orderNumber;

        /**
         * 卖家单号
         */
        @SerializedName("seller_order_number")
        private String sellerOrderNumber;

        /**
         * 商品编码
         */
        @SerializedName("goods_sn")
        private String goodsSn;

        /**
         * 判责场景 1客退判责 2后验判责
         */
        @SerializedName("scene")
        private Integer scene;

        /**
         * 判责发起时间
         */
        @SerializedName("assign_blame_time")
        private String assignBlameTime;

        /**
         * 商品名称
         */
        @SerializedName("title")
        private String title;

        /**
         * 货号
         */
        @SerializedName("code")
        private String code;

        /**
         * 规格
         */
        @SerializedName("size")
        private String size;

        /**
         * 成色
         */
        @SerializedName("is_new")
        private String isNew;

        /**
         * IMEI码
         */
        @SerializedName("imei")
        private String imei;

        /**
         * 问题模块
         */
        @SerializedName("question_module")
        private String questionModule;

        /**
         * 问题详情
         */
        @SerializedName("question_detail")
        private String questionDetail;

        /**
         * 处罚金额
         */
        @SerializedName("penalty_amount")
        private String penaltyAmount;

        /**
         * 补充说明
         */
        @SerializedName("assign_blame_desc")
        private String assignBlameDesc;

        /**
         * 判责图片
         */
        @SerializedName("assign_blame_imgs")
        private List<String> assignBlameImgs;

        /**
         * 申诉截止时间
         */
        @SerializedName("appeal_deadline")
        private String appealDeadline;

        /**
         * 申诉时间
         */
        @SerializedName("appeal_time")
        private String appealTime;

        /**
         * 申诉状态 待申诉/申诉中/申诉成功/申诉失败/超时未申诉
         */
        @SerializedName("appeal_status")
        private String appealStatus;

        /**
         * 申诉原因
         */
        @SerializedName("appeal_reason")
        private String appealReason;

        /**
         * 申诉详细说明
         */
        @SerializedName("appeal_desc")
        private String appealDesc;

        /**
         * 申诉图片
         */
        @SerializedName("appeal_imgs")
        private List<String> appealImgs;

        /**
         * 申诉视频
         */
        @SerializedName("appeal_video")
        private List<String> appealVideo;

        /**
         * 审核时间
         */
        @SerializedName("audit_time")
        private String auditTime;

        /**
         * 审核状态
         */
        @SerializedName("audit_status")
        private String auditStatus;

        /**
         * 审核原因
         */
        @SerializedName("audit_reason")
        private String auditReason;

        /**
         * 审核详细说明
         */
        @SerializedName("audit_desc")
        private String auditDesc;

        /**
         * 审核图片
         */
        @SerializedName("audit_imgs")
        private List<String> auditImgs;
    }
}
