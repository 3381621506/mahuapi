package org.cskj.springbootStudent.controller;

import java.util.Date;
import java.util.List;

import org.cskj.springbootStudent.bean.YuanGongBiao;
import org.cskj.springbootStudent.service.YuanGongBiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class YuanGongBiaoController {
	@Autowired
	private YuanGongBiaoService ys;
	@GetMapping(value="queryBiaoAll")
	public List<YuanGongBiao> queryBiaoAll(){
		List<YuanGongBiao> list= ys.queryBiaoAll();
		System.out.println("3344");
		return list;
		
	}
	@PostMapping(value="addBiao")
	public boolean addBiao(@RequestBody YuanGongBiao yuanGongBiao) {
		return ys.addBiao(yuanGongBiao) > 0 ? true : false;
	}
}
