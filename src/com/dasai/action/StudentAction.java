package com.dasai.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.struts2.ServletActionContext;

import com.dasai.action.base.StudentBaseAction;
import com.dasai.service.StudentManager;
import com.dasai.vo.StudentBean;
import com.dasai.vo.WorkBean;
import com.opensymphony.xwork2.ActionContext;

public class StudentAction extends StudentBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception{
		return SUCCESS;
	}
	private String title;
	private String workType;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	private Map<String, Object> dataMap;
	
	
	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String submitWork() throws Exception{
		String realPath = ServletActionContext.getServletContext().getRealPath(this.getSavePath());
		String uniqueFileName = UUID.randomUUID().toString() + getUploadFileName().substring(getUploadFileName().lastIndexOf("."));
		FileOutputStream fos = new FileOutputStream(realPath + "\\" + uniqueFileName);
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[1024];
		int len = 0;
		while((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		WorkBean workBean = new WorkBean();
		ActionContext ctx = ActionContext.getContext();
		workBean.setOwner((String)(ctx.getSession().get("username")));
		workBean.setTitle(this.getTitle());
		workBean.setWorkType(this.getWorkType());
		workBean.setFilePath(uniqueFileName);
		studentManager.addWork(workBean);
		dataMap = new HashMap<String, Object>();
		dataMap.put("status", "20000");
		return SUCCESS;
	}
	private String name;
	private String studentId;
	private String college;
	private String grade;
	private String tel;
	private String bankCardId;
	private String otherInfo;
	
	public String updateStudentInfo() throws Exception{
		ActionContext ctx = ActionContext.getContext();
		String username = (String)ctx.getSession().get("userType");
		StudentBean studentBean = new StudentBean();
		studentBean.setUsername(username);
		studentBean.setName(name);
		studentBean.setStudentId(studentId);
		studentBean.setCollege(college);
		studentBean.setGrade(grade);
		studentBean.setTel(tel);
		studentBean.setBankCardId(bankCardId);
		studentBean.setOtherInfo(otherInfo);
		if(studentManager.updateStudentInfo(studentBean)) {
			this.dataMap.put("status", "20000");
		}else {
			this.dataMap.put("status", "10003");
		}
		return "success";
	}
}
