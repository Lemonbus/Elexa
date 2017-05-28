package elexa.utils;

/**
	 * 
	 * Created on May 27, 2017 by Jeremy Gooch.
	 * 
	 */

public class Report {
	
	private static int reportCount = 0;
	
	private int reportNumber;
	
	private String reporterUUID;
	
	private String reportedUUID;
	
	private String detailedInfo;
	
	private ReportType reportType;
	
	private String[] assignedStaffUUIDs;
	
	private boolean resolved;
	
	public Report(String reporterUUID, String reportedUUID, String detailedInfo, ReportType reportType, String[] assignedStaffUUIDs, boolean resolved) {
		
		reportCount += 1;
		
		reportNumber = reportCount;
		
		this.reporterUUID = reporterUUID;
		this.reportedUUID = reportedUUID;
		this.detailedInfo = detailedInfo;
		this.reportType = reportType;
		this.assignedStaffUUIDs = assignedStaffUUIDs;
		this.resolved = resolved;
		
	}
	
	public int getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(int reportNumber) {
		this.reportNumber = reportNumber;
	}

	public String getReporterUUID() {
		return reporterUUID;
	}

	public void setReporterUUID(String reporterUUID) {
		this.reporterUUID = reporterUUID;
	}

	public String getReportedUUID() {
		return reportedUUID;
	}

	public void setReportedUUID(String reportedUUID) {
		this.reportedUUID = reportedUUID;
	}

	public String getDetailedInfo() {
		return detailedInfo;
	}

	public void setDetailedInfo(String detailedInfo) {
		this.detailedInfo = detailedInfo;
	}

	public ReportType getReportType() {
		return reportType;
	}

	public void setReportType(ReportType reportType) {
		this.reportType = reportType;
	}

	public String[] getAssignedStaffUUIDs() {
		return assignedStaffUUIDs;
	}

	public void setAssignedStaffUUIDs(String[] assignedStaffUUIDs) {
		this.assignedStaffUUIDs = assignedStaffUUIDs;
	}

	public boolean isResolved() {
		return resolved;
	}

	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	
}
