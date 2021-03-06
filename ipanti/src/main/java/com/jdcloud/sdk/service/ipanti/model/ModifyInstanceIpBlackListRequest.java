/*
 * Copyright 2018-2025 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Ip高防实例相关接口
 * Ip高防实例相关接口，以及转发配置中实例级别的接口等
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置实例ip黑名单
 */
public class ModifyInstanceIpBlackListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ip黑名单列表
     */
    private List<String> ipBlackList;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例id
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get ip黑名单列表
     *
     * @return
     */
    public List<String> getIpBlackList() {
        return ipBlackList;
    }

    /**
     * set ip黑名单列表
     *
     * @param ipBlackList
     */
    public void setIpBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set ip黑名单列表
     *
     * @param ipBlackList
     */
    public ModifyInstanceIpBlackListRequest ipBlackList(List<String> ipBlackList) {
        this.ipBlackList = ipBlackList;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyInstanceIpBlackListRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例id
     *
     * @param instanceId
     */
    public ModifyInstanceIpBlackListRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * add item to ip黑名单列表
     *
     * @param ipBlackList
     */
    public void addIpBlackList(String ipBlackList) {
        if (this.ipBlackList == null) {
            this.ipBlackList = new ArrayList<>();
        }
        this.ipBlackList.add(ipBlackList);
    }

}