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

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;

/**
 * backupSpec
 */
public class BackupSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备份名称，缺省为系统分配一个随机名称
     */
    private String backupName;

    /**
     * dbNames
     */
    private List<String> dbNames;


    /**
     * get 备份名称，缺省为系统分配一个随机名称
     *
     * @return
     */
    public String getBackupName() {
        return backupName;
    }

    /**
     * set 备份名称，缺省为系统分配一个随机名称
     *
     * @param backupName
     */
    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    /**
     * get dbNames
     *
     * @return
     */
    public List<String> getDbNames() {
        return dbNames;
    }

    /**
     * set dbNames
     *
     * @param dbNames
     */
    public void setDbNames(List<String> dbNames) {
        this.dbNames = dbNames;
    }


    /**
     * set 备份名称，缺省为系统分配一个随机名称
     *
     * @param backupName
     */
    public BackupSpec backupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * set dbNames
     *
     * @param dbNames
     */
    public BackupSpec dbNames(List<String> dbNames) {
        this.dbNames = dbNames;
        return this;
    }


    /**
     * add item to dbNames
     *
     * @param dbName
     */
    public void addDbName(String dbName) {
        if (this.dbNames == null) {
            this.dbNames = new ArrayList<>();
        }
        this.dbNames.add(dbName);
    }

}