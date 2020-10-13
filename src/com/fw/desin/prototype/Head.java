package com.fw.desin.prototype;

import java.io.Serializable;

/**
 * @author zhouffan
 */
public class Head implements Cloneable, Serializable {
        private String name;

        public Head(String name) {
            this.name = name;
        }

        @Override
        protected Object clone(){
            Head head = null;
            try {
                head = (Head) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return head;
        }
    }