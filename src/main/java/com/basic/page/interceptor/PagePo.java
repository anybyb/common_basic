package com.basic.page.interceptor;
import java.util.List;

import org.apache.commons.lang3.StringUtils;


/**
 * 返回给前端的分页信息
 * 包括 数据集合和总条数
 * @author Administrator
 *
 */
public class PagePo {

	    //结果集
		public List<?> rows = null;
	
		//总条数
	    public long total = 0;
	    
	    public String message;	//后台返回给前端页面显示的信息
	    public boolean haveMessage = false;	//是否有后台消息返回到前端页面

		public boolean getHaveMessage() {
          if(!StringUtils.isBlank(message)){
        	  return true;
		    }
			return haveMessage;
		}

		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public long getTotal() {
			return total;
		}
		public void setTotal(long total) {
			this.total = total;
		}
		
	    public List<?> getRows() {
			return rows;
		}
		public void setRows(List<?> rows) {
			this.rows = rows;
		}

		public static  PagePo getPagePo(List list){
			PagePo pagePo = new PagePo();
			pagePo.setTotal(PageThreadLocal.getTotal());
			pagePo.setRows(list);
			return pagePo;
		}
		
	   
} 
