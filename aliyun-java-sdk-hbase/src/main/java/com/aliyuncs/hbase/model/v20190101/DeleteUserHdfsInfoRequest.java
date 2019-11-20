/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteUserHdfsInfoRequest extends RpcAcsRequest<DeleteUserHdfsInfoResponse> {
	   

	private String clusterId;

	private String nameService;
	public DeleteUserHdfsInfoRequest() {
		super("HBase", "2019-01-01", "DeleteUserHdfsInfo", "hbase");
		setMethod(MethodType.POST);
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getNameService() {
		return this.nameService;
	}

	public void setNameService(String nameService) {
		this.nameService = nameService;
		if(nameService != null){
			putQueryParameter("NameService", nameService);
		}
	}

	@Override
	public Class<DeleteUserHdfsInfoResponse> getResponseClass() {
		return DeleteUserHdfsInfoResponse.class;
	}

}
