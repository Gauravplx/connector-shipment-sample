package com.fareye.process.shipment.connector.Domain;

import com.fareye.process.shipment.connector.utils.DateTimeDeserializer;
import com.fareye.process.shipment.connector.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;


import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class ProcessDomain  implements Serializable {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("reference_number")
    private String referenceNumber;

    @JsonProperty("company_id")
    private Long companyId;

    @JsonProperty("process_master_id")
    private Long processMasterId;

    @JsonProperty("process_version_id")
    private Long processVersionId;

    @JsonProperty("current_flow_code")
    private JsonNode currentFlowCode;

    @JsonProperty("created_at")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private DateTime createdAt;

    @JsonProperty("last_updated_at")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private DateTime lastUpdatedAt;

    @JsonProperty("status")
    private String status;

    @JsonProperty("current_hub_id")
    private Long currentHubId;

    @JsonProperty("merchant_code")
    private String merchantCode;

    @JsonProperty("current_position")
    private String currentPosition;

    @JsonProperty("amount_collect")
    private Double amountCollected;

    @JsonProperty("amount_tobe_collected")
    private Double amountToBeCollected;

    @JsonProperty("process_start_date")
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    private DateTime processStartDate;

    @JsonProperty("is_locked")
    private Boolean isLocked;

    @JsonProperty("sub_process_grouped_by")
    private String subProcessGroupedBy;

    @JsonProperty("misroute_hub_id")
    private Long misRouteHuId;

    @JsonProperty("process_data")
    private String processData;

    @JsonProperty("jobDtoList")
    private String jobList;

    @JsonProperty("processStatusLogs")
    private String processStatusLogs;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getProcessMasterId() {
        return processMasterId;
    }

    public void setProcessMasterId(Long processMasterId) {
        this.processMasterId = processMasterId;
    }

    public Long getProcessVersionId() {
        return processVersionId;
    }

    public void setProcessVersionId(Long processVersionId) {
        this.processVersionId = processVersionId;
    }

    public JsonNode getCurrentFlowCode() {
        return currentFlowCode;
    }

    public void setCurrentFlowCode(JsonNode currentFlowCode) {
        this.currentFlowCode = currentFlowCode;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DateTime getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(DateTime lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCurrentHubId() {
        return currentHubId;
    }

    public void setCurrentHubId(Long currentHubId) {
        this.currentHubId = currentHubId;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Double getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(Double amountCollected) {
        this.amountCollected = amountCollected;
    }

    public Double getAmountToBeCollected() {
        return amountToBeCollected;
    }

    public void setAmountToBeCollected(Double amountToBeCollected) {
        this.amountToBeCollected = amountToBeCollected;
    }

    public DateTime getProcessStartDate() {
        return processStartDate;
    }

    public void setProcessStartDate(DateTime processStartDate) {
        this.processStartDate = processStartDate;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public String getSubProcessGroupedBy() {
        return subProcessGroupedBy;
    }

    public void setSubProcessGroupedBy(String subProcessGroupedBy) {
        this.subProcessGroupedBy = subProcessGroupedBy;
    }

    public Long getMisRouteHuId() {
        return misRouteHuId;
    }

    public void setMisRouteHuId(Long misRouteHuId) {
        this.misRouteHuId = misRouteHuId;
    }

    public String getProcessData() {
        return processData;
    }

    public void setProcessData(String processData) {
        this.processData = processData;
    }

    public String getJobList() {
        return jobList;
    }

    public void setJobList(String jobList) {
        this.jobList = jobList;
    }

    public String getProcessStatusLogs() {
        return processStatusLogs;
    }

    public void setProcessStatusLogs(String processStatusLogs) {
        this.processStatusLogs = processStatusLogs;
    }


    @Override
    public String toString() {
        return "Process{" +
                "id=" + id +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", companyId=" + companyId +
                ", processMasterId=" + processMasterId +
                ", processVersionId=" + processVersionId +
                ", currentFlowCode='" + currentFlowCode + '\'' +
                ", createdAt=" + createdAt +
                ", lastUpdatedAt=" + lastUpdatedAt +
                ", status='" + status + '\'' +
                ", currentHubId=" + currentHubId +
                ", merchantCode='" + merchantCode + '\'' +
                ", currentPosition='" + currentPosition + '\'' +
                ", amountCollected=" + amountCollected +
                ", amountToBeCollected=" + amountToBeCollected +
                ", processStartDate=" + processStartDate +
                ", isLocked=" + isLocked +
                ", subProcessGroupedBy='" + subProcessGroupedBy + '\'' +
                ", misRouteHuId=" + misRouteHuId +
                '}';
    }



}