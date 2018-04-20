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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * cacheInstance
 */
public class CacheInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String cacheInstanceId;

    /**
     * 实例名称
     */
    private String cacheInstanceName;

    /**
     * 实例规格代码，参见实例规格代码表
     */
    private String cacheInstanceClass;

    /**
     * 容量，单位MB
     */
    private Integer cacheInstanceMemoryMB;

    /**
     * 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，deleting：删除中
     */
    private String cacheInstancStatus;

    /**
     * 实例描述
     */
    private String cacheInstanceDescription;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * az信息
     */
    private AzId azId;

    /**
     * 所属VPC的ID
     */
    private String vpcId;

    /**
     * 所属子网的ID
     */
    private String subnetId;

    /**
     * 访问域名
     */
    private String connectionDomain;

    /**
     * 端口
     */
    private Integer port;

    /**
     * 计费信息
     */
    private Charge charge;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 实例ID
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getCacheInstanceName() {
        return cacheInstanceName;
    }

    /**
     * set 实例名称
     *
     * @param cacheInstanceName
     */
    public void setCacheInstanceName(String cacheInstanceName) {
        this.cacheInstanceName = cacheInstanceName;
    }

    /**
     * get 实例规格代码，参见实例规格代码表
     *
     * @return
     */
    public String getCacheInstanceClass() {
        return cacheInstanceClass;
    }

    /**
     * set 实例规格代码，参见实例规格代码表
     *
     * @param cacheInstanceClass
     */
    public void setCacheInstanceClass(String cacheInstanceClass) {
        this.cacheInstanceClass = cacheInstanceClass;
    }

    /**
     * get 容量，单位MB
     *
     * @return
     */
    public Integer getCacheInstanceMemoryMB() {
        return cacheInstanceMemoryMB;
    }

    /**
     * set 容量，单位MB
     *
     * @param cacheInstanceMemoryMB
     */
    public void setCacheInstanceMemoryMB(Integer cacheInstanceMemoryMB) {
        this.cacheInstanceMemoryMB = cacheInstanceMemoryMB;
    }

    /**
     * get 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，deleting：删除中
     *
     * @return
     */
    public String getCacheInstancStatus() {
        return cacheInstancStatus;
    }

    /**
     * set 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，deleting：删除中
     *
     * @param cacheInstancStatus
     */
    public void setCacheInstancStatus(String cacheInstancStatus) {
        this.cacheInstancStatus = cacheInstancStatus;
    }

    /**
     * get 实例描述
     *
     * @return
     */
    public String getCacheInstanceDescription() {
        return cacheInstanceDescription;
    }

    /**
     * set 实例描述
     *
     * @param cacheInstanceDescription
     */
    public void setCacheInstanceDescription(String cacheInstanceDescription) {
        this.cacheInstanceDescription = cacheInstanceDescription;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get az信息
     *
     * @return
     */
    public AzId getAzId() {
        return azId;
    }

    /**
     * set az信息
     *
     * @param azId
     */
    public void setAzId(AzId azId) {
        this.azId = azId;
    }

    /**
     * get 所属VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 所属子网的ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get 访问域名
     *
     * @return
     */
    public String getConnectionDomain() {
        return connectionDomain;
    }

    /**
     * set 访问域名
     *
     * @param connectionDomain
     */
    public void setConnectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
    }

    /**
     * get 端口
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * get 计费信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }


    /**
     * set 实例ID
     *
     * @param cacheInstanceId
     */
    public CacheInstance cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param cacheInstanceName
     */
    public CacheInstance cacheInstanceName(String cacheInstanceName) {
        this.cacheInstanceName = cacheInstanceName;
        return this;
    }

    /**
     * set 实例规格代码，参见实例规格代码表
     *
     * @param cacheInstanceClass
     */
    public CacheInstance cacheInstanceClass(String cacheInstanceClass) {
        this.cacheInstanceClass = cacheInstanceClass;
        return this;
    }

    /**
     * set 容量，单位MB
     *
     * @param cacheInstanceMemoryMB
     */
    public CacheInstance cacheInstanceMemoryMB(Integer cacheInstanceMemoryMB) {
        this.cacheInstanceMemoryMB = cacheInstanceMemoryMB;
        return this;
    }

    /**
     * set 实例状态，running：运行，error：错误，creating：创建中，changing：变配中，deleting：删除中
     *
     * @param cacheInstancStatus
     */
    public CacheInstance cacheInstancStatus(String cacheInstancStatus) {
        this.cacheInstancStatus = cacheInstancStatus;
        return this;
    }

    /**
     * set 实例描述
     *
     * @param cacheInstanceDescription
     */
    public CacheInstance cacheInstanceDescription(String cacheInstanceDescription) {
        this.cacheInstanceDescription = cacheInstanceDescription;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public CacheInstance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set az信息
     *
     * @param azId
     */
    public CacheInstance azId(AzId azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public CacheInstance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public CacheInstance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set 访问域名
     *
     * @param connectionDomain
     */
    public CacheInstance connectionDomain(String connectionDomain) {
        this.connectionDomain = connectionDomain;
        return this;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public CacheInstance port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public CacheInstance charge(Charge charge) {
        this.charge = charge;
        return this;
    }


}