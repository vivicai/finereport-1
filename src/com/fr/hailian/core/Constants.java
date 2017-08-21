package com.fr.hailian.core;
/**
 * 
 * @className Constants.java
 * @time   2017年8月7日 下午4:46:36
 * @author zuoqb
 * @todo   系统常量
 */
public class Constants {
	public static final long AUXILIARYROLE_ID = 7;//辅助决策需要的角色ID
	public static final String AUXILIARYROLE_NAME = "XBY_BI";//辅助决策需要的角色名称
	public static final String PORTAL_FROM="NWH5ABF13158";//userValidate的参数FROM
	public static final String ENCODE_RULES="hailian88888888finereport201708";//对称加密 加密规则
	public static final String RTX_AUTH_SERVER_ID="Bi";//发送消息的系统 即授权ID
	/**
	 * 对外发布的webservice端口号 不能与finereport端口一致
	 * 测试是否发布成功
	 * http://ip:8888/Service/TaskWebService?wsdl
	 * 入参格式：{"Flag":"1","Page":1,"Pagesize":10,"Type":"1","Uid":"47"}
	 */
	public static final String WebService_Port = "8888";
	public static final String DEFAULT_PWD = "123456";//导入员工的默认密码
	public static final String DEFAULT_POST= "53";//导入员工的默认职务ID FR_T_POST
	/**
	 * 数据库配置
	 */
	public static final String driverclass = "com.fr.third.org.hsqldb.jdbcDriver";
	public static final String url = "emb:jdbc:hsqldb:file:F:\\FineReport_8.0\\WebReport\\WEB-INF\\finedb\\db";
	public static final String username = "sa";
	public static final String password = "";
	
	public static final String CTX_DOMAIN="10.0.6.17";
	public static final String CTX_PATH = "";//帆软项目根目录
	public static final String CTX_PORT = "80";//帆软项目端口
}
