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

package com.aliyuncs.scdn.model.v20171115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDomainTrafficDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDomainTrafficDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private List<DataModule> trafficDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getTrafficDataPerInterval() {
		return this.trafficDataPerInterval;
	}

	public void setTrafficDataPerInterval(List<DataModule> trafficDataPerInterval) {
		this.trafficDataPerInterval = trafficDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String trafficValue;

		private String httpTrafficValue;

		private String httpsTrafficValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getTrafficValue() {
			return this.trafficValue;
		}

		public void setTrafficValue(String trafficValue) {
			this.trafficValue = trafficValue;
		}

		public String getHttpTrafficValue() {
			return this.httpTrafficValue;
		}

		public void setHttpTrafficValue(String httpTrafficValue) {
			this.httpTrafficValue = httpTrafficValue;
		}

		public String getHttpsTrafficValue() {
			return this.httpsTrafficValue;
		}

		public void setHttpsTrafficValue(String httpsTrafficValue) {
			this.httpsTrafficValue = httpsTrafficValue;
		}
	}

	@Override
	public DescribeScdnDomainTrafficDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDomainTrafficDataResponseUnmarshaller.unmarshall(this, context);
	}
}