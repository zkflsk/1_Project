package com.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.web.vo.GroupVO;
import com.web.vo.PartyMember;

@Mapper
public interface PartyMapper {
	public void insertbyaccount(PartyMember partyMember);
	
	public List<GroupVO> selectPeoplecnt();
	
	public GroupVO selectPeoplecntList(int seq);
	
	public void groupInsert(GroupVO groupVO);
	

}