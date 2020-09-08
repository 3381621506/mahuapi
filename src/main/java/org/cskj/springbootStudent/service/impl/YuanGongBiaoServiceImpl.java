package org.cskj.springbootStudent.service.impl;

import java.util.List;

import org.cskj.springbootStudent.bean.YuanGongBiao;
import org.cskj.springbootStudent.mapper.YuanGongBiaoMapper;
import org.cskj.springbootStudent.service.YuanGongBiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class YuanGongBiaoServiceImpl implements YuanGongBiaoService{
	@Autowired
	private YuanGongBiaoMapper ym;

	public List<YuanGongBiao> queryBiaoAll() {
		// TODO Auto-generated method stub
		return ym.queryBiaoAll();
	}

	@Override
	public int addBiao(YuanGongBiao yuanGongBiao) {
		// TODO Auto-generated method stub
		return ym.addBiao(yuanGongBiao);
	}

}
