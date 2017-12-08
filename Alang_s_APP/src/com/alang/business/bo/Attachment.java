package com.alang.business.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alang.business.constant.AttachmentType;
@Table(name="ATTACHMENT")
@Entity
public class Attachment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String attachementId;
	@Column
	private String attachmentName;
	@Column
	private AttachmentType attachmentType;
	@Column
	private double attachmentSize;
	@Column
	private String attachmentDesc;
	public String getAttachementId() {
		return attachementId;
	}
	public void setAttachementId(String attachementId) {
		this.attachementId = attachementId;
	}
	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public AttachmentType getAttachmentType() {
		return attachmentType;
	}
	public void setAttachmentType(AttachmentType attachmentType) {
		this.attachmentType = attachmentType;
	}
	public double getAttachmentSize() {
		return attachmentSize;
	}
	public void setAttachmentSize(double attachmentSize) {
		this.attachmentSize = attachmentSize;
	}
	public String getAttachmentDesc() {
		return attachmentDesc;
	}
	public void setAttachmentDesc(String attachmentDesc) {
		this.attachmentDesc = attachmentDesc;
	}
	
	

}
