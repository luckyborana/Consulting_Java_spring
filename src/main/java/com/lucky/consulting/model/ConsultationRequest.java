package com.lucky.consulting.model;

public class ConsultationRequest {
    private String clientName;
    private String companyEmail;
    private String companyName;
    private String engagementType;
    private String message;

    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }

    public String getCompanyEmail() { return companyEmail; }
    public void setCompanyEmail(String companyEmail) { this.companyEmail = companyEmail; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getEngagementType() { return engagementType; }
    public void setEngagementType(String engagementType) { this.engagementType = engagementType; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
