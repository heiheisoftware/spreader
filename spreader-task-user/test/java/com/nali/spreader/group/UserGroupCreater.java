//package com.nali.spreader.group;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.nali.spreader.config.Range;
//import com.nali.spreader.constants.Website;
//import com.nali.spreader.group.assembler.UserGroupAssembler;
//import com.nali.spreader.group.exception.AssembleException;
//import com.nali.spreader.group.exp.OldPropertyExpressionDTO;
//import com.nali.spreader.group.exp.PropertyExpressionDTO;
//import com.nali.spreader.group.meta.UserGroupType;
//import com.nali.spreader.model.UserGroup;
//
//public class UserGroupCreater {
//	
////	@Autowired
////	private UserGroupAssembler userGroupAssembler;
//	
//	public UserGroup createArticlesUserGroup() throws AssembleException {
//		PropertyExpressionDTO propertyExpressionDTO = new PropertyExpressionDTO();
//		
//		Range<Long> articles = new Range<Long>();
//		articles.setGte(1L);
//		propertyExpressionDTO.setArticles(articles);
//		
//		UserGroup userGroup = this.userGroupAssembler.assembleUserGroup(Website.weibo, "文章分组", "文章用户分组", UserGroupType.dynamic, propertyExpressionDTO);
//		return userGroup;
//	}
//	
//	public UserGroup createFansUserGroup() throws AssembleException {
//		OldPropertyExpressionDTO propertyExpressionDTO = new OldPropertyExpressionDTO();
//		Range<Long> fans = new Range<Long>();
//		fans.setLte(1000l);
//		UserGroup userGroup = this.userGroupAssembler.assembleUserGroup(Website.weibo, "文章分组", "文章用户分组", UserGroupType.dynamic, propertyExpressionDTO);
//		return userGroup;
//	}
//}
