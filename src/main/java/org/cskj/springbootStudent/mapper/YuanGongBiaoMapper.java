package org.cskj.springbootStudent.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cskj.springbootStudent.bean.YuanGongBiao;

@Mapper
public interface YuanGongBiaoMapper {
	List<YuanGongBiao> queryBiaoAll();
	int addBiao(YuanGongBiao yuanGongBiao);
}
