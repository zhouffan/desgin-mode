package com.fw.desin.template.demo2;

import java.util.Map;

/**
 * 请假审批流程
 */
public class LeaveApplyProcess extends BaseProcess {
    /**
     * 校验参数
     *
     * @return
     */
    @Override
    public boolean checkParameter(Map<String,String> paramMap) {

        if(null!=paramMap.get("result")&&paramMap.get("result").equals("true")){
            System.out.println("请假审批单参数校验成功！");
            return true;
        }else {
            System.out.println("请假审批单参数校验成功！");
            return false;
        }

    }

    /**
     * 提醒审批人
     */
    @Override
    public void remindApprovers() {
        System.out.println("有新的请假申请提交了。");
    }
}