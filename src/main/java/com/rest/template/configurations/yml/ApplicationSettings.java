package com.rest.template.configurations.yml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "application")
public class ApplicationSettings {

	private String baseUrl;
	
	private String encryptionKey;
	
	private Boolean allowSchedule;
	
	private String logPath;
	
	private String reportPath;
	
	private String errorReceiverEmail;

	private String admUrl;
	
	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public Boolean getAllowSchedule() {
		return allowSchedule;
	}

	public void setAllowSchedule(Boolean allowSchedule) {
		this.allowSchedule = allowSchedule;
	}

	public String getLogPath() {
		return logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
	}

	public String getErrorReceiverEmail() {
		return errorReceiverEmail;
	}

	public void setErrorReceiverEmail(String errorReceiverEmail) {
		this.errorReceiverEmail = errorReceiverEmail;
	}

	public String getAdmUrl() {
		return admUrl;
	}

	public void setAdmUrl(String admUrl) {
		this.admUrl = admUrl;
	}

	public String getReportPath() {
		return reportPath;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}
}
