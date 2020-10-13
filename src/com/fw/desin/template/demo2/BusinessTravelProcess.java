package com.fw.desin.template.demo2;

import java.util.Map;

/**
 * 差旅审批流程
 *
 */
public class BusinessTravelProcess extends BaseProcess{
    /**
     * 校验参数
     *
     * @return
     */
    @Override
    public boolean checkParameter(Map<String,String> paramMap) {

        if(null!=paramMap.get("result")&&paramMap.get("result").equals("true")){
            System.out.println("差旅审批单参数校验成功！");
            return true;
        }else {
            System.out.println("差旅审批单参数校验失败！");
            return false;
        }
    }

    /**
     * 提醒审批人
     */
    @Override
    public void remindApprovers() {
        System.out.println("有新的差旅申请提交了。");
    }
}