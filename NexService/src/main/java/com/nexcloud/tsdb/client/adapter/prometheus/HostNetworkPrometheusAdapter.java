/*
* Copyright 2019 NexCloud Co.,Ltd.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.nexcloud.tsdb.client.adapter.prometheus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nexcloud.tsdb.adapter.HostNetworkAdapter;
import com.nexcloud.tsdb.client.prometheus.PrometheusClient;

@Component
public class HostNetworkPrometheusAdapter implements HostNetworkAdapter {
	@Autowired private PrometheusClient prometheusClient;

	public String getNetworkRxbyte(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}

	public String getNetworkRxdrop(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkRxerror(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkRxoverrun(String hostIp, String interfaceId, String startTime, String time, int limit){
		return null;
	}
	
	public String getNetworkRxpacket(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkTxbyte(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkTxdrop(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkTxerror(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkTxoverrun(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkTxpacket(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkTxcarrier(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkTxcollision(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
	
	public String getNetworkSpeed(String hostIp, String interfaceId, String startTime, String time, int limit) {
		return null;
	}
}
