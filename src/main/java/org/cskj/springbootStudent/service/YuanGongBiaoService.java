package org.cskj.springbootStudent.service;

import java.util.List;

import org.cskj.springbootStudent.bean.YuanGongBiao;

public interface YuanGongBiaoService {
	List<YuanGongBiao> queryBiaoAll();

	int addBiao(YuanGongBiao yuanGongBiao);
	
}
