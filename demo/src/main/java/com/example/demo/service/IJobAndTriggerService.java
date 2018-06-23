package com.example.demo.service;


import com.example.demo.entity.JobAndTrigger;
import com.github.pagehelper.PageInfo;

public interface IJobAndTriggerService {
	/**
	* @Description: 获取调度任务信息
	* @Author: zhang_cq
	* @Date: 2018/6/22 下午4:13
	*/
	PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
