package com.fw.desin.template.demo2;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        //创建请假申请单
        BaseProcess leaveApply = new LeaveApplyProcess();
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("result","true");
        //提交采购申请单
        leaveApply.submitProcess(paramMap);
        //创建差旅申请单
        BaseProcess business = new BusinessTravelProcess();
        paramMap = new HashMap<>();
        paramMap.put("result","false");
        //提交差旅申请单
        business.submitProcess(paramMap);

    }

}