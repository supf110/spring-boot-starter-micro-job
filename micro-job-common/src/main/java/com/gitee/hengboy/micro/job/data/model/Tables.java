/*
 * This file is generated by jOOQ.
 */
package com.gitee.hengboy.micro.job.data.model;


import com.gitee.hengboy.micro.job.data.model.tables.JobNodeExecuteDetail;
import com.gitee.hengboy.micro.job.data.model.tables.JobNodeInfo;
import com.gitee.hengboy.micro.job.data.model.tables.JobNodeTriggerInfo;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in fission
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 任务执行详情信息表
     */
    public static final JobNodeExecuteDetail JOB_NODE_EXECUTE_DETAIL = JobNodeExecuteDetail.JOB_NODE_EXECUTE_DETAIL;

    /**
     * 任务节点信息
     */
    public static final JobNodeInfo JOB_NODE_INFO = JobNodeInfo.JOB_NODE_INFO;

    /**
     * 节点任务信息
     */
    public static final JobNodeTriggerInfo JOB_NODE_TRIGGER_INFO = JobNodeTriggerInfo.JOB_NODE_TRIGGER_INFO;
}