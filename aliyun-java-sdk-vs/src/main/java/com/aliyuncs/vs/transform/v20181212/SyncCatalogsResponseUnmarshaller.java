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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.SyncCatalogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncCatalogsResponseUnmarshaller {

	public static SyncCatalogsResponse unmarshall(SyncCatalogsResponse syncCatalogsResponse, UnmarshallerContext _ctx) {
		
		syncCatalogsResponse.setRequestId(_ctx.stringValue("SyncCatalogsResponse.RequestId"));
		syncCatalogsResponse.setId(_ctx.stringValue("SyncCatalogsResponse.Id"));
	 
	 	return syncCatalogsResponse;
	}
}