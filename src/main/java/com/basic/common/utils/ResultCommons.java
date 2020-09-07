package com.basic.common.utils;

/**
 * 返回数据的公用方法
 * @author wcc
 * @Date 2020年9月7日
 * @Description 
 *
 */
public class ResultCommons {
	
	/**
     * 定义为-1 表示客户端需要拿到这个值做一些跳转，比如头像视频没有完善，提示后要跳转
     */
    public static final int RESULT_TO_JUMP = -1;
	
	/**
	 * 执行失败时的状态码值：0
	 */
    public static final int RESULT_CODE_ERROR = 0;
    /**
     * 执行成功时的状态码值:1
     */
    public static final int RESULT_CODE_SUCCESS = 1;
    

	public static BasicResult getBasiResult() {
		BasicResult basiResult = new BasicResult();
		return basiResult;
	}
	
	/**
	 * 
	 * @param resultCode 返回状态码 默认是0
	 * @param resultMessage 错误信息，没有时传入null或者“”
	 * @param data 数据集合 为空时传入null或者""
	 */
	public static BasicResult  setResultMessage(Integer resultCode,String resultMessage,Object data) {
		BasicResult basiResult = new BasicResult();
		if(null == resultCode){
			basiResult.setResultCode(RESULT_CODE_ERROR);
		}else{
			basiResult.setResultCode(resultCode);
		}
		basiResult.setResultMessage(resultMessage);
		basiResult.setDataCollection(data);
	    return basiResult;	
	}
	
	
	/**
	 * 验证没有通过 或者出现错误时，可调用该方法<br>
	 * resultCode:0,data:null,message:(?)
	 * @param resultMessage 错误信息。
	 */
	public static BasicResult  setErrorMessage(String resultMessage) {
		BasicResult basiResult = new BasicResult();
		basiResult.setResultCode(RESULT_CODE_ERROR);
		basiResult.setResultMessage(resultMessage);
	    return basiResult;	
	}
	
	
	
	/**
	 * 操作成功后，有数据返回时调用该方法</br>
	 * resultCode : 1 ,data:null ,message :操作成功
	 * @return
	 */
	public static BasicResult  setSuccessMessage() {
		BasicResult basiResult = new BasicResult();
		basiResult.setResultCode(RESULT_CODE_SUCCESS);
		basiResult.setResultMessage("操作成功!");
		basiResult.setDataCollection(null);	
	    return basiResult;	
	}
	
	
	/**
	 * 操作成功后，有数据返回时调用该方法</br>
	 * resultCode : 1 ,data:(？) ,message :操作成功
	 * @param data 返回的数据集 
	 * @return
	 */
	public static BasicResult  setSuccessMessage(Object data) {
		BasicResult basiResult = new BasicResult();
		basiResult.setResultCode(RESULT_CODE_SUCCESS);
		basiResult.setResultMessage("操作成功!");
		basiResult.setDataCollection(data);	
	    return basiResult;	
	}
	
	
	/**
	 * 操作成功后，有数据返回时调用该方法</br>
	 *  resultCode : 1 ,data:(？) ,message :(？)
	 * @param resultMessage 信息提示
	 * @param data 返回的数据集 
	 * @return
	 */
	public static BasicResult  setSuccessMessage(String resultMessage,Object data) {
		BasicResult basiResult = new BasicResult();
		basiResult.setResultCode(RESULT_CODE_SUCCESS);
		basiResult.setResultMessage(resultMessage);
		basiResult.setDataCollection(data);	
	    return basiResult;	
	}
	
	
	
}
