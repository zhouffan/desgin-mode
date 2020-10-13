package com.fw.desin.template.demo2;

import java.util.Map;

/**
 * 流程模板类
 */
public abstract class BaseProcess {

    /**
     * 提交流程
     */
    public void submitProcess(Map<String,String> paramMap){
        boolean checkResult = checkParameter(paramMap);
        if(checkResult){
            System.out.println("提交流程成功！");
            remindApprovers();
        }else {
            System.out.println("提交流程失败！");
        }
    }

    /**
     * 校验参数
     * @return
     */
    public abstract boolean checkParameter(Map<String,String> paramMap);

    /**
     * 提醒审批人
     */
    public abstract void remindApprovers();
}