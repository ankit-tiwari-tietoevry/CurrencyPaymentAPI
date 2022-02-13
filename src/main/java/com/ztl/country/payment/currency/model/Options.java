package com.ztl.country.payment.currency.model;

public class Options {
    public int minimumPartnerValue;
    public String requireProofOfPayment;
    public Object supportInstantTransfer;
    public String defaultMinimumAvailable;
    public int limitValue;
    public int minimumOrderValue;
    public int minimumTransferValue;
    public String orderMinimumValue;
    public String transferMinimumValue;
    public String unverifiedMaximum;
    public String withdrawalMaximum;
    public String withdrawalThreshold;
    public String riskLevel;

    public int getMinimumPartnerValue() {
        return minimumPartnerValue;
    }

    public void setMinimumPartnerValue(int minimumPartnerValue) {
        this.minimumPartnerValue = minimumPartnerValue;
    }

    public String getRequireProofOfPayment() {
        return requireProofOfPayment;
    }

    public void setRequireProofOfPayment(String requireProofOfPayment) {
        this.requireProofOfPayment = requireProofOfPayment;
    }

    public Object getSupportInstantTransfer() {
        return supportInstantTransfer;
    }

    public void setSupportInstantTransfer(Object supportInstantTransfer) {
        this.supportInstantTransfer = supportInstantTransfer;
    }

    public String getDefaultMinimumAvailable() {
        return defaultMinimumAvailable;
    }

    public void setDefaultMinimumAvailable(String defaultMinimumAvailable) {
        this.defaultMinimumAvailable = defaultMinimumAvailable;
    }

    public int getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(int limitValue) {
        this.limitValue = limitValue;
    }

    public int getMinimumOrderValue() {
        return minimumOrderValue;
    }

    public void setMinimumOrderValue(int minimumOrderValue) {
        this.minimumOrderValue = minimumOrderValue;
    }

    public int getMinimumTransferValue() {
        return minimumTransferValue;
    }

    public void setMinimumTransferValue(int minimumTransferValue) {
        this.minimumTransferValue = minimumTransferValue;
    }

    public String getOrderMinimumValue() {
        return orderMinimumValue;
    }

    public void setOrderMinimumValue(String orderMinimumValue) {
        this.orderMinimumValue = orderMinimumValue;
    }

    public String getTransferMinimumValue() {
        return transferMinimumValue;
    }

    public void setTransferMinimumValue(String transferMinimumValue) {
        this.transferMinimumValue = transferMinimumValue;
    }

    public String getUnverifiedMaximum() {
        return unverifiedMaximum;
    }

    public void setUnverifiedMaximum(String unverifiedMaximum) {
        this.unverifiedMaximum = unverifiedMaximum;
    }

    public String getWithdrawalMaximum() {
        return withdrawalMaximum;
    }

    public void setWithdrawalMaximum(String withdrawalMaximum) {
        this.withdrawalMaximum = withdrawalMaximum;
    }

    public String getWithdrawalThreshold() {
        return withdrawalThreshold;
    }

    public void setWithdrawalThreshold(String withdrawalThreshold) {
        this.withdrawalThreshold = withdrawalThreshold;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }


}
