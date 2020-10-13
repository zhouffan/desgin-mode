package com.fw.desin.prototype;

import java.io.*;

/**
 * @Author: 进击的烧年.
 * @Date: 2020/9/18 22:48
 * @Description:  推荐， 利用流来读入，读出
 */
public class SheepDeepRecommend implements Serializable{
    private Head head;
    private String name;

    public SheepDeepRecommend(Head head, String name) {
        this.head = head;
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    protected Object deepClone(){
        SheepDeepRecommend sheepDeepRecommend = null;
        ObjectOutputStream oos = null;
        ByteArrayOutputStream bos = null;
        ObjectInputStream ois = null;
        ByteArrayInputStream bis = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            sheepDeepRecommend = (SheepDeepRecommend) ois.readObject();
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sheepDeepRecommend;
    }

}
