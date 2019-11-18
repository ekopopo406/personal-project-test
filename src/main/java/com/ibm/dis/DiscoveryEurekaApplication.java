/*
 * @Description: In User Settings Edit
 * @Author: your name
 * @Date: 2019-08-12 13:44:59
 * @LastEditTime: 2019-08-12 20:22:56
 * @LastEditors: Please set LastEditors
 */
package com.ibm.dis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryEurekaApplication.class, args);
	}
}
